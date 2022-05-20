<?php
// required headers
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

require '../dbConnect.php';

if (isset($_POST["text"])) {

	//bands
	$B_Name = $_POST["B_Name"];
	$B_Creation_date = $_POST["B_Creation_date"];
	$B_Num_o_Published_Songs = $_POST["B_Num_o_Published_Songs"];

	//songs
	$B_Name = $_POST["S_Name"];
	$S_Description = $_POST["S_Description"];
	$URL = $_POST["URL"];
	$S_Views = $_POST["S_Views"];


	$insert_statement1 = "INSERT INTO `bands`(`B_Name`, `B_Creation_date`, `B_Num_o_Published_Songs`) 
							VALUES (:B_Name,:B_Creation_date,:B_Num_o_Published_Songs)";
	$result1 = $conn->prepare($insert_statement1);

	$insert_statement2 = "INSERT INTO `songs`(`S_Name`, `S_Description`, `URL`, `S_Views`) 
							VALUES (:S_Name,:S_Description,:URL,:S_Views)";
	$result2 = $conn->prepare($insert_statement2);

	//bands
	$result1->bindParam(':B_Name', $B_Name);
	$result1->bindParam(':B_Creation_date', $B_Creation_date);
	$result1->bindParam(":B_Num_o_Published_Songs", $B_Num_o_Published_Songs);

	//songs
	$result2->bindParam(":S_Name", $S_Name);
	$result2->bindParam(":S_Description", $S_Description);
	$result2->bindParam(":B_Num_o_Published_Songs", $B_Num_o_Published_Songs);
	$result2->bindParam(":URL", $URL);
	$result2->bindParam(":S_Views", $S_Views);

	$result1->execute();
	$result2->execute();

	if ($result1 /* && $result2*/) {
		echo json_encode(
			array("message" => "Created entry")
		);

	} else {
		echo json_encode(
			array("message" => "Creating entry failed!")
		);
	}
	http_response_code(200);
	$conn = null;
} else {
	echo json_encode(
		array("message" => "No action")
	);
}
