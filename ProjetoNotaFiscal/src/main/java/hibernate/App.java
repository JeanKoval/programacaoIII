package hibernate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import classes.CNPJ;
import classes.CPF;
import classes.ChaveNF;
import classes.Cliente;
import classes.Emissor;
import classes.NotaFiscal;
import classes.NotaFiscalBuilder;
import classes.Produto;
import hibernate.utils.JpaUtils;

public class App {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<Produto>();
		Produto prod = new Produto("1458", "produto velho", 14.0d, new BigDecimal("70"));
		lista.add(prod);
		
		EntityManager em = JpaUtils.getEntityManager();
		
		em.getTransaction().begin(); // mode edição
		em.persist(new NotaFiscalBuilder().builder()
					.setChave(new ChaveNF("33333333333333333333333333333333333333333333"))
					.setCliente(new Cliente("Fernando", new CPF("16516515154")))
					.setDataEmissao(new Date())
					.setEmissor(new Emissor("Empresa Velha", new CNPJ("16151151546125")))
					.setListaProdutos(lista)
					.setNumero("121346347")
					.gera()
				); // gravar o objeto
		em.getTransaction().commit(); // grava o objeto no banco
	}

}
