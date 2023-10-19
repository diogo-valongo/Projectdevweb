<%-- 
    Document   : saldoAdm
    Created on : 18 de out. de 2023, 20:51:12
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Saldo</title>
        <link href="../bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuAdministrador.jsp"/>
        <div class="container mt-3">
        <h1>Consulta Saldo</h1>
        <form>
            <div class="row mb-3">
                <label for="conta" class="col-sm-2 col-form-label">Conta</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="conta">
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Consultar</button>
        </form>
        <h1 class="mb-5 mt-5">A conta de "nome Cliente" tem o saldo de:</h1>
        <h2 class="mb-5 mt-3">R$1000,00</h2> 
        </div>
        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>
