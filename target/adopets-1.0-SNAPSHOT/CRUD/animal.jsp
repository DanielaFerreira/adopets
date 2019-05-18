<%-- 
    Document   : visao_geral
    Created on : 28/04/2019, 15:57:17
    Author     : daniela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visão geral - Adopets Foundation</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <link rel="stylesheet" href="../css/crud.css">
        <link rel="stylesheet" href="../css/visao_geral.css">
        <script src="../js/jquery/dist/jquery.min.js"></script>
        <script src="../js/popper.js/dist/umd/popper.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script type="text/javascript" src="../js/DataTables/datatables.min.js"></script>
        <link rel="stylesheet" href="../js/DataTables/datatables.min.css">

        <link rel="stylesheet" href="../css/bootstrap-fileupload/bootstrap-fileupload.css">
        <script type="text/javascript" src="../css/bootstrap-fileupload/bootstrap-fileupload.js"></script>
        ﻿
    </head>
    <body>

        <div class="modal fade" id="add_modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Cadastro de animal</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <center>
                            <div class="form-group">
                                <div class="fileupload fileupload-new" data-provides="fileupload">
                                    <div class="fileupload-new thumbnail" style="width: 100px; height: 100px; margin-top: 10px;">
                                        <img src="../img/dogPerfil_miniatura.jpg" alt="Nenhuma imagem foi enviada"/>
                                    </div>
                                    <div class="fileupload-preview fileupload-exists thumbnail" style="max-width: 200px; max-height: 150px; line-height: 20px;"></div>
                                    <div>
                                        <span class="btn btn-theme02 btn-file">
                                            <span class="fileupload-new"><i class="fa fa-paperclip"></i> Selecione uma imagem</span>
                                            <span class="fileupload-exists"><i class="fa fa-undo"></i> Trocar</span>
                                            <input type="file" class="default" accept="image/png, image/jpeg"  multiple/>
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
                                <input class="form-control" type="text" placeholder="Digite o nome do pet">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Tipo</label>
                            <div class="col-lg-9">
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
                                <input class="form-control" type="text" placeholder="Digite a raça do pet">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Sexo</label>
                            <div class="col-lg-9">
                                <select id="tipo" class="form-control">
                                    <option selected>Macho</option>
                                    <option>Fêmea</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Tamanho</label>
                            <div class="col-lg-9">
                                <select id="tamanho" class="form-control">
                                    <option>Pequeno</option>
                                    <option selected>Médio</option>
                                    <option>Grande</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Data de Nascimento</label>
                            <div class="col-lg-9">
                                <input class="form-control data" type="text" placeholder="00/00/0000">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Necessidade</label>
                            <div class="col-lg-9">
                                <input class="form-control" type="text" placeholder="Possui alguma necessidade especial?">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Descrição</label>
                            <div class="col-lg-9">
                                <input class="form-control" type="text" placeholder="Conte um pouco mais sobre o pet">
                            </div>
                        </div>


                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                            <button type="button" class="btn btn-success"><i class="far fa-plus-square" style="margin-right: 7px;"></i>Adicionar</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

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
                                            <input type="file" class="default" accept="image/png, image/jpeg"  multiple/>
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
                                <input class="form-control" type="text" placeholder="Tio Patinhas">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Tipo</label>
                            <div class="col-lg-9">
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
                                <input class="form-control" type="text" placeholder="Boxer">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Sexo</label>
                            <div class="col-lg-9">
                                <select id="tipo" class="form-control">
                                    <option selected>Macho</option>
                                    <option>Fêmea</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Tamanho</label>
                            <div class="col-lg-9">
                                <select id="tamanho" class="form-control">
                                    <option>Pequeno</option>
                                    <option selected>Médio</option>
                                    <option>Grande</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Data de Nascimento</label>
                            <div class="col-lg-9">
                                <input class="form-control data" type="text" placeholder="00/00/0000">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Necessidade</label>
                            <div class="col-lg-9">
                                <input class="form-control" type="text" placeholder="Possui alguma necessidade especial?">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Descrição</label>
                            <div class="col-lg-9">
                                <input class="form-control" type="text" placeholder="Conte um pouco mais sobre o pet">
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


        <div class="modal fade" id="delete_modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Excluir animal</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <p>Tem certeza de que deseja excluir esse registro?</p>
                        <p class="text-danger"><small>Essa ação não pode ser desfeita.</small></p>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                            <button type="button" class="btn btn-danger">
                                <i class="far fa-trash-alt" style="margin-right: 7px;"></i>Excluir</button>
                        </div>
                        </form>


                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="see_modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Dados do animal</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <h4 class="aga4">Características do Animal</h4>
                        <table role="form" autocomplete="off" cellpadding="15" cellspacing="0">
                            <tr>
                                <td>
                                    Tipo de animal
                                </td>
                                <td>
                                    Cadela
                                </td>
                            </tr>
                            <tr>
                                <td>Nome</td>
                                <td>
                                    Angel
                                </td>
                            </tr>
                            <tr>
                                <td>Raça</td>
                                <td>
                                    Boxer
                                </td>
                            </tr>
                            <tr>
                                <td>Data de nascimento</td>
                                <td>
                                    08/02/2019
                                </td>
                            </tr>
                        </table>

                        <hr>

                        <h4 class="aga4">Informações Adicionais</h4>
                        <table role="form" autocomplete="off" cellpadding="15" cellspacing="0">
                            <tr>
                                <td>Sexo</td>
                                <td>
                                    Fêmea
                                </td>
                            </tr>
                            <tr>
                                <td>Tamanho</td>
                                <td>
                                    Médio </td>
                            </tr>
                            <tr>
                                <td>Necessidade especial</td>
                                <td>
                                    Nenhuma
                                </td>
                            </tr>
                            <tr>
                                <td >Descrição</td>
                                <td>
                                    Angel é uma cadelinha muito divertida e companheira!
                                </td>
                            </tr>
                        </table>

                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>

                        </div>
                        </form>


                    </div>
                </div>
            </div>
        </div>
    <center>
        <h2>Animais</h2>
    </center>

    <div id="screen_crud">
        <center>
            <div>
                <a href="#add" class="btn btn-success" data-toggle="modal" data-target="#add_modal">
                    <i class="far fa-plus-square" style="margin-right: 7px;"></i>Adicionar
                </a>
                <a href="#update" class="btn btn-outline-info" data-toggle="modal">
                    <i class="fa fa-undo" style="margin-right: 7px;"></i>Atualizar
                </a>
            </div>
        </center>

        <table id="crud" class="table table-striped table-bordered table-hover">
            <thead>
                <tr class="table-info">
                    <th scope="col"></th>
                    <th scope="col">Perfil</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Código</th>
                    <th scope="col">Sexo</th>
                    <th scope="col">Tipo</th>
                    <th scope="col">Situação</th>
                    <th scope="col">Bairro</th>
                    <th scope="col">Ação</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="checkbox" value="1"></td>
                    <td>
                        <img alt="Imagem de perfil" src="../img/12_miniatura.jpg" title="Imagem de perfil">
                    </td>
                    <td>Tio Patinhas</td>
                    <td>11335</td>
                    <td>Macho</td>
                    <td>Cachorro Boxer</td>
                    <td>Em doação</td>
                    <td>Tancredo Neves</td>
                    <td class="btn-group">             

                        <a href="#see" class="btn btn-outline-secondary" data-toggle="modal">
                            <i class="far fa-eye" style="margin-right: 7px;"></i>Ver
                        </a>
                        <a href="#edit" class="btn btn-info" data-toggle="modal" data-target="#update_modal">
                            <i class="far fa-edit" style="margin-right: 7px;"></i>Alterar
                        </a>
                        <a href="#delete" class="btn btn-danger" data-toggle="modal" data-target="#delete_modal">
                            <i class="far fa-trash-alt" style="margin-right: 7px;"></i>Excluir
                        </a>
                    </td>
                </tr>
                <tr>
                    <td><input type="checkbox" value="1"></td>
                    <td>
                        <img alt="Imagem de perfil" src="../img/dogPerfil_miniatura.jpg" title="Imagem de perfil">
                    </td>
                    <td id="name">Angel</td>
                    <td>45781</td>
                    <td>Fêmea</td>
                    <td>Cadela Chiuaua</td>
                    <td>Espera médica</td>
                    <td>Centro</td>

                    <td class="btn-group">             

                        <a href="#see" class="btn btn-outline-secondary" data-toggle="modal" data-target="#see_modal">
                            <i class="far fa-eye" style="margin-right: 7px;"></i>Ver
                        </a>
                        <a href="#edit" class="btn btn-info" data-toggle="modal">
                            <i class="far fa-edit" style="margin-right: 7px;"></i>Alterar
                        </a>
                        <a href="#delete" class="btn btn-danger" data-toggle="modal" data-target="#delete_modal">
                            <i class="far fa-trash-alt" style="margin-right: 7px;"></i>Excluir
                        </a>
                    </td>
                </tr>

            </tbody>
        </table>
    </div>
    <script type="text/javascript" src="../js/crud.js"></script>

    <script src="https://use.fontawesome.com/releases/v5.5.0/js/all.js"></script>
</body>
</html>
