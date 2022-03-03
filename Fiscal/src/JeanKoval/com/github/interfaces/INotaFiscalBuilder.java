package JeanKoval.com.github.interfaces;

import java.util.Date;
import java.util.List;

import JeanKoval.com.github.classes.Cliente;
import JeanKoval.com.github.classes.Emissor;
import JeanKoval.com.github.classes.NotaFiscalBuilder;
import JeanKoval.com.github.classes.Produto;

public interface INotaFiscalBuilder {

	public NotaFiscalBuilder setDataEmissao(Date dataEmissao);
	public NotaFiscalBuilder setNumero(String numero);
	public NotaFiscalBuilder setChave(String chave);
	public NotaFiscalBuilder setEmissor(Emissor emissor);
	public NotaFiscalBuilder setCliente(Cliente cliente);
	public NotaFiscalBuilder setListaProdutos(List<Produto> listaProdutos);
	
}
