<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String a, b, c, delta, rP, rN;
    boolean temRaizes = false;
    a = request.getParameter("a");
    b = request.getParameter("b");
    c = request.getParameter("c");
    delta = request.getParameter("delta");
    rP = rN = "";

    if (request.getParameter("rP") != null) {
        temRaizes = true;
        rP = request.getParameter("rP");
        rN = request.getParameter("rN");
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bhaskara - Resultados</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <h1>Resultados</h1>
        <hr>

        <div class="corpo">
            <p class="equacao">Dada a equação <%=a%>X² + <%=b%>x + <%=c%> = 0, temos: </p>
            <ul>
                <li>Delta = <%=delta%></li>
                <% if (temRaizes) {%>
                    <li>X' = <%=rP%></li>
                    <li>X" = <%=rN%></li>
                <% } else { %>
                    <li>Não há raízes pois delta é menor que 0!</li>
                <% }%>
            </ul>
            <br>
            <a href="./">Calcular novamente...</a>
        </div>
    </body>
</html>
