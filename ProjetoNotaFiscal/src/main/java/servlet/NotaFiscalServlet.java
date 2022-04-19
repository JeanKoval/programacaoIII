package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.NotaFiscal;
import classes.NotaFiscalBuilder;
import hibernate.utils.JpaUtils;

@WebServlet(
        name = "NotaFiscal",
        urlPatterns = {"/notaFiscal"}
)
public class NotaFiscalServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Integer id = null;
		EntityManager em = null;
		NotaFiscal nf = null;
		
		try {
			id = Integer.parseInt(req.getParameter("id"));
		}catch(NumberFormatException nb) {
			out.write("Erro ao recuperar o numero da Nota Fiscal");
			return;
		}
		
		NotaFiscal nf1 = em.find(NotaFiscal.class, id);
		try {
			em = JpaUtils.getEntityManager();
			out.write("id: "+id);			
		}catch(Exception e) {
			e.printStackTrace();
			out.write("Não foi possivel recuperar o id informado do Banco de Dados!");
			return;
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

}
