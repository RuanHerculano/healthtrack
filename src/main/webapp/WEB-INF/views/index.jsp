<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Health Track</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <style type="text/css">
        <%@include file="./../css/index.css" %>
    </style>
</head>
<body>
<%--<h1>${msg}</h1>--%>
<%--<h2>Today is <fmt:formatDate value="${today}" pattern="yyy-MM-dd"/></h2>--%>

<div class="container-fluid">
    <ul class="nav float-left">
        <li class="nav-item" style="margin-top: 5px">
            <img src="<jsp:include page="../assets/logo.png" />" alt="">
        </li>
        <li class="nav-item" style="margin-top: 5px">
            <a class="nav-link active" href="#">Health Track</a>
        </li>
    </ul>
    <ul class="nav justify-content-end">
        <li class="nav-item">
            <a class="nav-link active" href="#">Sobre</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/signup">Cadastrar</a>
        </li>
        <li class="nav-item">
            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Entrar</a>
        </li>
    </ul>
</div>
<div class="login-form">
    <form action="/" method="post">
        <h2 class="text-center">Entrar</h2>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Usuário" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" placeholder="Senha" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-block">Entrar</button>
        </div>
    </form>
    <p class="text-center">
        <a href="/signup">
            Cadastrar
        </a>
    </p>
</div>

</body>
</html>