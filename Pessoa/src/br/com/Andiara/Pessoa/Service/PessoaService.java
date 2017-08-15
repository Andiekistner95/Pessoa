package br.com.Andiara.Pessoa.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.Andiara.Pessoa.DAO.PessoaDAO;
import br.com.Andiara.Pessoa.jdbc.oracle.ConnectionPoolOracle;
import br.com.Andiara.Pessoa.model.Pessoa;


public class PessoaService {
	
	public List<Pessoa> lPessoas() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new PessoaDAO(con).lista();
		}
		
	}
	
	public void consultaSigno(Pessoa pessoa) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            System.out.println( new PessoaDAO(con).consultaSigno(pessoa));
		}
	}

}
