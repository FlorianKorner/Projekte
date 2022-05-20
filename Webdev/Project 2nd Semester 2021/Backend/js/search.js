$(document).ready(function () {
  showMusic();
});

function showMusic() {
  console.log($("#search-field").val());
  let url =
    "http://localhost/Project%202nd%20Semester%202021/Backend/PHP/stmts/search-prepared-stmt.php";
  var index = $("#content").attr("data-id");
  let postData = {
    s: $("#search-field").val(),
  };
  $.post(url, postData, (data) => {
    //console.log(data);
    var row = "";
    console.log(data);
    data.forEach((element, index) => {
      row += ` <h2>${element.S_Name}</h2><div class="embed embed-responsive embed-responsive-16by9">
      <iframe width="743" height="393" src="${element.URL}" 
      title="YouTube video player" frameborder="0"
      allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></div>
        <p>Views ${element.S_Views}</p>
        <h2>Lyrics</h2>
        <p>
         ${element.S_Description}
        </p>
        <h2>Artist/Band</h2>
        <p>${element.B_Name} has published his/it's first song <br>
        ${element.B_Creation_date} and has published ${element.B_Num_o_Published_Songs} <br>
        since then</p>
        
`;
    });

    $("#content").empty().append(row);
  });
}
