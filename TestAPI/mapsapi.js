var googleMapsClient = require('@google/maps').createClient({ // create a google maps api client
    key: 'AIzaSyCtc1EU7_XRncEpHJiOKE9L3sY7CQZFvbs'
});



exports.geocode = function(address, callback) // calls the googleMaps geocode api
{
  googleMapsClient.geocode({      // call the geocode api
      address: address            // with the address parameter
  }, function(err, response) {
      if (!err) {                               // if we successfully got the geocode
          callback(response.json.results);      // call the callback passing the results
          console.log(response.json.results);   // and log the results for debug purposes
      }
      else {              // otherwise, we had an error!
        callback(err);    // call the callback with the error
        console.log(err); // and log the error for debug purposes
      }
  });
}
