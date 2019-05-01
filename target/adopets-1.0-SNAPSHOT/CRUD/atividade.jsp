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

        <div class="modal fade" id="generic_modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Sem registro</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <p>Não há nenhum registro de solicitação</p>
                        <p class="text-danger"><small>Oba! Parece que ninguém quer doar!</small></p>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                        </div>
                        </form>


                    </div>
                </div>
            </div>
        </div>

    <center>
        <h2>Atividades</h2>
    </center>

    <div id="screen_crud">
        <center>
            <div>
                <!-- formulario doação-->
                <a href="#add" class="btn btn-success" data-toggle="modal" data-target="#">
                    <i class="far fa-plus-square" style="margin-right: 7px;"></i>Adicionar
                </a>
                <a href="#update" class="btn btn-outline-info" data-toggle="generic_modal">
                    <i class="fa fa-undo" style="margin-right: 7px;"></i>Atualizar
                </a>
            </div>
        </center>

        <table id="crud" class="table table-striped table-bordered table-hover">
            <thead>
                <tr class="table-info">
                    <th scope="col"></th>
                    <th scope="col">Número</th>
                    <th scope="col">Código</th>
                    <th scope="col">Situação</th>
                    <th scope="col">Motivo</th>
                    <th scope="col">Autorização</th>
                    <th scope="col">Data</th>
                    <th scope="col">Ação</th>
                </tr>
            </thead>
            <tr>
                
            </tr>
            <tbody>
            </tbody>
        </table>
    </div>
    <script type="text/javascript" src="../js/crud.js"></script>

    <script src="https://use.fontawesome.com/releases/v5.5.0/js/all.js"></script>
</body>
</html>
