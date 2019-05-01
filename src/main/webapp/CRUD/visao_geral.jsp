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
        <link rel="stylesheet" href="../js/index.js">
        <script src="../js/jquery/dist/jquery.min.js"></script>
        <script src="../js/popper.js/dist/umd/popper.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../css/crud.css"></script>
    </head>
    <body>
        <div id="header_logado"></div>
    <center>
    <nav>
        <div class="nav nav-tabs" id="nav-tab" role="tablist">
            <a class="nav-item nav-link active" id="navtab-all_users" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Visão geral</a>
            <a class="nav-item nav-link" id="navtab-doadores" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Outros</a>
        </div>
    </nav>
    <div class="tab-content" id="nav-tabContent">
        <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
            <div class="btn-group" style="margin-top: 10px;">             
                <a href="usuario.jsp" class="btn btn-info">
                    <i class="fa fa-user-alt" style="margin-right: 7px;"></i>Registros de usuários
                </a>
                <a href="animal.jsp" class="btn btn-info">
                    <i class="fa fa-paw" style="margin-right: 7px;"></i>Registros de animais
                </a>
                <a href="solicitacao.jsp" class="btn btn-info">
                    <i class="fas fa-list-ul" style="margin-right: 7px;"></i>Solicitações de doação
                </a>
                <a href="solicitacao.jsp" class="btn btn-info">
                   <i class="fas fa-hands-helping" style="margin-right: 7px;"></i>Atividades
                </a>
            </div>
        </div>
        <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">

        </div>

    </div>
        <img style="margin-top: 50px;" src="../img/t.png">
        </center>

    <script src="https://use.fontawesome.com/releases/v5.5.0/js/all.js"></script>
</body>
</html>
