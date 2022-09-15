$(document).ready(function () {
  $("button").attr("disabled", true);

  loadAvengers();

  $("#select-avengers").change(() => {

    if (document.getElementById("select-avengers").value == "-") {
      $("#card-img-avenger").attr("src", "data/img/avengers-logo.png");
      $("button").attr("disabled", true);
    }
    
    else if (document.getElementById("select-avengers").value !== "-") {
      $("button").attr("disabled", false);
      showAvengerDetail();
    }
  });

  $("#btn-show-details").click(() => {showAvengerDetail();});
  
});

function loadAvengers() {
  $("#card-img-avenger").attr("src", "data/img/avengers-logo.png");
  
  $.getJSON("data/avengers.json", (data) => {
    data.avengers.forEach((element) => {
      let names = `<option>${element.name}</option>`;
      $("#select-avengers").append(names);
    });
  });
}

function showAvengerDetail() {
  
  $.getJSON("data/avengers.json", (data) => {
    data.avengers.forEach((element) => {
      if (document.getElementById("select-avengers").value == element.name) {
        $("#card-img-avenger").attr("src", `data/img/${element.image}`);
      }
    });
  });
}
/*
      the way I implemented the loading of the pictures
      the button is prettymuch irrelevant as it is instantly
      loaded when the user selects a name/avenger

      the button only reloads the page on the click event
*/