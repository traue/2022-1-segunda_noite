package br.sisacademico.dao;

import br.sisacademico.model.Curso;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;

public class CursoDao {

    private static Statement stm = null;

    public Map<Curso, Integer> getTodosCursosCountAlunos() throws SQLException {

        Map<Curso, Integer> relatorio = new LinkedHashMap<>();

        String query = "SELECT"
                + "    CURSO.ID,"
                + "    CURSO.NOME_CURSO,"
                + "    CURSO.TIPO_CURSO,"
                + "    (SELECT COUNT(*)"
                + "       FROM TB_ALUNO"
                + "      WHERE TB_ALUNO.ID_CURSO = CURSO.ID) AS QTD_ALUNOS"
                + " FROM"
                + "    TB_CURSO AS CURSO"
                + " ORDER BY CURSO.NOME_CURSO";

        stm = ConnectionFactory.getConnection().createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

        ResultSet resultados = stm.executeQuery(query);

        while (resultados.next()) {
            Curso c = new Curso();
            c.setIdCurso(resultados.getInt("ID"));
            c.setNomeCurso(resultados.getString("NOME_CURSO"));
            c.setTipoCurso(resultados.getString("TIPO_CURSO"));
            int qdtAlunos = resultados.getInt("QTD_ALUNOS");

            relatorio.put(c, qdtAlunos);
        }

        stm.getConnection().close();

        return relatorio;
    }
}
