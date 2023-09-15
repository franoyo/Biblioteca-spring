
var deleteButtons = document.getElementsByClassName('delete-button');
const launcAlert=document.getElementById("alerta");
const closeButton=document.getElementById("zerrar");


// Recorrer los elementos y agregar el evento de clic a cada uno
for (var i = 0; i < deleteButtons.length; i++) {
  deleteButtons[i].addEventListener('click', function(e) {
    e.preventDefault(); // Prevenir el comportamiento predeterminado del enlace
    var id = this.getAttribute('data-id'); // Obtener la ID almacenada en data-id

    // Mostrar una alerta con la ID correspondiente
    launcAlert.classList.add("noSee")
    console.log(id);
    var lil=document.getElementById("input-id");
    lil.value = id;
  });
}
closeButton.addEventListener('click', function(){
    launcAlert.classList.remove("noSee");
})