<%-- 
    Document   : menuAdministrador
    Created on : 18 de out. de 2023, 17:02:35
    Author     : Diogo Valongo
--%>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="administrador.jsp">Administrador</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav  me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="saldoAdm.jsp">Saldo</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="extratoAdm.jsp">Extrato</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="cadastroUsuario.jsp">Usuario</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="cadastroConta.jsp">Conta</a>
        </li>

 
      </ul>
       <span class="navbar-text">
           <a href="../">logout</a>
      </span>

    </div>
  </div>
</nav>
