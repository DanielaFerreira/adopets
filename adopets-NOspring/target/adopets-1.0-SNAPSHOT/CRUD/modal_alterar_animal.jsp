<%-- 
    Document   : modal_alterar
    Created on : 20/05/2019, 04:41:01
    Author     : daniela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Adopets</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="../js/jquery/dist/jquery.min.js"></script>
        <script type="text/javascript" src="../js/DataTables/datatables.min.js"></script>
        <link rel="stylesheet" href="../js/DataTables/datatables.min.css">

        <link rel="stylesheet" href="../css/bootstrap-fileupload/bootstrap-fileupload.css">
        <script type="text/javascript" src="../css/bootstrap-fileupload/bootstrap-fileupload.js"></script>
    </head>
    <body>
        <div class="modal fade" id="update_modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Alterar registro de animal</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <center>
                            <div class="form-group">
                                <div class="fileupload fileupload-new" data-provides="fileupload">
                                    <div class="fileupload-new thumbnail" style="width: 100px; height: 100px; margin-top: 10px;">
                                        <img src="../img/12.jpg" alt="Nenhuma imagem foi enviada"/>
                                    </div>
                                    <div class="fileupload-preview fileupload-exists thumbnail" style="max-width: 200px; max-height: 150px; line-height: 20px;"></div>
                                    <div>
                                        <span class="btn btn-theme02 btn-file">
                                            <span class="fileupload-new"><i class="fa fa-paperclip"></i> Selecione uma imagem</span>
                                            <span class="fileupload-exists"><i class="fa fa-undo"></i> Trocar</span>
                                            <input type="file" name="foto" class="default" accept="image/png, image/jpeg"  multiple/>
                                        </span>
                                        <a href="" class="btn btn-theme04 fileupload-exists" data-dismiss="fileupload">
                                            <i class="fas fa-trash-alt"></i> Apagar</a>
                                    </div>
                                </div>

                            </div>
                        </center>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Nome</label>
                            <div class="col-lg-9">
                                <input class="form-control" type="text" name="nome" placeholder="Digite o nome do pet">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Tipo</label>
                            <div class="col-lg-9" name="tipo">
                                <div class="custom-control custom-radio custom-control-inline">
                                    <input type="radio" id="customRadioInline1" name="customRadioInline1" class="custom-control-input">
                                    <label class="custom-control-label" for="customRadioInline1">Cão</label>
                                </div>
                                <div class="custom-control custom-radio custom-control-inline">
                                    <input type="radio" id="customRadioInline2" name="customRadioInline1" class="custom-control-input">
                                    <label class="custom-control-label" for="customRadioInline2">Gato</label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Raça</label>
                            <div class="col-lg-9">
                                <input name="raca" class="form-control" type="text" placeholder="Digite a raça do pet">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label" name="sexo">Sexo</label>
                            <div class="col-lg-9">
                                <select id="sexo" name="sexo" class="form-control">
                                    <option selected>Macho</option>
                                    <option>Fêmea</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Tamanho</label>
                            <div class="col-lg-9">
                                <select id="tamanho" name="tamanho" class="form-control">
                                    <option>Pequeno</option>
                                    <option selected>Médio</option>
                                    <option>Grande</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Data de Nascimento</label>
                            <div class="col-lg-9">
                                <input class="form-control data" name="dataNasc" type="text" placeholder="00/00/0000">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Necessidade</label>
                            <div class="col-lg-9">
                                <input class="form-control" type="text"  name="necessidade" placeholder="Possui alguma necessidade especial?">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Descrição</label>
                            <div class="col-lg-9">
                                <input  name="name" class="form-control" type="text" placeholder="Conte um pouco mais sobre o pet">
                            </div>
                        </div>    


                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                            <button type="button" class="btn btn-info"><i class="far fa-edit" style="margin-right: 7px;"></i>Alterar</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
