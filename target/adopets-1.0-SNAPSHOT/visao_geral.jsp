<%-- 
    Document   : visao_geral
    Created on : 19/04/2019, 21:57:26
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="pt-br">
    <head>
        <title>Adopets: Visão geral</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./node_modules/bootstrap/dist/css/bootstrap.min.css">
        <script src="./node_modules/jquery/dist/jquery.min.js"></script>
        <script src="./node_modules/popper.js/dist/umd/popper.min.js"></script>
        <script src="./node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="visao_geral.css" type="text/css">
        <link rel="stylesheet" href="formularios.css" type="text/css">
    </head>
    <body>
        
        <% String email = (String) request.getParameter("email"); %>
        
        <div id="header_logado"></div>
        <!-- Visão geral-->
        <div class="row mx-auto justify-content-center" style="margin-top: 30px;">
            <div class="card col-md-3">
                <div class="card-body">
                    <div class="row profile">

                        <div class="profile-sidebar">
                            <!-- SIDEBAR USERPIC -->
                            <center>
                                <div class="profile-userpic">
                                    <img src="https://static.change.org/profile-img/default-user-profile.svg" class="img-responsive" alt="">
                                </div>
                            </center>
                            <!-- END SIDEBAR USERPIC -->
                            <!-- SIDEBAR USER TITLE -->
                            <div class="profile-usertitle">
                                <div class="profile-usertitle-name">
                                    Fulano
                                </div>
                            </div>

                            <!-- SIDEBAR BUTTONS -->
                            <div class="profile-userbuttons">
                                <span class="badge badge-primary">Iniciante</span>
                                <span class="badge badge-danger">Doador</span>
                                <span class="badge badge-success">Adotante</span>
                                <span class="badge badge-dark">Voluntário</span>
                            </div>

                            <!-- SIDEBAR MENU -->
                        </div>


                        <div class="nav-tabs"  id="myTab" role="tablist"> 
                            <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist">
                                <a class="nav-link active" id="profile-tab" data-toggle="tab" href="#profile" aria-controls="profile" aria-selected="true" role="tab">
                                    <i class="fas fa-user-alt"></i>
                                    Meu perfil </a>
                                <a class="nav-link" id="activy-tab" data-toggle="tab" href="#activy" aria-controls="activy" aria-selected="false" role="tab">
                                    <i class="fas fa-hands-helping"></i>
                                    Minhas atividades </a>
                                <a class="nav-link" id="animals-tab" data-toggle="tab" href="#animals" aria-controls="activy" aria-selected="false" role="tab">
                                    <i class="fas fa-paw"></i>
                                    Animais ajudados
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="card col-sm-6">
                <div class="tab-content" id="myTabContent">
                    <div class="tab-pane fade show active" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                        <!-- form user info -->
                        <div class="card-body">
                            <div class="card-header">
                                <h4 class="mb-0">Meu Perfil</h4>
                            </div>
                            <div class="alert alert-warning">
                                <a class="close font-weight-light" data-dismiss="alert" href="#">×</a>Clique em Salvar Alterações, caso tenha modificado o seu perfil.
                            </div>
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
                                        <%= email%>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label">Bairro</label>
                                    <div class="col-lg-9">
                                        <input class="form-control" type="text" value="Zona Leste">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label">Digite sua senha</label>
                                    <div class="col-lg-7">
                                        <input name="senha" type="password" class="form-control" maxlength="20" required onchange="this.value = this.value.trim()" placeholder="Senha" id="pass" onkeypress="capsLock(event)" value="11111122333">
                                    </div>
                                    <div class="row-lg-7">
                                        <div class="input-group-text">
                                            <a href="#" class="text-dark" id="icon-click">
                                                <i class="fa fa-eye-slash" id="icon" aria-hidden="true"></i>
                                            </a>
                                        </div>
                                    </div>
                                </div>


                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label">Telefone</label>
                                    <div class="col-lg-9">
                                        <input class="form-control" type="text" value="(92) 99484-5169">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label"></label>
                                    <div class="col-lg-9">
                                        <input type="submit" class="btn btn-danger" value="Excluir Conta">
                                        <input type="button" class="btn btn-primary" value="Salvar Alterações">
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="activy" role="tabpanel" aria-labelledby="activy-tab">

                        <div class="card-group">
                            <div class="card border-danger" style="max-width: 15rem;">
                                <img class="card-img-top" src="img/dog.gif" alt="Imagem de capa do card">
                                <div class="card-body text-danger">
                                    <h5 class="card-title">Doações</h5>
                                    <p class="card-text">Aqui você pode ver as solicitações e doações efetuadas por você.</p>
                                </div>
                                <a href="#" class="btn btn-secondary btn-lg disabled" role="button" aria-disabled="true">Doações indisponíveis</a>

                                <div class="card-footer">
                                    <small class="text-muted">Não há nenhum registro</small>
                                </div>
                            </div>

                            <div class="card border-success" style="max-width: 15rem;">
                                <img class="card-img-top" src="img/dogdribbble.gif" alt="Imagem de capa do card">
                                <div class="card-body text-success">
                                    <h5 class="card-title">Adoções</h5>
                                    <p class="card-text">Uouu, aqui você tem todas as suas adoções efetuadas.</p>
                                </div>
                                <a href="#" class="btn btn-secondary btn-lg disabled" role="button" aria-disabled="true">Adoções indisponíveis</a>

                                <div class="card-footer">
                                    <small class="text-muted">Não há nenhum registro</small>
                                </div>
                            </div>
                            <div class="card border-dark" style="max-width: 15rem;">
                                <img class="card-img-top" src="img/animals.gif" alt="Imagem de capa do card">
                                <div class="card-body text-dark">
                                    <h5 class="card-title">Voluntariado</h5>
                                    <p class="card-text">Faça algo produtivo, ajude um <i>petamigo</i>!</p>
                                </div>

                                <a href="#" class="btn btn-secondary btn-lg disabled" role="button" aria-disabled="true">Atividades indisponíveis</a>
                                <div class="card-footer">
                                    <small class="text-muted">Não há nenhum registro</small>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="tab-pane fade" id="animals" role="tabpanel" aria-labelledby="animals-tab">


                        <div class="card border-danger mx-auto col-md-4" style="max-width: 20rem;">
                            <img class="card-img-top" src="img/dogAns.gif" alt="Imagem de capa do card">
                            <div class="card-body text-danger">
                                <h5 class="card-title">Não ajudou nenhum pet até o momento?</h5>
                                <p class="card-text">Calma. Comece procurando na barra de pesquisa!</p>
                                <p class="card-text"><small class="text-muted">Tente pesquisar algo como "Pug da Zona Leste".</small></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- /#profile -->
        <script type="text/javascript" src="index.js"></script>
        <script src="https://use.fontawesome.com/releases/v5.5.0/js/all.js"></script>
    </body>
</html>