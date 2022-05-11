package br.com.hello.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.hello.repository.ContatoRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/remover")
public class RemoverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("id"));
		
		PrintWriter out = response.getWriter();
		ContatoRepository contatoRepository = new ContatoRepository();
		contatoRepository.delete(id);
		
		out.println("<html> <body> ");
		out.println("<h3> Removido com sucesso !!! </h3>");
		out.println("<a href=/helloworldweb/buscartodos>Voltar</a>");
		out.println("</html> </body> ");
		
	}

}
