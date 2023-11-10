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

                    <label for="inputGroupSelect01" class="col-sm-2 col-form-label">Investimento:</label>
                    <div class="col-sm-10">
                        <select class="form-select" id="inputGroupSelect01">
                            <option selected>Escolha um investimento...</option>
                            <option value="1">CDB (11,55%)</option>
                            <option value="2">Tesouro Direto (11,65%)</option>
                            <option value="3">LCI (10,52%)</option>
                        </select>
                    </div>

                </div>
                <div class="row mb-3">

                    <label for="valor" class="col-sm-2 col-form-label">Valor (R$)</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="valor">
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Investir</button>
            </form>

            <h1 class="mb-5 mt-5">Investimentos realizados:</h1>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Investimento</th>
                        <th>Rendimento</th>
                        <th>Valor de Entrada</th>
                        <th>Data de entrada</th>
                        <th>Valor Atual</th>
                        <th>Lucro</th>  
                        <th>Retirar</th>   
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>CDB</td>
                        <td>11,55%</td>
                        <td>R$500</td>
                        <td>10/10/2023</td>
                        <td>R$557,75(Data de Hoje seria 10/11/23)</td>
                        <td>R$57,75</td>
                        <td><button class="btn btn-primary btn-sm">Retirar</button></td>
                    </tr>
                    <tr>
                        <td>LCI</td>
                        <td>10,52%</td>
                        <td>R$1000</td>
                        <td>10/07/2023</td>
                        <td>R$1.491,98(Data de Hoje seria 10/11/23)</td>
                        <td>R$491,98</td>
                        <td><button class="btn btn-primary btn-sm">Retirar</button></td>
                    </tr>
                </tbody>

            </table>
        </div>

        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>
