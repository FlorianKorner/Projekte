

window.sessionStorage = bmi = 0;

function init() {
  console.log("started BMI calc");
  // generate random number
  // TODO
}

// if ($("#radio1:checked").val() == "value1") {
//   alert("Der erste Radiobutton wurde ausgewählt");
//   }

function calc() {
  //var bmi = 15;
  //var bmi = 22;
  //var bmi = 28;
  //var bmi = 36;
  //var bmi = 45;
  
  // console.log("test");
     var weight=parseInt(document.getElementById("input-weight").value);
     var height=parseInt(document.getElementById("input-height").value) / 100;
     var bmi=weight/(height*height);
  // console.log("weight: "+weight+", height: "+height+", BMI: "+bmi);

     sessionStorage.setItem("bmi",bmi);
  // console.log("BMI sessionStorage: "+sessionStorage.getItem("bmi"));
  if ($("#radio-female:checked").val() === "female" && bmi < 19) {
    //alert("bmi unter 19 (Untergewicht)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail: Untergewicht';
  }
  else if ($("#radio-female:checked").val() === "female" && bmi <=24 && bmi >=19) {
    //alert("bmi zwichen 25 und 19 (Normalgewicht)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail: Normalgewicht';
  }
  else if ($("#radio-female:checked").val() === "female" && bmi <=30 && bmi >=25) {
    //alert("bmi zwichen 26 und 30 (Übergewicht)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail: Übergewicht';
  }
  else if ($("#radio-female:checked").val() === "female" && bmi <=40 && bmi >=31) {
    //alert("bmi zwichen 31 und 40 (Adipositas)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail: Adipositas';
  }
  else if ($("#radio-female:checked").val() === "female" && bmi >40) {
    //alert("bmi über 40 (starke Adipositas)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail: starke Adipositas';
  }
  
  else if ($("#radio-male:checked").val() === "male" && bmi < 20) {
    //alert("bmi unter 20 (Untergewicht)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail: Untergewicht';
  }
  else if ($("#radio-male:checked").val() === "male" && bmi <= 25 && bmi>20) {
    //alert("bmi zwischen 21 und 25 (Normalgewicht)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail: Normalgewicht';
  }
  else if ($("#radio-male:checked").val() === "male" && bmi <= 30 && bmi>=26) {
    //alert("bmi zwischen 26 und 30 (Übergewicht)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail: Übergewicht';
  }
  else if ($("#radio-male:checked").val() === "male" && bmi <= 40 && bmi>=31) {
    //alert("bmi zwischen 31 und 40 (Adipositas)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail:  Adipositas';
  }
  else if ($("#radio-male:checked").val() === "male" && bmi >40) {
    //alert("bmi über 40 (starke Adipositas)");
    document.getElementById('bmi-value').innerHTML='BMI: '+parseInt(bmi);
    document.getElementById('bmi-detail').innerHTML='Detail: starke Adipositas';
  }
  else if ($("#radio-male:checked").val() == "" ||$("#radio-female:checked").val() == "" || 
           document.getElementById("input-weight").value == null ||
           document.getElementById("input-height").value == null) {
          document.getElementById('bmi-value').innerHTML='Please only use valid input';
          document.getElementById('bmi-detail').innerHTML='Make sure to fill all boxes and check one checkbock';
  }

}
 function reset(){
  document.getElementById('input-weight').value = null;
  document.getElementById('input-height').value = null;
  document.getElementById('bmi-value').innerHTML='';
  document.getElementById('bmi-detail').innerHTML='';
 }