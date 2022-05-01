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

# Moshe's changes
I've found this project to be a great starting point for experiments with code2vec and cpp. It had astminer and code2vec working together with cpp.
In addition, it made some optimizations to keep the memory footprint lower than the original code2vec.

However, the way it is done is completely hardcoded. The code is built to do one thing: process jsonl files {train, test, valid}.jsonl expecting to see C/C++ functions from devign dataset labeled as either safe or vuln; then run astminer on these specific files; then run code2vec expecting to get the information in the exact files named devign.{train, test, valid}.raw.txt and store the model in models/devign. The scoring was also hardcoded to be binary classification. Lastly, the prediction_outputter.py was hardcoded to the devign JSONL fields.

Our goal is to train the model with multiple classes and other datasets, as well as evaluating it on other data, not devign.
This original commit has the minimal changes required to achieve that.

As of now, the {train, test, valid}.jsonl contain funcions from FFMpeg, openssl, and vlc instead of the original ones.

So, follow all the steps above.
In order to evaluate on additional dataset (e.g. wolf) do the following:
1. Clone the code from GitHub (e.g. to /mnt/d/GitHub_Clones/scripts/C_Dataset/test)
2. Run cpp2jsonl.py to extract the functions:
```sh
  python ./cpp2jsonl.py -l /mnt/d/GitHub_Clones/scripts/C_Dataset/test -jl wolf.jsonl
  cp ./wolf.jsonl ~/dx2021/astminer/dataset/
```
3. Extract the contexts for the test set using astminer's cli.sh
```sh
  cd astminer
  ./cli.sh wolf
```
4. Get the predictions by running prediction_outputter.py with the model of your choice
```sh
  cd ../code2vec
  python prediction_outputter.py --load models/devign/saved_model_iter6.release --set-name wolf
```

I know that the hardcoding sucks and will change it, but I want first to save a working state

