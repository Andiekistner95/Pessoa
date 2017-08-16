package br.com.Andiara.Pessoa.model;

import java.util.Date;

public class Pessoa {

	public Signo getSigno() {
		return signo;
	}

	public void setSigno(Signo signo) {
		this.signo = signo;
	}

	private int codigo;
	private String nome;
	private Date data_nasc;
	private Signo signo;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(int codigo,String nome, Date data_nasc) {
		setCodigo(codigo);
		setNome(nome);
		setData_nasc(data_nasc);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\nCodigo: "+getCodigo();
		dados+= "\nNome: "+getNome();
		dados += "\nData de nascimento: "+ getData_nasc();
		return dados;
	}

}
