<%@page import="java.util.Map"%>
<%@page import="br.sisacademico.model.Curso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Map<Curso, Integer> listaDeCursos = (Map) session.getAttribute("listaDeCursos");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <jsp:include page="../menu.jsp"></jsp:include>
            <script>
                $(function () {
                    $('[data-toggle="tooltip"]').tooltip();
                });
            </script>
            <div class="container mt-4 pt-4">
                <div class="table-responsive-md" style="width: 90%; margin: 0 auto;">
                    <table class="table">
                        <thead class="thead-dark">
                        <th scope="col">Curso</th>
                        <th scope="col">Tipo de Curso</th>
                        <th scope="col"class="text-center">Qtd. de Alunos</th>
                        <th scope="col" class="text-center">Ver Alunos</th>
                        <th scope="col" class="text-center">Editar</th>
                        <th scope="col" class="text-center">Excluir</th>
                        </thead>
                        <tbody>
                        <% for (Map.Entry<Curso, Integer> c : listaDeCursos.entrySet()) {%>
                        <tr>
                            <td><%= c.getKey().getNomeCurso()%></td>
                            <td><%= c.getKey().getTipoCurso()%></td>
                            <td class="text-center"><%= c.getValue()%></td>

                            <% if (c.getValue() == 0) { %>   
                                <td class="text-center">
                                    <span data-toggle="tooltip" title="Sem alunos para exibir">
                                        <button class="btn btn-secondary" disabled>
                                            Alunos Matriculados
                                        </button>
                                    </span>
                                </td>

                                <td class="text-center"><a class="btn btn-outline-success" href="#">Editar</a></td>

                                <td class="text-center"><a class="btn btn-outline-danger" href="#">Excluir</a></td>

                            <% } else { %>
                                <td class="text-center"><a href="#" class="btn btn-outline-primary">Alunos Matriculados</a></td>

                                <td class="text-center"><a class="btn btn-outline-success" href="#">Editar</a></td>

                                <td class="text-center">
                                    <span data-toggle="tooltip" title="Não é possível excluir curso com alunos">
                                        <button class="btn btn-secondary" disabled>
                                            Excluir
                                        </button>
                                    </span>
                                </td>

                            <% } %>                        
                        </tr>
                        <% }%>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
