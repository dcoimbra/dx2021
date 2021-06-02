# dx2021

## Getting Started

1. Install prerequisites

* tensorflow
  ```sh
  pip install tensorflow
  ```

2. Clone the repo
   ```sh
   git clone https://github.com/dcoimbra/dx2021.git
   ```

## Extract path-contexts
The data is in the `astminer/dataset` folder. The dataset is already split into three .jsonl files, for training, validation and testing.

1. Compile `astminer`
   ```sh
   cd astminer
   ./gradlew shadowJar
   ```

2. Extract path-contexts for each dataset split. It will take some time.
  ```sh
  ./cli.sh test
  ./cli.sh valid
  ./cli.sh train
  ```
  
Path-contexts will be extracted into the `code2vec` folder, into the files `devign.train.raw.txt`, `devign.test.raw.txt`, `devign.valid.raw.txt`.
  
## Train the model

1. Preprocess the data into the code2vec format
  ```sh
  cd ../code2vec
  source preprocess.sh
  ```
  
2. Train
  ```sh
  ./train.sh
  ```
  
 ## Evaluate the model
 1. Once the F1 score on the validation set stops improving over time, you can pick the iteration that performed the best on the validation set. Suppose that iteration #4 is our chosen model.
 
 2. Release the model
  ```sh
   python3 code2vec.py --load models/devign/saved_model_iter4 --release
  ```
 
 3. Run the evaluation script on the test data
  ```sh
  python3 code2vec.py --load models/devign/saved_model_iter4.release --test data/devign/devign.test.c2v
  ```
 
 ## Generating CodeXGLUE predictions
 Generates a predictions file as described in the [CodeXGLUE repository for the defect detection task](https://github.com/microsoft/CodeXGLUE/tree/main/Code-Code/Defect-detection).
 ```sh
 python prediction_outputter.py --load models/devign/saved_model_iter4.release # or your chosen iteration
 ```
 This will generate predictions for the test set. To generate predictions for the validation set, edit `prediction_outputter.py` and modify the global variables accordingly. 

## Acknowledgements
This work was supported in part by Fundação para a Ciencia e a Tecnologia (FCT) under Grants CMU/TIC/0064/2019 (a project funded by the Carnegie Mellon Portugal Program) and UIDB/50021/2020.
