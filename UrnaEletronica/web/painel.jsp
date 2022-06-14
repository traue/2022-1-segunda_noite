<%@page import="br.urna.dao.EleicaoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.urna.model.Eleicao"%>
<%@page import="br.urna.model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Usuario sysUser = null;
    if (session.getAttribute("sysuser") != null) {
        sysUser = (Usuario) session.getAttribute("sysUser");
    } else {
        response.sendRedirect("./?erroLogin=true");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Urna Eletrônica - Painel</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand text-white">Urna Eletrônica</a>
                <form class="d-flex">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active text-white" aria-current="page" href="./">Sair</a>
                        </li>
                    </ul>
                </form>
            </div>
        </nav>
        <div class="container mt-4">
            <div class="painel">
                <div class="card">
                    <h3>Eleições cadastradas</h3>
                    <ul>
                    <%
                        ArrayList<Eleicao> eleicoes = new ArrayList<>();
                        eleicoes = EleicaoDao.getEleicoes();
                        for(Eleicao e: eleicoes) {
                    %> 
                    <li><%= e.getNomeEleicao() %></li>
                    <% } %>
                    </ul>
                </div>
            </div>
        </div>

    </body>
</html>
