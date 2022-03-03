package JeanKoval.com.github.programa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import JeanKoval.com.github.classes.Cliente;
import JeanKoval.com.github.classes.Emissor;
import JeanKoval.com.github.classes.NotaFiscal;
import JeanKoval.com.github.classes.NotaFiscalBuilder;
import JeanKoval.com.github.classes.Produto;

public class Main {

	public static void main(String[] args) {
		
		Emissor emissor = new Emissor("Tech-Info SA", "12345678912345");
		Cliente cliente = new Cliente("Paixão Infraestrutura", "12345678912");
		Produto prod1   = new Produto("123", "teclado" , 10d, new BigDecimal(150));
		Produto prod2   = new Produto("456", "mouse"   ,  5d, new BigDecimal(20));
		Produto prod3   = new Produto("789", "head-set",  2d, new BigDecimal(1300));
		
		List<Produto> listaProdutos = new ArrayList<>();
		listaProdutos.add(prod1);
		listaProdutos.add(prod2);
		listaProdutos.add(prod3);
		
		
		NotaFiscal nota = NotaFiscalBuilder.builder()		
                		   .setDataEmissao(new Date())
                		   .setNumero("123456789")
                		   .setChave("987654321")		
                		   .setEmissor(emissor)
                		   .setCliente(cliente)
                		   .setListaProdutos(listaProdutos)
                		   .gera();
		
		System.out.println(nota);
	}

}
