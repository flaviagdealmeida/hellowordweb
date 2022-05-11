package br.com.hello.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.com.hello.entity.Contato;
import br.com.hello.repository.ContatoRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/buscartodos")
public class BuscarTodosContatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h3> Contatos </h3>");

		List<Contato> lista;
		lista = new ContatoRepository().findAll();

		out.println("<table> ");
		out.println("<tr> ");
			out.println("<th>Nome </th>");
			out.println("<th>Email </th>");
		out.println("</tr> ");
		
		for (Contato contato : lista) {
			out.println("<tr> ");	
				out.println("<td>" + contato.getNome() + "</td> ");
				out.println("<td>" + contato.getEmail() + "</td> ");
				out.println("<td>" + " <a href=/helloworldweb/remover?id="+contato.getId()+"> Remover </a></td>");
				out.println("<td>" + " <a href=/helloworldweb/formAlterarCadastro.html> Atualizar </a></td>");
			out.println("</tr> ");
		}

		out.println("</table>");
		out.println("</body> </html>");

	}

}
