$(document).ready(function() {

  $('#btn-random').click(() => {
    loadJokeFromApi();
  });

});

function loadJokeFromApi() {
  // done
  let address = 'http://geodb-free-service.wirefreethought.com/v1/geo/cities?hateoasMode=off';
  $.getJSON(address, (data, status) => {
    let s = data.value;
    $('#joke').html(s);
  });
}