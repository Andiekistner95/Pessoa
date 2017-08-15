package br.com.Andiara.Pessoa.Teste;

import java.sql.SQLException;
import java.util.List;

import br.com.Andiara.Pessoa.Service.PessoaService;
import br.com.Andiara.Pessoa.model.Pessoa;

public class PessoaTeste {

	
	public static void main(String[] args) throws SQLException {
		List<Pessoa> lPessoa = new PessoaService().lPessoas();
		for (Pessoa pessoa : lPessoa) {
			System.out.println(pessoa.getNome());
		

        }
	}
}
