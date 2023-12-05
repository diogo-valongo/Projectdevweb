<%-- 
    Document   : saldo
    Created on : 16 de out. de 2023, 19:37:56
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Saldo</title>
        <link href="bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuCliente.jsp"/>
        <h1 class="mb-5 mt-3 ms-5">Olá, ${nome} seu saldo é de:</h1>
        <h2 class="mb-5 mt-3 ms-5">R$ ${saldo}</h2>        
        <script src='bootstrap/bootstrap.min.js'></script>
    </body>
</html>
