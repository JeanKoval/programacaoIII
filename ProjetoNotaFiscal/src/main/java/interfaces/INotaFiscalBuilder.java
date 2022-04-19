package interfaces;

import java.util.Date;
import java.util.List;

import classes.ChaveNF;
import classes.Cliente;
import classes.Emissor;
import classes.NotaFiscalBuilder;
import classes.Produto;

public interface INotaFiscalBuilder {

	public NotaFiscalBuilder setDataEmissao(Date dataEmissao);
	public NotaFiscalBuilder setNumero(String numero);
	public NotaFiscalBuilder setChave(ChaveNF chave);
	public NotaFiscalBuilder setEmissor(Emissor emissor);
	public NotaFiscalBuilder setCliente(Cliente cliente);
	public NotaFiscalBuilder setListaProdutos(List<Produto> listaProdutos);
	
}
