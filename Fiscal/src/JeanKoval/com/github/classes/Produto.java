package JeanKoval.com.github.classes;

import java.math.BigDecimal;

public class Produto {

	private String     codigo;
	private String 	   descricao;
	private Double     quantidade;
	private BigDecimal valor;
	
	public Produto(String codigo, String descricao, Double quantidade, BigDecimal valor) {
		this.codigo 	= codigo;
		this.descricao 	= descricao;
		this.quantidade = quantidade;
		this.valor 		= valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Codigo: "+this.codigo);
		sb.append("\nDescrição: "+this.descricao);
		sb.append("\nQuantidade: "+this.quantidade);
		sb.append("\nValor: "+this.valor);
		return sb.toString();
	}
}
