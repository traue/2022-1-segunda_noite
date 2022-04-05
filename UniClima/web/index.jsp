<%@page import="br.uninove.clima.utils.StrUtils"%>
<%@page import="br.uninove.uniclima.http.Http"%>
<%@page import="br.uninove.clima.Clima"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");
    Clima clima = null;
    String cidade = "";

    if (request.getParameter("cidade") != null) {
        cidade = request.getParameter("cidade");
        clima = Http.getClima(cidade);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UniClima</title>
        <link rel="icon" type="image/x-icon" href="./img/favicon.ico">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <style>
            .clima-card {
                padding-top: 50px;
                width: 400px;
                margin: 0 auto;
            }
        </style>
    </head>
    <body>
        <!-- barra de navegação-->
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="#">
                <img src="./img/logo.png" width="30" height="30" class="d-inline-block align-top" alt="">
                UniClima
            </a>
            <form class="form-inline" method="post">
                <input class="form-control mr-sm-2" type="search" required name="cidade" placeholder="Informe uma cidade" aria-label="Pesquisar">
                <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Buscar</button>
            </form>
        </nav>

        <!-- card pro clima-->
        <% if (clima != null) {%>
        <div class="container">
            <div class="row">
                <div class="clima-card">
                    <div class="card border-primary">
                        <div class="card-body">
                            <div class="text-center">
                                <img src="https://openweathermap.org/img/wn/<%=clima.getWeather().get(0).getIcon()%>@2x.png">
                                <h4><%= clima.getName() + ", " + clima.getSys().getCountry()%></h4>
                                <h3><%= String.format("%.2f", clima.getMain().getTemp())%> ºC</h3>
                            </div>
                            <hr>
                            <div>
                                <p><b>Agora: </b><%= StrUtils.primeiraMaiuscula(clima.getWeather().get(0).getDescription())%></p>
                                <p><b>Máxima: </b><%= String.format("%.2f", clima.getMain().getTempMax())%> ºC</p>
                                <p><b>Mínima: </b><%= String.format("%.2f", clima.getMain().getTempMin())%> ºC</p>
                                <p><b>Sensação térmica: </b><%= String.format("%.2f", clima.getMain().getFeelsLike())%> ºC</p>
                                <p><b>Umidade relativa do ar: </b><%= clima.getMain().getHumidity()%>%</p>
                                <p><b>Pressão atmosférica: </b><%= clima.getMain().getPressure()%>hPa</p>
                                <p><b>Visibilidade: </b><%= clima.getVisibility()%>Km</p>
                                <p><b>Vento: </b></p>
                                <ul>
                                    <li><b>Direção: </b><%= clima.getWind().getDeg()%>º</li>
                                    <li><b>Velocidade </b><%= String.format("%.2f", clima.getWind().getSpeed())%>m/s</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <% } else {%>
        <div class="container">
            <div class="row">
                <div class="clima-card">
                    <div class="card border-danger">
                        <div class="card-body">
                            <div class="text-center">
                                <h4><%= cidade.isEmpty()
                                            ? "Digite uma cidade"
                                            : "Cidade não encontrada"%>
                                </h4>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <% }%>
    </body>
</html>