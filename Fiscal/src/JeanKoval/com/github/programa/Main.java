package JeanKoval.com.github.programa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import JeanKoval.com.github.classes.CNPJ;
import JeanKoval.com.github.classes.CPF;
import JeanKoval.com.github.classes.ChaveNF;
import JeanKoval.com.github.classes.Cliente;
import JeanKoval.com.github.classes.Emissor;
import JeanKoval.com.github.classes.NotaFiscal;
import JeanKoval.com.github.classes.NotaFiscalBuilder;
import JeanKoval.com.github.classes.Produto;

public class Main {

	public static void main(String[] args) {
		
		
		Emissor emissor = new Emissor("Tech-Info SA", new CNPJ("12345678912345"));
		Cliente cliente = new Cliente("Paixão Infraestrutura", new CPF("1234567891"));
		Produto prod1   = new Produto("123", "teclado" , 10d, new BigDecimal("150.00"));
		Produto prod2   = new Produto("456", "mouse"   ,  5d, new BigDecimal("20.00"));
		Produto prod3   = new Produto("789", "head-set",  2d, new BigDecimal("0.0001"));
		
		List<Produto> listaProdutos = new ArrayList<>();
		listaProdutos.add(prod1);
		listaProdutos.add(prod2);
		listaProdutos.add(prod3);
		
		
		NotaFiscal nota = NotaFiscalBuilder.builder()		
                		   .setDataEmissao(new Date())
                		   .setNumero("12345678")
                		   .setChave(new ChaveNF("11111111111111111111111111111111111111111111"))		
                		   .setEmissor(emissor)
                		   .setCliente(cliente)
                		   .setListaProdutos(listaProdutos)
                		   .gera();
		
		System.out.println(nota);
	}

}
