package br.com.Andiara.Pessoa.model;

public class Signo {

	private String nome;
	private int dia_incio;
	private int dia_fim;
	private int mes_incio;
	private int mes_fim;

	public Signo() {
		// TODO Auto-generated constructor stub
	}
	
	public Signo(String nome,int dia_inicio,int mes_inicio,int dia_fim,int mes_fim) {
	setNome(nome);
	setDia_incio(dia_inicio);
	setMes_incio(mes_inicio);
	setDia_fim(dia_fim);
	setMes_fim(mes_fim);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDia_incio() {
		return dia_incio;
	}

	public void setDia_incio(int dia_incio) {
		this.dia_incio = dia_incio;
	}

	public int getDia_fim() {
		return dia_fim;
	}

	public void setDia_fim(int dia_fim) {
		this.dia_fim = dia_fim;
	}

	public int getMes_incio() {
		return mes_incio;
	}

	public void setMes_incio(int mes_incio) {
		this.mes_incio = mes_incio;
	}

	public int getMes_fim() {
		return mes_fim;
	}

	public void setMes_fim(int mes_fim) {
		this.mes_fim = mes_fim;
	}

}
