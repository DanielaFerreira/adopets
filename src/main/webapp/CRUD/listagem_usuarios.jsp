<%-- 
    Document   : listagem_usuarios
    Created on : 19/05/2019, 10:04:36
    Author     : daniela
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.UsuarioDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Usuario"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="../js/jquery/dist/jquery.min.js"></script>
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <link rel="stylesheet" href="../css/listagens.css">
        <script src="../js/listagens.js"></script>

        <script src="../js/bootstrap.min.js"></script>
    </head>
    <body class="container justify-content-center">
     
        <div class="col-auto post-title"><h1 class="post-title">Perfis de usuários</h1>
            <p class="subtitle"><b>Busque, visualize ou exclua</b> perfis de usuários.</p>
        </div>
        <div class="row">
            <form class="col-auto form-inline"  style="margin-top: 8px;">
                <div class="input-group">
                    <input name="search" type="search" onkeyup="filter();" id="search" class="form-control col-auto" placeholder="Buscar por...">
                    <div class="input-group-prepend">
                        <div class="input-group-text">
                            <a href="#" class="text-dark" id="icon-click">
                                <i class="fas fa-search"></i>
                        </div>
                    </div>
                </div>
            </form>
            <a class="btn btn-info col-auto refresh" id="refresh" href="#cards" style="margin-top: 8px; margin-left: 15px;">
                <i class="fa fa-undo"></i>    Atualizar
            </a>
        </div>
        <div class="row" id="cards">
            <%
                UsuarioDAO usuarioDAO = new UsuarioDAO();
                List<Usuario> usuarios = usuarioDAO.getAll();
                if (!usuarios.isEmpty()) {
            %>                           
            <%for (Usuario usuario : usuarios) {%>

            <div class="col-auto">
                <div class="card text-center shadow-lg p-3 mb-5 bg-white rounded" id="<%=usuario.getEmail()%>" style="width: 18rem; margin-top: 25px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">
                    <div class="card-body"> <!-- indice da lista-->
                        <c:choose>
                            <c:when test="${empty usuario.getFoto()}">
                                <img class="avatar" alt="Imagem de perfil" title="Imagem de perfil" src="../img/perfil_miniatura.jpg"/>
                            </c:when>
                            <c:otherwise>
                                <div class="avatar" alt="Imagem de perfil" title="Imagem de perfil"><%=usuario.getFoto()%></div>
                            </c:otherwise>
                        </c:choose>
                        <h5 class="card-title"><%=usuario.getNome()%> </h5> <!-- Nome Daniela -->

                        <c:choose>
                            <c:when test="${empty usuario.getTelefone()}">
                                <p class="card-text">Telefone não informado</p>
                            </c:when>
                            <c:otherwise>
                                <p class="card-text"><%=usuario.getTelefone()%></p>
                            </c:otherwise>
                        </c:choose>

                        <c:choose>
                            <c:when test="${empty usuario.getBairro()}">
                                <p class="card-text">Bairro não informado</p>
                            </c:when>
                            <c:otherwise>
                                <p class="card-text"><%=usuario.getBairro()%></p>
                            </c:otherwise>
                        </c:choose>

                        <div class="grupo de botão">
                            <a href="#see" class="btn btn-outline-secondary" data-toggle="modal">
                                <i class="far fa-eye" style="margin-right: 7px;"></i>Ver
                            </a>
                            <a href='modal_generico_usuario.jsp?d=<%=usuario.getEmail()%>' class="btn btn-danger delete">
                                <i class="far fa-trash-alt" style="margin-right: 7px;"></i>Excluir
                            </a>
                        </div>

                    </div>
                </div> 
            </div>
            <%
                }
            } else {
            %>
            <div class="col-md-4 offset-md-4 card text-center" style="margin-top: 8px;">
                <img class="card-img-top" src="../img/cat-purple-sound.gif" alt="Imagem de capa do card">
                <div class="card-body">

                    <h5 class="card-title">Não há nenhum registro</h5>
                    <p class="card-text">Eita, ainda não tem nada cadastrado aqui, que tal dar uma olhada outra hora?</p>
                    <p class="card-text"><small class="text-muted">Às vezes basta clicar no botão atualizar...</small></p>
                </div>
            </div>
        </div>
            <% }%>
            
            <%@include file="modal_generico_usuario.jsp" %>
        <script src="https://use.fontawesome.com/releases/v5.5.0/js/all.js"></script>
        <script type="text/javascript" src="../js/index.js"></script>
    </body>
</html>
