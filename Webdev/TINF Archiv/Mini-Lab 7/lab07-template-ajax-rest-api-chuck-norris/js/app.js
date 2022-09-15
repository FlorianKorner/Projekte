$(document).ready(function() {

  $('#btn-random').click(() => {
    loadJokeFromApi();
  });

});


function loadJokeFromApi() {
  // done
  let address = 'https://api.chucknorris.io/jokes/random';
  $.getJSON(address, (data, status) => {
    let s = data.value;
    $('#joke').html(s);
    // $.getJSON(address, (data, status) => {
    //   $('#quote').html(<b>${data.anime}</b><br><i>${data.character}</i>: "${data.quote}");
    // });
  });
}