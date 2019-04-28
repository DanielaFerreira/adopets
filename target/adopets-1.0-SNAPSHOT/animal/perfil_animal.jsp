<%-- 
    Document   : perfil_animal
    Created on : 23/04/2019, 19:53:16
    Author     : eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pr-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <title>Adopets</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../css/bootstrap-fileupload/bootstrap-fileupload.css">
        <link rel="stylesheet" href="../css/perfil_animal.css" type="text/css">
        <link rel="stylesheet" href="../css/formularios.css" type="text/css">
        <script src="../js/jquery/dist/jquery.min.js"></script>
        <script src="../js/popper.js/dist/umd/popper.min.js"></script>
    </head>
    <body>

        <div id="header_logado"></div>

        <div class="row mx-auto justify-content-center perfil_animal">

            <!--  card col-md-3-->
            <div class="col-md-3">

                <center>
                    <div class="form-panel">
                        <form action="#" class="form-horizontal style-form">

                            <div class="form-group last sideimg">
                                <div class="col-xs-3">
                                    <div class="fileupload fileupload-new" data-provides="fileupload">
                                        <div class="fileupload-new thumbnail" style="width: 300px; height: 350px;">
                                            <img src="../img/boxer.jpg" alt="Nenhuma imagem foi enviada"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </center>
                <!-- END SIDEBAR USERPIC -->
                <!-- SIDEBAR USER TITLE -->
                <h4 class="aga4">Totó</h4>


                <!-- SIDEBAR BUTTONS -->
                <center>
                    <div class="badges">
                        <span class="badge badge-primary">Cão</span>
                        <span class="badge badge-danger">Boxer</span>
                        <span class="badge badge-secondary">3 meses</span>
                        <span class="badge badge-success">Macho</span>
                    </div>
                    <h6 style="margin-top: 20px;">Esperando um lar há 75 dias</h6>
                    <button class="btn btn-success" type="submit">Adotar</button>
                </center>


            </div>


            <div class="tab-content col-5">
                <!-- form user info -->

                <h4 class="aga4">Características do Animal</h4>
                <table role="form" autocomplete="off" cellpadding="15" cellspacing="0">
                    <tr>
                        <td>
                            Tipo de animal
                        </td>
                        <td>
                            Cachorro
                        </td>
                    </tr>
                    <tr>
                        <td>Nome</td>
                        <td>
                            Totó
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

                <h5 class="aga5">Informações Adicionais</h5>
                <table role="form" autocomplete="off" cellpadding="15" cellspacing="0">
                    <tr>
                        <td>Sexo</td>
                        <td>
                            Macho
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
                            Totó é um cãozinho muito divertido e companheiro!
                        </td>
                    </tr>
                </table>

            </div>
        </div>
        <div id="footer"></div>        

        <script src="../js/jquery/jquery-1.12.4.js"></script>
        <script type="text/javascript" src="../js/index.js"></script>
        <script type="text/javascript" src="../css/bootstrap-fileupload/bootstrap-fileupload.js"></script>
        <script src="https://use.fontawesome.com/releases/v5.5.0/js/all.js"></script>
    </body>
</html>

