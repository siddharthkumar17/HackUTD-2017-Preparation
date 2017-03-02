var httpLevel = require('./httpLevel.js');
var cacheLevel = require('./cacheLevel.js');
var maps = require('./mapsapi.js');

exports.getAddress = function(req, callback)
{
  maps.geocode(req.params.address, callback);
}
