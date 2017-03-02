var googleMapsClient = require('@google/maps').createClient({
    key: 'AIzaSyCtc1EU7_XRncEpHJiOKE9L3sY7CQZFvbs'
});



exports.geocode = function(address, callback)
{
  googleMapsClient.geocode({
      address: address
  }, function(err, response) {
      if (!err) {
          callback(response.json.results);
          console.log(response.json.results);
      }
      else {
        callback(err);
      }
  });
}
