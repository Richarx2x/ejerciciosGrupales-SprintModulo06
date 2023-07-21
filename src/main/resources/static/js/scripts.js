document.addEventListener("DOMContentLoaded", function() {
    var limpiarBtn = document.querySelector("#limpiarBtn");
    var usuarioInput = document.querySelector("#usuario");
    var contrasenaInput = document.querySelector("#contrasena");

    limpiarBtn.addEventListener("click", function(event) {
        event.preventDefault();
        usuarioInput.value = "";
        contrasenaInput.value = "";
    });
});