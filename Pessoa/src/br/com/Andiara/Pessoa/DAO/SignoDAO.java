package br.com.Andiara.Pessoa.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Andiara.Pessoa.model.Signo;

public class SignoDAO {

	private final Connection con;

	public SignoDAO(Connection con) {
		this.con = con;
	}

	public List<Signo> lista() throws SQLException {
		List<Signo> lSigno = new ArrayList<>();

		String sql = "select * from signo";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();

			try (ResultSet rs = stmt.getResultSet()) {
				String nome = rs.getString("nome");
				int dia_inicio = rs.getInt("dia_inicio");
				int mes_inicio = rs.getInt("mes_inicio");
				int dia_fim = rs.getInt("dia_fim");
				int mes_fim = rs.getInt("mes_fim");
				Signo signo = new Signo(nome, dia_inicio, mes_inicio, dia_fim, mes_fim);
				lSigno.add(signo);
			}
		}
		return lSigno;
	}
}
