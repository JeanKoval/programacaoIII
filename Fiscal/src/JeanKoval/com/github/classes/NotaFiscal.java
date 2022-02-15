package JeanKoval.com.github.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {
	
	private String  numero;
	private Date    dataEmissao;
	private String  chave;
	
	private Emissor emissor;
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<>();
	
	public NotaFiscal(String numero, Date data, String chave, Emissor emissor, Cliente cliente, List<Produto> produtos) {
		this.numero      = numero;
		this.dataEmissao = data;
		this.chave 	     = chave;
		this.emissor     = emissor;
		this.cliente     = cliente;
		this.produtos    = produtos;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void getDataEmissao(Date data) {
		this.dataEmissao = data;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public Emissor getEmissor() {
		return emissor;
	}

	public void setEmissor(Emissor emissor) {
		this.emissor = emissor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void setProduto(Produto produto) {
		this.produtos.add(produto);
	}
}
