package br.univel.units;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Venda implements Serializable{

	private Integer codvenda;
	private List<String> itens;
	private BigDecimal valor;

	public Integer getCodvenda() {
		return codvenda;
	}
	public void setCodvenda(Integer codvenda) {
		this.codvenda = codvenda;
	}
	public List<String> getItens() {
		return itens;
	}
	public void setItens(List<String> itens) {
		this.itens = itens;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
