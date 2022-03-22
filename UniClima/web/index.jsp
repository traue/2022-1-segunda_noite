<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UniClima</title>
        <link rel="icon" type="image/x-icon" href="./img/favicon.ico">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="#">
                <img src="./img/logo.png" width="30" height="30" class="d-inline-block align-top" alt="">
                UniClima
            </a>
            <form class="form-inline" method="post">
                <input class="form-control mr-sm-2" type="search" name="cidade" placeholder="Informe uma cidade" aria-label="Pesquisar">
                <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Buscar</button>
            </form>
        </nav>

    </body>
</html>