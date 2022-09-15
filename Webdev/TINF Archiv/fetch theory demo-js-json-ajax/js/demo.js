// AJAX = Asynchronous JavaScript and XML.
// AJAX is the art of exchanging data with a server, and updating parts of a web page
// - without reloading the whole page.
// https://www.w3schools.com/jquery/jquery_ajax_intro.asp

// Reference jQuery AJAX Methods
// https://www.w3schools.com/jquery/jquery_ref_ajax.asp

$(document).ready(function () {
  // AJAX load
  // https://www.w3schools.com/jquery/jquery_ajax_load.asp
  // read the text from the file - with $(selector).load()
  $('#btn-load-txt').click(() => {
    // aufruf der load funktion
    $('.card-body').load('data/sometext.txt');
  });

  // AJAX get
  // https://www.w3schools.com/jquery/jquery_ajax_get_post.asp
  // read the text from the file - with $.get()
  $('#btn-get-txt').click(() => {
    // aufruf der load funktion
    $.get('data/sometext.txt', (data) => {
      console.log(data); // just to look whats in the file
      $('.card-body').txt(data);
    });
  });

  // AJAX ajax
  // read the text from the file - with $.ajax()
  // https://api.jquery.com/jquery.ajax/
  $('#btn-ajax-txt').click(() => {
    $.ajax({
      method: 'GET',
      url: 'data/sometext.txt',
    })
      .done((data) => {
        $('.card-body').html(data); // txt does not work!!!
      })
      .fail((error) => {
        alert('Error: ' + error.txt);
      });
  });

  // load heroes from json file - with $.getJSON()
  // https://www.w3schools.com/jquery/ajax_getjson.asp
  $.getJSON('data/superheroes.json', (data, status) => {
    console.log(data);
    console.log(status);
    // loop throw the array, get elements and write it into td
    console.log(data.superheroes);
    data.superheroes.forEach((element) => {
      let row = `<tr>
                    <td>${element.name}</td>
                    <td>${element.force}</td>
                    <td>${element.universe}</td>
                </tr>`;
      // add the row to tbody-file
      $('#tbody-file').append(row);
    });
  });

  // JavaScript fetch - plain JavaScript (without using jQuery)
  // https://www.w3schools.com/js/js_api_fetch.asp
  let response = fetch('data/superheroes.json')
    .then((response) => response.json()) // receive JSON from the file/url
    .then((data) => {
      // data has now the info from the file/url
      console.log(data);
      // loop throw the array, get elements and write it into td
      console.log(data.superheroes);
      data.superheroes.forEach((element) => {
        let row = `<tr>
                    <td>${element.name}</td>
                    <td>${element.force}</td>
                    <td>${element.universe}</td>
                </tr>`;
        // add the row to tbody-file
        $('#tbody-file-fetch').append(row);
      });
    });
});
