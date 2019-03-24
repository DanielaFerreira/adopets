/*
 * 
 */

/* JavaScript funcoes */
//verifica se capsLock está ativa ou nao
function capsLock(e) {
    var flag = event.getModifierState && event.getModifierState('CapsLock');
    if(flag){
        document.getElementById('mensagemTeclaCapsLock').style.visibility = 'visible';
    } else
        document.getElementById('mensagemTeclaCapsLock').style.visibility = 'hidden';
}


/* JQuery funcoes */

//funcao que carrega arquivo
$(function () {
    $("#header").load("header.html");
});

//exibe ou esconde o campo de senha
$(document).ready(function () {
    $("#icon-click").click(function () {
        var input = $("#pass");
        if (input.attr("type") === "password") {
            input.attr("type", "text");
            $("#icon").toggleClass('fa fa-eye');
        } else {
            input.attr("type", "password");
            $("#icon").toggleClass('fa fa-eye-slash');
        }
    });
});