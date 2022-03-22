package JeanKoval.com.github.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {
	
	public static StringBuilder sb = new StringBuilder();
	
	public final Integer TAMANHO_NUMERO_NOTA = 9;
	private String  numero;
	private Date    dataEmissao;
	private ChaveNF chave;
	
	private Emissor emissor;
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<>();
	
	public NotaFiscal(String numero, Date data, ChaveNF chave, Emissor emissor, Cliente cliente, List<Produto> produtos) {
		setNumero(numero);
		setProdutos(produtos);
		this.dataEmissao = data;
		this.chave 	     = chave;
		this.emissor     = emissor;
		this.cliente     = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		try {
			this.numero = validaTamanhoNumero(numero);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String validaTamanhoNumero(String numero) throws IOException {
		if(numero.length() > TAMANHO_NUMERO_NOTA) {
			throw new IOException("Numero da nota deve conter no maximo 9 digitos...");
		}else {
			return String.format("%09d", Integer.parseInt(numero));			
		}
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void getDataEmissao(Date data) {
		this.dataEmissao = data;
	}

	public ChaveNF getChave() {
		return chave;
	}

	public void setChave(ChaveNF chave) {
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
		try {
			this.produtos = new ValidaQuantProdutos(produtos).getListaProdutos();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	@Override
	public String toString() {
		
		sb.append("Nota Fiscal: " + this.numero);
		sb.append("\nData Emissão: " + this.dataEmissao);
		sb.append("\nChave: " + this.chave);
		sb.append("\nEmissor: " + this.emissor);
		sb.append("\nCliente: " + this.cliente);
		sb.append("\nProdutos: ");
		this.toStringProd();
		return sb.toString();
	}
	
	public void toStringProd() {
		Integer x = 1;
		for(Produto prod : produtos) {
			sb.append("\n\tProduto "+x+":");
			sb.append("\n"+prod);
			x++;
		}
	}
}
