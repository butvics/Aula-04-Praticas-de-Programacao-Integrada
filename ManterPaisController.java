package br.usjt.OO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ManterPaisController
 */
@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pNomePais = request.getParameter("nomePais");
		long pPopulacaoPais = Long.parseLong(request.getParameter("populacaoPais"));
		double pAreaPais = Double.parseDouble(request.getParameter("areaPais"));
		
		Pais pais = new Pais();
		pais.setNomePais(pNomePais);
		pais.setPopulacaoPais(pPopulacaoPais);
		pais.setAreaPais(pAreaPais);
		
		PaisService cs = new PaisService();
		int idPais = cs.criar(pais);
		pais = cs.carregar(idPais);
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Cliente Cadastrado</title></head><body>");
		out.println(	"Id: "+pais.getIdPais()+"<br>");
		out.println(	"Nome: "+pais.getNomePais()+"<br>");
		out.println(	"População: "+pais.getPopulacaoPais()+"<br>");
		out.println(	"Área: "+pais.getAreaPais()+"<br>");
	    out.println("</body></html>");
	}
}