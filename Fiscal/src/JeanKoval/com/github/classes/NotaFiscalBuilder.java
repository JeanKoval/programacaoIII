package JeanKoval.com.github.classes;

import java.util.Date;
import java.util.List;

import JeanKoval.com.github.interfaces.INotaFiscalBuilder;

public class NotaFiscalBuilder implements INotaFiscalBuilder {
	
	private Date dataEmissao;
	private String numero;
	private ChaveNF chave;
	private Emissor emissor;
	private Cliente cliente;
	private List<Produto> listaProdutos;

	@Override
	public NotaFiscalBuilder setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
		return this;		
	}

	@Override
	public NotaFiscalBuilder setNumero(String numero) {
		this.numero = numero;
		return this;
	}

	@Override
	public NotaFiscalBuilder setChave(ChaveNF chave) {
		this.chave = chave;
		return this;
	}

	@Override
	public NotaFiscalBuilder setEmissor(Emissor emissor) {
		this.emissor = emissor;
		return this;
	}

	@Override
	public NotaFiscalBuilder setCliente(Cliente cliente) {
		this.cliente = cliente;	
		return this;
	}

	@Override
	public NotaFiscalBuilder setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
		return this;
	}
	
	public NotaFiscal gera() {
		return new NotaFiscal(this.numero, this.dataEmissao, this.chave, this.emissor, this.cliente, this.listaProdutos);
	}
	
	public static NotaFiscalBuilder builder() {
		return new NotaFiscalBuilder();
	}

}
