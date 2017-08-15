package br.com.Andiara.Pessoa.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.Andiara.Pessoa.model.Pessoa;
import br.com.Andiara.Pessoa.model.Signo;

public class PessoaDAO {

	private Connection con;

	public PessoaDAO(Connection con) {
		this.con = con;
	}

	public List<Pessoa> lista() throws SQLException {
		List<Pessoa> lPessoa = new ArrayList<>();

		String sql = "SELECT * FROM PESSOA";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.execute();

			try (ResultSet rs = stmt.getResultSet()) {
				int codigo = rs.getInt("codigo");
				String nome = rs.getString("nome");
				Date data_nasc = rs.getDate("data_nasc");
				Pessoa pessoa = new Pessoa(codigo, nome, data_nasc);
				lPessoa.add(pessoa);
			}
		}

		return lPessoa;
	}
	
	public String consultaSigno(Pessoa pessoa,Signo signo) throws SQLException{
		String sql = ""
		
		
		
		
	}

}
