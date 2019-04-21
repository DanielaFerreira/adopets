/*
 * 
 */

/* JavaScript funcoes */
//verifica se capsLock está ativa ou nao
function capsLock(e) {
    var flag = event.getModifierState && event.getModifierState('CapsLock');
    if (flag) {
        document.getElementById('mensagemTeclaCapsLock').style.visibility = 'visible';
    } else
        document.getElementById('mensagemTeclaCapsLock').style.visibility = 'hidden';
}


/* JQuery funcoes */

//funcao que carrega arquivo
$(function () {
    $("#header").load("../padroes/header.html");
});

$(function () {
    $("#header_logado").load("../padroes/header_logado.html");
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

//chamada de servlet
//var xhr = new XMLHttpRequest();
//xhr.onreadystatechange = function () {
//    if (xhr.readyState == 4) {
//        var data = xhr.responseText;
//        alert(data);
//    }
//}
//xhr.open('GET', 'myservlet', true);
//xhr.send(null);

//verifica abertura de aba
//var aba= window.open('http://stackoverflow.com/', '_blank');
//if (aba) {
//    //navegador permitiu a abertura
//    aba.onload(function(){
//    //chamar aba 2
//
//    });
//} else {
//    //Navegador bloqueou !
//    alert('Bloqueado pelo bloqueador de popup');
//}


//indicação para a animação do login ativar
$('input[type="password"]').on('focus', () => {
    $('*').addClass('password');
}).on('focusout', () => {
    $('*').removeClass('password');
});