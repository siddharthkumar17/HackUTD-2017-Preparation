var express = require('express'); //Create a new express object
var app = express();  // And an app object for express
// This is our http handler, which will allow us to easily handle http requests

var logicLevel = require('./logicLevel.js');  // link into the logic level of the Api

var getreq = null;  // create a var for the get request
var getres = null;  // and one for its response

app.get("/:address",function(req,res){  // when user visits url: localhost:8000/Some Street Address Here
  getreq = req; // save the req
  getres = res; // and res objects
  logicLevel.getAddress(req, sendGetResponse); //pass into our logic level the request and the callback to send the response
});

app.listen(8000,function(){ // listen on port 8000
  console.log("Listening on port 8000"); // and log that it successfully started listening
});

function sendGetResponse(response) // This function sends an http response to the user
{
  getres.send(response);  // has the getres object send the response parameter
};
