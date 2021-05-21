var fs = require('fs'),

hserver = require('http').createServer(function(req,res){
		console.log('Serving: %s',req.url);
		var rs = fs.createReadStream(__dirname+req.url,{
			flags: 'r',
			autoClose: true
		});
}),
clients = [];
