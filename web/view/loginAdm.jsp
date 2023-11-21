<%-- 
    Document   : loginAdm
    Created on : 19 de out. de 2023, 20:13:27
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Login ADM</title>
        <link href="../bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuAdministrador.jsp"/>        
        <main class="form-signin w-100 m-auto">
            <div class="mb-3 mx-auto p-2" style="width: 33%;">
                <h1 class="mb-3">Login ADM</h1>
                <form action="/Projectdevweb/admin?acao=login" method="POST">  
                  <div class="mb-3">
                    <label for="id" class="form-label">Id do Usuário</label>
                    <input type="text" class="form-control" id="id" name="id">    
                  </div>
                  <div class="mb-3">
                    <label for="pwd" class="form-label">Senha</label>
                    <input type="password" class="form-control" id="pwd" name="password">
                  </div> 
                  <button type="submit" class="btn btn-primary">Logar</button>
                </form>
                <div class="mt-3">
                <a href="login.jsp?acao=loginNormal">Sou usuário normal</a>
                </div>
            </div>
        </main>
        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>
