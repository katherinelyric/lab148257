package br.univel.units;

import java.io.Serializable;

public class Entrega implements Serializable{

	private String endereco;
	private Integer codentrega;

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getCodentrega() {
		return codentrega;
	}
	public void setCodentrega(Integer codentrega) {
		this.codentrega = codentrega;
	}



}
