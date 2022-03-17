<%@page import="br.uninove.Imc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    float peso = Float.parseFloat(request.getParameter("peso"));
    float altura = Float.parseFloat(request.getParameter("altura"));
    float resultado = 0;
    Imc imc = new Imc();

    imc.setPeso(peso);
    imc.setAltura(altura);

    resultado = imc.calculaIMC();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora IMC - Resultados</title>
    </head>
    <body>
        <h1>Calculadora IMC - Resultados</h1>
        <hr>
        <ul>
            <li><b>Peso informado: </b><%= peso%></li>
            <li><b>Altura informada: </b><%= altura%></li>
            <li><b>IMC </b><%= resultado%></li>
        </ul>
    </body>
</html>
