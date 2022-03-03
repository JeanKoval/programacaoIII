package JeanKoval.com.github.classes;

import java.util.Date;
import java.util.List;

import JeanKoval.com.github.interfaces.INotaFiscalBuilder;

public class NotaFiscalBuilder implements INotaFiscalBuilder {
	
	private Date dataEmissao;
	private String numero;
	private String chave;
	private Emissor emissor;
	private Cliente cliente;
	private List<Produto> listaProdutos;

	@Override
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;		
	}

	@Override
	public void setNumero(String numero) {
		this.numero = numero;
		
	}

	@Override
	public void setChave(String chave) {
		this.chave = chave;
		
	}

	@Override
	public void setEmissor(Emissor emissor) {
		this.emissor = emissor;
		
	}

	@Override
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;		
	}

	@Override
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
		
	}
	
	public NotaFiscal gera() {
		return new NotaFiscal(this.numero, this.dataEmissao, this.chave, this.emissor, this.cliente, this.listaProdutos);
	}

}
