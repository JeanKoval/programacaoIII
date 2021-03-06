package classes;

import java.io.IOException;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	private String     codigo;
	private String 	   descricao;
	private Double     quantidade;
	private BigDecimal valor;
	
	public final BigDecimal VALOR_MINIMO_PRECO = new BigDecimal("0.0");
	
	public Produto() {}
	
	public Produto(String codigo, String descricao, Double quantidade, BigDecimal valor) {
		setCodigo(codigo);
		setValor(valor);
		this.descricao 	= descricao;
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		try {
			validacodigoMenorQueZero(codigo);
			this.codigo = formataCodigo(codigo);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
		try {
			validaValorMaiorQueZero(valor);
			this.valor = valor;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void validacodigoMenorQueZero(String numero) throws IOException {
		if(Integer.parseInt(numero) <= 0) {
			throw new IOException("Codigo do produto não pode ser menor que zero...");
		}
	}
	
	public String formataCodigo(String codigo) {
		return String.format("%05d", Integer.parseInt(codigo));
	}
	
	public void validaValorMaiorQueZero(BigDecimal valor) throws IOException {
		if(valor.compareTo(VALOR_MINIMO_PRECO) <= 0) {
			throw new IOException("Valor do Produto deve ser maior que zero...");
		}
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
