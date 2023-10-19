<%-- 
    Document   : cadastroConta
    Created on : 16 de out. de 2023, 19:39:20
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Cadastro Contras</title>
        <link href="../bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuAdministrador.jsp"/> 
        <div class="container mt-3">
        <h1>Cadastro de Conta</h1>
        <form>
            <div class="row mb-3">
                <label for="idusuario" class="col-sm-2 col-form-label">Id do Usuário</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="idusuario">
                </div>
            </div>
            <div class="row mb-3">
                <label for="numeroconta" class="col-sm-2 col-form-label">Numero da Conta</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="numeroconta">
                </div>
            </div> 
            <button type="submit" class="btn btn-primary">Cadastrar conta</button>
        </form>
        </div>
        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>
