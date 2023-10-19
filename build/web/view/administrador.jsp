<%-- 
    Document   : administrador
    Created on : 16 de out. de 2023, 19:37:04
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Administrador</title>
        <link href="../bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuAdministrador.jsp"/>
        <h1 class="mb-5 mt-3 ms-5">Olá "Nome do Adm"</h1>
        <div style="height: 30vh" class="d-flex justify-content-around mb-4">
            <a href="cadastroConta.jsp" style="width:30%; font-size: 3vw;line-height: 300%" type="button" class="btn btn-primary btn-lg">Criação de Conta</a>            
            <a href="cadastroUsuario.jsp" style="width:30%; font-size: 3vw;line-height: 300%" type="button" class="btn btn-primary btn-lg">Criação de Usuário</a>                      
        </div>
        <div style="height: 30vh" class="d-flex justify-content-around">
           <a href="saldoAdm.jsp" style="width:30%; font-size: 3vw;line-height: 300%" type="button" class="btn btn-primary btn-lg">Consulta Saldo</a>                      
           <a href="extratoAdm.jsp" style="width:30%; font-size: 3vw;line-height: 300%" type="button" class="btn btn-primary btn-lg">Consulta Extrato</a>                      
        </div>

        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>
