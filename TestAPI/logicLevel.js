var httpLevel = require('./httpLevel.js');  // link into the httpLevel
var cacheLevel = require('./cacheLevel.js'); // link into the cacheLevel
var maps = require('./mapsapi.js'); // link into the mapsapi handler

exports.getAddress = function(req, callback)
{
  maps.geocode(req.params.address, callback); // calls maps.geocode from the req address parameter and passes on the callback
}
