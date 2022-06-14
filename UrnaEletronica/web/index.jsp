<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.invalidate();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Urna Eletrônica - Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
        <div class="formLogin">
            <form method="post" action="SiginController">
                <div class="form-group">
                    <label>Usuário</label>
                    <input type="text" class="form-control" name="usuario" required>
                </div>

                <div class="form-group mt-4">
                    <label>Senha</label>
                    <input class="form-control" type="password" name="senha" required>
                </div>

                <div class="form-group mt-4">
                    <input type="submit" class="btn w-100 btn-info" value="Entrar">
                </div>
                <% if (request.getParameter("erroLogin") != null) { %>
                <div class="erroLogin">
                    <p>Erro na autenticação</p>
                </div>
                <% }%>
            </form>
        </div>
    </body>
</html>
