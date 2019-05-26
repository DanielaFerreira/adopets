/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Modal genérico
function createModal(titulo, descricao) {
    // first, check if this is the first call to function
    var oldError = document.getElementById("myModal");
    if (oldError === null)
        $("body").append("<di"); // create space for modal
    $(function () {
        $("#modal").load("padroes/header.html");
    });
    // set modal title and content
    $("#myModal").html("<div class='modal - dialog'><div class='modal-header bg-primary'>" +
            "<button type='button' class='close' data-dismiss='modal'>&times;</button><h4 class='modal-title'>" + titulo
            + "</h4></div><div class='modal- body bg - warning'><p>" + descricao + "</p></div></div>");
    $("#myModal").modal(); // show the modal

}


/*$("#search").change( function () {
 $(".card").show();
 var filter = $(this).val(); // get the value of the input, which we filter on
 $(".container").find(".card-title:not(:contains(" + filter + ")").parent().css("display","none");
 });*/

function filter() {
    var input, filter, cards, cardContainer, title, i;
    input = document.getElementById("search");
    filter = input.value.toUpperCase();
    cardContainer = document.getElementById("cards");
    cards = cardContainer.getElementsByClassName("card");
    for (i = 0; i < cards.length; i++) {
        title = cards[i].querySelector(".card-body h5 .card-title");
        if (title.innerText.toUpperCase().indexOf(filter) > -1) {
            cards[i].style.display = "";
        } else {
            cards[i].style.display = "none";
        }
    }
}
/*
function filter() {
  // Declare variables
  var input, filter, div, carddiv, acc, name, i;
  input = document.getElementById("search");
  filter = input.value.toUpperCase();

  div = document.getElementById("cards");
  carddiv = div.getElementsByClassName("card"); //** Select by class

  // Loop through all list items, and hide those who don't match the search query
  for (i = 0; i < carddiv.length; i++) {
    //** Select specific parent element. innerText will return text in child h1.
    acc = carddiv[i].querySelector(".card-body h5 .card-title").innerText;
    name = carddiv[i].querySelector("[id='Name']").innerText;

    if (acc.toUpperCase().indexOf(filter) > -1) {
      carddiv[i].style.display = ""; //** .hide()/.show() is not supported
    } else {
            carddiv[i].style.display = "block";

    }
  }
};
*/
