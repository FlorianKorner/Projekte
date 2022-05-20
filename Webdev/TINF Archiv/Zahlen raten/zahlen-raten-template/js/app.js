// globale var
window.sessionStorage =zahl=0;
var maxRandNumber = 100;

function init() {
  console.log('start game');
  var zahl =Math.floor(Math.random() * maxRandNumber + 1);
  console.log(zahl);

  sessionStorage.setItem('zahl', zahl);
  console.log(sessionStorage.getItem('zahl'));
  // generate random number
  // TODO 
}

function guess() {
  // TODO
  if(parseInt(document.getElementById('input-guess-number').value)!=parseInt(sessionStorage.getItem('zahl'))){
      document.getElementById('card-header-icon').classList.add('fa-poo');

      document.getElementById('card-body-text').classList.remove('bg-success');
      document.getElementById('card-header-icon').innerHTML='';
      document.getElementById('card-body-text').classList.add('bg-danger');
  }else {
    document.getElementById('card-header-icon').classList.remove('fa-poo');
    document.getElementById('card-header-icon').innerHTML='correct';

    document.getElementById('card-body-text').classList.remove('bg-danger');
    document.getElementById('card-body-text').classList.add('bg-success');

  }
}
init();