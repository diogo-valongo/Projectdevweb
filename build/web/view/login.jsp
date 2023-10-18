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
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
                </div>
</main>
        <script src='../bootstrap/bootstrap.min.js'></script>
    </body>
</html>

