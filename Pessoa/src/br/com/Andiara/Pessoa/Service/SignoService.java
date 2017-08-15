package br.com.Andiara.Pessoa.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.Andiara.Pessoa.DAO.SignoDAO;
import br.com.Andiara.Pessoa.jdbc.oracle.ConnectionPoolOracle;
import br.com.Andiara.Pessoa.model.Signo;


public class SignoService {
	
	public List<Signo> listarBandas() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new SignoDAO(con).lista();
		}
		
	}

}
