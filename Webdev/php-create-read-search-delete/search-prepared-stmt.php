<?php
// required headers
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

if (isset($_GET["s"])) {

  require '../../dbConnect.php';

  // read the value from the key s (param from the URL)
  $search_value = $_GET["s"];

  // 1.Step: Create the select statement
  $select_query = "SELECT p.id, p.interpret, p.title, COALESCE(g.name, '-') AS genre
                    FROM playlist p LEFT JOIN genre g ON p.genre = g.id
                    WHERE p.interpret LIKE :search OR p.title LIKE :search;";

  // PROBLEM!!!!
  // $search = '%$search_value%';     // NO RESULT!!!!!
  $search = "%$search_value%";

  // 2.Step: prepare the statement in the DB
  $result = $conn->prepare($select_query);
  $result->bindParam(':search', $search);
  $result->execute();  
  $result->setFetchMode(PDO::FETCH_ASSOC);

  // 3.Step: read the answer (rows) from the DB
  $rows = $result->fetchAll(); // means that the result will be an associative array

  // 4.Step: set the response code and send JSON back
  http_response_code(200);
  echo json_encode($rows);

  $conn = null;

  // Test the API Route
  // http://localhost/2021/2ehif/jukebox-backend/api/playlist/search.php?s=david
  // http://localhost/2021/2ehif/jukebox-backend/api/playlist/search/david

} else {
  http_response_code(404);
		
  echo json_encode(
      array("message" => "page not found")
    );
}
