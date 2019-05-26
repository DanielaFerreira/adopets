/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//busca, filtragem e paginação
$(document).ready(function () {
    $('#crud').DataTable({
        "language": {
            "responsive": true,
            "lengthMenu": "Mostrando _MENU_ registros por página",
            "zeroRecords": "Nenhum registro encontrado",
            "info": "Mostrando página _PAGE_ de _PAGES_",
            "infoEmpty": "Nenhum registro disponível",
            "search": "Buscar",
            "infoFiltered": "(filtrado de _MAX_ registros no total)",
            "processing": "Processando...",
            "emptyTable": "Não há nenhum registro",
            "paginate": {
                "first": "Primeiro",
                "previous": "Anterior",
                "next": "Próximo",
                "last": "Último"
            }
        }});
});

/*$('#eddit_modal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // Botão que acionou o modal
  var recipient = td.data('#name') // Extrai informação dos atributos data-*
  // Se necessário, você pode iniciar uma requisição AJAX aqui e, então, fazer a atualização em um callback.
  // Atualiza o conteúdo do modal. Nós vamos usar jQuery, aqui. No entanto, você poderia usar uma biblioteca de data binding ou outros métodos.
  var modal = $(this)
  modal.find('.modal-title').text('Alterar dados de ' + recipient)
  modal.find('.modal-body input').val(recipient)
});*/