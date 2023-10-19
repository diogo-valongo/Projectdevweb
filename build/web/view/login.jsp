<%-- 
    Document   : login
    Created on : 16 de out. de 2023, 19:36:13
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Login</title>
        <link href="../bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuCliente.jsp"/>       
        <main class="form-signin w-100 m-auto">
            <div class="mb-3 mx-auto p-2" style="width: 33%;">
                <h1 class="mb-3">Login</h1>
                <form>  
                  <div class="mb-3">
                    <label for="conta" class="form-label">Numero da conta</label>
                    <input type="text" class="form-control" id="conta">    
                  </div>
                  <div class="mb-3">
                    <label for="pwd" class="form-label">Senha</label>
                    <input type="password" class="form-control" id="pwd">
                  </div> 
                  <button type="submit" class="btn btn-primary">Logar</button>
                </form>
                <div class="mt-3">
                <a href="loginAdm.jsp">Sou admnistrador</a>
                </div>
            </div>
        </main>
        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>

