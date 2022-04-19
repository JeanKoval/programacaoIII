package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
		
		em = JpaUtils.getEntityManager();
		Session session = em.unwrap(Session.class);
//		SessionFactory sf = session.getSessionFactory();
		
		Query query = session.createQuery("from NotaFiscal where id=:id");
		query.setParameter("id", id);
//		int nf1 = query.getFirstResult();
		
		NotaFiscal nf1 = (NotaFiscal) query.getSingleResult(); 
//				em.find(NotaFiscal.class, id);
		try {
			out.write("nota: "+nf1.getNumero());			
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
