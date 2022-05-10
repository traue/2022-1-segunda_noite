<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <jsp:include page="../menu.jsp"></jsp:include>
        
        <script>
            $(document).ready(function () {
                const urlParams = new URLSearchParams(window.location.search);
                const pagina = urlParams.get('pagina');
                
                if(pagina == 'alunos') {
                    //carrega usando o servlet de aluno...
                    console.log("vou carregar os alunos...");
                } else {
                    //carrega usando o servlet de curso...
                    console.log("vou carregar os cursos...");
                }
                //paramos aqui
            });
        </script>
        
        <div class="text-center mt-4 pt-4">
            <img src="../img/loading.gif" alt="Carregando...">
        </div>
    </body>
</html>
