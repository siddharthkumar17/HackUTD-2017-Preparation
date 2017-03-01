var express = require('express')
var app = express()

app.get("/:id",function(req,res){
  res.send(req.params.id);
})

app.listen(8000,function(){
  console.log("Listening on port 8000");
})
