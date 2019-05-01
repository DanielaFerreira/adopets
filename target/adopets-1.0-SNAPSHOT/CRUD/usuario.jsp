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
                        <h5 class="modal-title">Cadastro de usuário</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <center>
                            <div class="form-group">
                                <div class="fileupload fileupload-new" data-provides="fileupload">
                                    <div class="fileupload-new thumbnail" style="width: 100px; height: 100px; margin-top: 10px;">
                                        <img src="../img/perfil.jpg" alt="Nenhuma imagem foi enviada"/>
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
                        <form class="form" role="form" autocomplete="off">
                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">Nome Completo</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="text" value="Fulano Ciclano Beltrano">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">CPF</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="text" value="Não informado">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">E-mail</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="email" value="fulano@gmail.com">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">Bairro</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="text" value="Zona Leste">
                                </div>
                            </div>



                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">Telefone</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="text" value="(92) 99484-5169">
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                                <button type="button" class="btn btn-success"><i class="far fa-plus-square" style="margin-right: 7px;"></i>Adicionar</button>
                            </div>
                        </form>


                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="update_modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Alterar registro de usuário</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <center>
                            <div class="form-group">
                                <div class="fileupload fileupload-new" data-provides="fileupload">
                                    <div class="fileupload-new thumbnail" style="width: 100px; height: 100px; margin-top: 10px;">
                                        <img src="../img/perfil_miniatura1.jpg" alt="Nenhuma imagem foi enviada"/>
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
                        <form class="form" role="form" autocomplete="off">
                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">Nome Completo</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="text" value="Daniela">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">CPF</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="text" value="************">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">E-mail</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="email" value="danielaferreira1133@gmail.com">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">Bairro</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="text" value="Centro">
                                </div>
                            </div>




                            <div class="form-group row">
                                <label class="col-lg-3 col-form-label form-control-label">Telefone</label>
                                <div class="col-lg-9">
                                    <input class="form-control" type="text" value="(92) 99484-5169">
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                                <button type="button" class="btn btn-info"><i class="far fa-edit" style="margin-right: 7px;"></i>Alterar</button>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>


        <div class="modal fade" id="delete_modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Excluir usuário</h5>
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

    <center>
        <h2>Usuários</h2>
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
                    <th scope="col">E-mail</th>
                    <th scope="col">CPF/CNPJ</th>
                    <th scope="col">Nascimento</th>
                    <th scope="col">Telefone</th>
                    <th scope="col">Bairro</th>
                    <th scope="col">Ação</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="checkbox" value="1"></td>
                    <td>
                        <img alt="Imagem de perfil" src="../img/perfil_miniatura1.jpg" title="Imagem de perfil">
                    </td>
                    <td id="name">Daniela</td>
                    <td>danielaferreira1133@gmail.com</td>
                    <td>***********</td>
                    <td>17/08/2001</td>
                    <td>99484-5169</td>
                    <td>Centro</td>
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
                        <img alt="Imagem de perfil" src="../img/perfil_miniatura1.jpg" title="Imagem de perfil">
                    </td>
                    <td>Fulana</td>
                    <td>fulana@gmail.com</td>
                    <td>***********</td>
                    <td>17/08/2001</td>
                    <td>99484-5169</td>
                    <td>Centro</td>
                    <td class="btn-group">             
                        <a href="#see" class="btn btn-outline-secondary" data-toggle="modal">
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