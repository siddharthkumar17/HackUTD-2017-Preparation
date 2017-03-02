var express = require('express');
var app = express();

var logicLevel = require('./logicLevel.js');

var getreq = null;
var getres = null;

app.get("/:address",function(req,res){
  getreq = req;
  getres = res;
  logicLevel.getAddress(req, sendGetResponse);
});

app.listen(8000,function(){
  console.log("Listening on port 8000");
});

function sendGetResponse(response)
{
  getres.send(response);
};
