<?php
// required headers
header("Access-Control-Allow-Origin: *");

if (isset($_POST["interpret"])) {

	require '../../dbConnect.php';

	// TODO - check if index exists!!!
	$interpret = $_POST["interpret"];
	$title = $_POST["title"];
	$genre = $_POST["genre"];		// empty field --> NULL

	if (empty($genre)) {
		// // PROBLEM --> 'null' !!!! Solution --> null !!!!
		$genre = null;
	}

	// echo "interpret: $interpret, title: $title";
	// $insert = "INSERT INTO playlist (interpret, title, genre)
	// 						VALUES ('$interpret', '$title', $genre)";

	// for prepared statement
	$insert = "INSERT INTO playlist (interpret, title, genre)
							VALUES (:interpret, :title, :genre)";

	// look if statement works, copy the statement from the browser to the database script
	// echo $insert;
	// send the insert to the database
	try {
		// $result = $conn->query($insert);		// true if it works, false if not
		$result = $conn->prepare($insert);		// send the statement to the db (without values from user!!!)

		// bind the values to the placehoder (param)
		$result->bindParam(':interpret', $interpret);
		$result->bindParam(':title', $title);
		$result->bindParam(':genre', $genre);

		// $result->debugDumpParams();

		// execute the statement on the database
		$result->execute();

		// close the db connection
		$conn = null;
	} catch (PDOException $e) {
		http_response_code(500);		// 5xx ---> Error on the server side!!!!

		// response with json
		// echo json_encode(
		// 	array("message" => "Something went wrong:" . $e->getMessage())
		// );
		echo json_encode(
			array("message" => "Something went wrong:" . $e->getMessage())
		);
	}


	if ($result) {
		http_response_code(201);		// 200 -> OK, 201 -> Created

		// response with json
		echo json_encode(
			array("message" => "Created")
		);
	}
} else {
	// set response code - 403  -Forbidden
	http_response_code(403);

	// tell the user error
	echo json_encode(
		array("message" => "No action")
	);
}
