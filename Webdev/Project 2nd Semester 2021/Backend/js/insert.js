$(document).ready(function () {
    insertData();
});

function insertData() {
    $(document).on("click", "#submit-btn", function () {
    //$(document).on("click", "#submit", function () {
        //bands
        let B_Name = $("#B_Name").val();
        let B_Creation_Date = $("#B_Creation_Date").val();
        let B_Num_o_published_Songs = $("#B_Num_o_published_Songs").val();

        //songs
        let S_Name = $("#S_Name").val();
        let S_Description = $("#S_Description").val();
        let URL = $("#URL").val();
        let S_Views = $("#S_Views").val();

        var formData = {
            //bands
            B_Name:B_Name ,
            B_Creation_Date: B_Creation_Date,
            B_Num_o_published_Songs: B_Num_o_published_Songs,

            //songs
            S_Name: S_Name, 
            S_Description: S_Description, 
            URL: URL, 
            S_Views:S_Views
        }
        let url = `http://localhost/Project%202nd%20Semester%202021/Backend/PHP/stmts/insert.php`;
        //console.log("url: " + url)
        $.post(url, formData, (data) => {
            console.log(formData);

            //the author already exists in the database
            if (data != null) {

            }
            else {

            }
        });
    });
    //});

}