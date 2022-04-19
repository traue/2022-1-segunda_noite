<%@page contentType="text/html" pageEncoding="UTF-8"%>\
<%
    double delta = 0;

    if ((request.getParameter("delta") != null))  {
        delta = Double.parseDouble(request.getAttribute("delta").toString());
    }
    double x1 = 0;
    double x2 = 0;
    
    if(delta < 0) {
        x1 = Double.parseDouble(request.getAttribute("x1").toString());
        x2 = Double.parseDouble(request.getAttribute("x2").toString());
    }
    
//paramos aqui.. precisa corrigir o erro... :P
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
            <p class="equacao">Dada a equação ${valorA}X² + ${valorB}x + ${valorC} = 0, temos: </p>
            <ul>
                <li>Delta = <%=delta%></li>
                    <% if (delta < 0) { %>
                <li>Não há raízes pois delta é menor que 0!</li>
                    <% } else {%>

                <li>X' = <%= x1%></li>
                <li>X" = <%= x2%></li>
                    <% }%>
            </ul>
        </div>
    </body>
</html>
