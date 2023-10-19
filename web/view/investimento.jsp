<%-- 
    Document   : investimento
    Created on : 16 de out. de 2023, 19:38:39
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Investimento</title>
        <link href="../bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuCliente.jsp"/>
        <div class="container mt-3">
        <h1>Investimento</h1>
        <form>
            <div class="row mb-3">
                <label for="valor" class="col-sm-2 col-form-label">Valor (R$)</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="valor">
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Investir</button>
        </form>
        </div>
        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>
