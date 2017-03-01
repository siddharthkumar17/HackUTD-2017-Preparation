var googleMapsClient = require('@google/maps').createClient({
    key: 'AIzaSyCtc1EU7_XRncEpHJiOKE9L3sY7CQZFvbs'
});

googleMapsClient.geocode({
    address: '1600 Amphitheatre Parkway, Mountain View, CA'
}, function(err, response) {
    if (!err) {
        console.log(response.json.results);
    }
});
