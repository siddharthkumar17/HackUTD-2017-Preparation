var httpLevel = require('./example.js');
var maps = require('./mapsapi.js');

exports.getAddress = function(req, callback)
{
  maps.geocode(req.params.address, callback);
}
