package br.urna.dao;

import br.urna.model.Eleicao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EleicaoDao {

    private static Connection conn = null;
    private static Statement stm = null;

    public static ArrayList<Eleicao> getEleicoes() throws SQLException {
        ArrayList<Eleicao> eleicoes = new ArrayList<>();

        conn = ConnectionFactory.getConnection();

        stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

        String query = "SELECT idEleicao, nomeEleicao, descricao "
                + "FROM tb_eleicao "
                + "ORDER BY nomeEleicao";

        ResultSet resultados = stm.executeQuery(query);

        while (resultados.next()) {
            Eleicao e = new Eleicao();
            e.setIdEleicao(resultados.getInt("idEleicao"));
            e.setNomeEleicao(resultados.getString("nomeEleicao"));
            e.setDescricao(resultados.getString("descricao"));

            eleicoes.add(e);
        }

        return eleicoes;
    }
}
