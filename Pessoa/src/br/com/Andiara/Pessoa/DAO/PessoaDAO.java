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

	
	public String consultaSigno(Pessoa pessoa) throws SQLException{
			
			String sql = "SELECT";
			sql += "PESSOA.NOME AS NOME_PESSOA,"; 
			sql += "SIGNOS.NOME_SIGNO AS NOME_SIGNO";
			sql += "FROM ";
			sql += "PESSOA";
			sql += "INNER JOIN";
			sql += "(";
			sql += "SELECT";
			sql += "SIGNO.NOME AS NOME_SIGNO,"; 
			sql += "SIGNO.DIA_INICIO AS DIA_INICIO,";
			sql += "SIGNO.MES_INICIO AS MES_INICIO,";
			sql += "SIGNO.DIA_FIM AS DIA_FIM,";
			sql += "SIGNO.MES_FIM AS MES_FIM";
			sql += "FROM";
			sql += "SIGNO";
			sql += " ) SIGNOS ON ";
			sql += "TO_DATE(TO_CHAR(PESSOA.DATA_NASC, 'DD/MM'), 'DD/MM')";
			sql += "BETWEEN  ";
			sql += "TO_DATE(( TO_CHAR(SIGNOS.DIA_INICIO) ||'/'|| TO_CHAR(SIGNOS.MES_INICIO) ), 'DD/MM') AND TO_DATE(( TO_CHAR(SIGNOS.DIA_FIM) ||'/'|| TO_CHAR(SIGNOS.MES_FIM) ), 'DD/MM');";
			sql += "WHERE PESSOA.CODIGO =" + pessoa.getCodigo();
			
			String dados ="";
			
			try (PreparedStatement stmt = con.prepareStatement(sql)) {

				stmt.execute();

				try (ResultSet rs = stmt.getResultSet()) {
					String nomePessoa = rs.getString("nome_pessoa");
					String signo = rs.getString("nome_signo");
					dados = "Pessoa: "  + nomePessoa + " Signo: " + signo;
					
				}
			}
		
		return dados;
		
	}
	
}
