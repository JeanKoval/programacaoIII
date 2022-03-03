package JeanKoval.com.github.interfaces;

import java.util.Date;
import java.util.List;

import JeanKoval.com.github.classes.Cliente;
import JeanKoval.com.github.classes.Emissor;
import JeanKoval.com.github.classes.Produto;

public interface INotaFiscalBuilder {

	public void setDataEmissao(Date dataEmissao);
	public void setNumero(String numero);
	public void setChave(String chave);
	public void setEmissor(Emissor emissor);
	public void setCliente(Cliente cliente);
	public void setListaProdutos(List<Produto> listaProdutos);
	
}
