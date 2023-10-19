<%-- 
    Document   : cadastroUsuario
    Created on : 16 de out. de 2023, 19:39:12
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Cadastro Usuário</title>
        <link href="../bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuAdministrador.jsp"/> 
        <div class="container mt-3">
        <h1>Cadastro de Usuário</h1>
        <form>
            <div class="row mb-3">
                <label for="idusuario" class="col-sm-2 col-form-label">Id do Usuário</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="idusuario">
                </div>
            </div>
            <div class="row mb-3">
                <label for="nome" class="col-sm-2 col-form-label">Nome do Usuário</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nome">
                </div>
            </div> 
            <div class="row mb-3">
                <label for="pwd" class="col-sm-2 col-form-label">Senha</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="pwd">
                </div>
            </div> 
              <fieldset class="row mb-3">
                <legend class="col-form-label col-sm-2 pt-0">Tipo de Usuário</legend>
                <div class="col-sm-10">
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="adm" checked>
                    <label class="form-check-label" for="gridRadios1">
                      Administrador
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="normal">
                    <label class="form-check-label" for="gridRadios2">
                      Usuário Normal
                    </label>
                  </div>                  
                </div>
              </fieldset>

            
            <button type="submit" class="btn btn-primary">Cadastrar conta</button>
        </form>
        </div>
        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>
