<%@page import="br.sisacademico.model.Aluno"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Aluno> alunos = (ArrayList)session.getAttribute("listaDeAlunos");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <jsp:include page="../menu.jsp"></jsp:include>
        
        <div class="container mt-4 pt-4">
            <div class="table-responsive-md" style="width: 90%; margin: 0 auto;">
                <table class="table">
                    <thead class="thead-dark">
                        <th scope="col">RA</th>
                        <th scope="col">Nome do Aluno</th>
                        <th scope="col">Curso</th>
                        <th scope="col">Tipo de Curso</th>
                        <th scope="col" class="text-center">Editar</th>
                        <th scope="col" class="text-center">Excluir</th>
                    </thead>
                    <tbody>
                        <% for(Aluno a : alunos) { %>
                        <tr>
                            <td><%= a.getRa() %></td>
                            <td><%= a.getNome()%></td>
                            <td><%= a.getCurso().getNomeCurso() %></td>
                            <td><%= a.getCurso().getTipoCurso()%></td>
                            <td class="text-center"><a href="#" class="btn btn-outline-primary">Editar</a></td>
                            <td class="text-center"><a href="#" class="btn btn-outline-danger">Excluir</a></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
