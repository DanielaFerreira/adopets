<%-- 
    Document   : header_logado
    Created on : 19/05/2019, 15:41:48
    Author     : eddunic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Adopets</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <link rel="stylesheet" href="../css/header_logadoAdmin.css" type="text/css">
        <link href="../img/icon.png" rel="icon">
    </head>
    <body data-spy="scroll" data-target="#navbarResponsive">
        <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="../padroes/index.html"><img src="../img/logo.png"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">                            
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="../usuario_comum/visao_geral.jsp">Visão Geral</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="">Dicas e Manuais</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Olá, Admin!
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="visao_geral.jsp">Meus registros</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="../padroes/index.html">Sair</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <script src="../js/bootstrap.min.js"></script>
    </body>
</html>
