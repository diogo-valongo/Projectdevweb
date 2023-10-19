<%-- 
    Document   : extrato
    Created on : 16 de out. de 2023, 19:38:09
    Author     : Diogo Valongo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUFF - Extrato</title>
        <link href="../bootstrap/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="menuCliente.jsp"/>
        
        <div class="container mt-3">
        <h1>Extrato</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Operação</th>
                    <th>Valor de Entrada</th>
                    <th>Valor de Saída</th>
                    <th>Conta de Entrada</th>
                    <th>Conta de Saída</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Saque</td>
                    <td></td>
                    <td>R$500</td>
                    <td></td>
                    <td>Sua Conta</td>
                </tr>
                <tr>
                    <td>Deposito</td>
                    <td>R$300</td>
                    <td></td>
                    <td>Sua Conta</td>
                    <td></td>
                </tr>
                <tr>
                    <td>Transferência</td>
                    <td>R$200</td>
                    <td></td>
                    <td>Sua Conta</td>
                    <td>Conta de Sujeito</td>
                </tr>
                <tr>
                    <td>Transferência</td>
                    <td></td>
                    <td>R$4.300</td>
                    <td>Conta do Sujeito</td>
                    <td>Sua Conta</td>
                </tr>      
                <tr>
                    <td></td>
                    <td>Total entrada: R$500</td>
                    <td>Total saída: R$4.800</td>
                    <td></td>
                    <td></td>
                </tr>   
            </tbody>
            
        </table>
        </div>
        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>
