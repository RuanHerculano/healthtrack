<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Health Track</title>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/favicon.ico" type="image/x-icon">
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index.css">
    <script src="${pageContext.request.contextPath}/resources/js/index.js"></script>
</head>
<body>
<div class="container-fluid">
    <ul class="nav float-left">
        <li class="nav-item" style="margin-top: 5px">
            <img src="${pageContext.request.contextPath}/resources/assets/logo.png" alt="">
        </li>
        <li class="nav-item" style="margin-top: 5px">
            <a class="nav-link active" href="#">Health Track</a>
        </li>
    </ul>
    <ul class="nav justify-content-end">
        <li class="nav-item">
            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Atividade física</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Alimentos</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Batimentos cardíacos</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/">Sair</a>
        </li>
    </ul>
</div>
<header>
    <div class="container mt-5">
        <h2>Atividade física</h2>
    </div>
</header>
<div class="container mt-5">
    <!-- Botão para acionar modal -->
    <button type="button" class="btn" data-toggle="modal" data-target="#modalExemplo">
        Nova
    </button>
</div>
<div class="container mt-5" style="background-color: #ffffff">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Nome</th>
            <th scope="col">Tempo (Minutos)</th>
            <th scope="col">Calorias</th>
        </tr>
        </thead>
        <tbody id="physical-activity-table">
        <tr>
            <th scope="row">1</th>
            <td>Correr</td>
            <td>30</td>
            <td>300</td>
        </tr>
        </tbody>
    </table>
</div>
</div>

<!-- Modal -->
<div class="modal fade" id="modalExemplo" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Nova atividade física</h5>
                <!-- <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                    <span aria-hidden="true">&times;</span>
                </button> -->
            </div>
            <div class="modal-body">
                <form id="form-add-physical-activity">
                    <div class="form-group">
                        <input name="name" type="text" class="form-control" placeholder="Nome">
                    </div>
                    <div class="form-group">
                        <input name="time" type="text" class="form-control" placeholder="Tempo (Minutos)">
                    </div>
                    <div class="form-group">
                        <input name="calories" type="text" class="form-control" placeholder="Calorias">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn" data-dismiss="modal">Fechar</button>
                <button type="button" class="btn" onclick="pushPhysicalActivity();">Adicionar</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>