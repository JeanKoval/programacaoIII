package JeanKoval.com.github.classes;

import java.io.IOException;
import java.util.List;

public class ValidaQuantProdutos extends Exception {

	public final Integer TAMANHO_MINIMO_LISTA = 1; 
	public List<Produto> listaProdutos;
	
	public ValidaQuantProdutos(List<Produto> listaProdutos) throws IOException {
		setListaProdutos(listaProdutos);
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) throws IOException {
		validaQuantProdutos(listaProdutos);
		this.listaProdutos = listaProdutos;
	}
	
	private void validaQuantProdutos(List<Produto> listaProdutos) throws IOException {
		if(listaProdutos.size() < 1) {
			throw new IOException("Lista de produtos da Nota deve conter no minimo 1 produto...");
		}
	}
	
	public List<Produto> getProdutosValidados(){
		return listaProdutos;
	}
}
