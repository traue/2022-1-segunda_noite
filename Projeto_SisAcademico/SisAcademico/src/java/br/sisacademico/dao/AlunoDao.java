package br.sisacademico.dao;

import br.sisacademico.model.Aluno;
import br.sisacademico.model.Curso;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AlunoDao {

    private static Statement stm = null;

    public ArrayList<Aluno> getAlunos() throws SQLException {
        ArrayList<Aluno> alunos = new ArrayList<>();

        String query = "SELECT"
                + "    aluno.ID AS ID_ALUNO,"
                + "    aluno.RA,"
                + "    aluno.NOME,"
                + "    curso.ID AS ID_CURSO,"
                + "    curso.NOME_CURSO,"
                + "    curso.TIPO_CURSO"
                + " FROM"
                + "    TB_ALUNO as aluno"
                + "    INNER JOIN TB_CURSO as curso"
                + "        ON aluno.ID_CURSO = curso.ID";

        query += " ORDER BY aluno.NOME";
        
        stm = ConnectionFactory.getConnection().createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY);
        
        ResultSet resultados = stm.executeQuery(query);
        
        while(resultados.next()) {
            Aluno a = new Aluno();
            Curso c = new Curso();
            
            a.setIdAluno(resultados.getInt("ID_ALUNO"));
            a.setRa(resultados.getInt("RA"));
            a.setNome(resultados.getString("NOME"));
            
            c.setIdCurso(resultados.getInt("ID_CURSO"));
            c.setNomeCurso(resultados.getString("NOME_CURSO"));
            c.setTipoCurso(resultados.getString("TIPO_CURSO"));
            
            a.setCurso(c);
            
            alunos.add(a);
        }
        return alunos;
    }

}
