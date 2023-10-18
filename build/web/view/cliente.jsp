<%-- 
    Document   : cliente
    Created on : 16 de out. de 2023, 19:36:43
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Cliente</title>
        <link href="../bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuCliente.jsp"/>
        <h1 class="mb-5 mt-3 ms-5">Olá "Nome do Cliente"</h1>
        <div style="height: 30vh" class="d-flex justify-content-around mb-4">
            <a href="saldo.jsp" style="width:30%; font-size: 4vw;line-height: 250%" type="button" class="btn btn-primary btn-lg">Saldo</a>
            <a href="deposito.jsp" style="width:30%; font-size: 4vw;line-height: 250%" type="button" class="btn btn-primary btn-lg">Depósito</a>
            <a href="saque.jsp" style="width:30%; font-size: 4vw;line-height: 250%" type="button" class="btn btn-primary btn-lg">Saque</a>
        </div>
        <div style="height: 30vh" class="d-flex justify-content-around">
            <a href="investimento.jsp" style="width:30%; font-size: 4vw;line-height: 250%" type="button" class="btn btn-primary btn-lg">Investimento</a>
            <a href="extrato.jsp" style="width:30%; font-size: 4vw;line-height: 250%" type="button" class="btn btn-primary btn-lg">Extrato</a>
            <a href="transferencia.jsp" style="width:30%; font-size: 4vw;line-height: 250%" type="button" class="btn btn-primary btn-lg">Transferência</a>           
        </div>

        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>
