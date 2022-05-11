package br.com.hello.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.hello.entity.Contato;
import br.com.hello.repository.ContatoRepository;

@WebServlet(urlPatterns = "/atualizar")
public class AtualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
					
		Contato contato = new Contato(nome, email);
		contato.setId(id);
		
		PrintWriter out = response.getWriter();
		ContatoRepository contatoRepository = new ContatoRepository();
		
		contatoRepository.update(contato);

		out.println("<html> <body> <h3> Nome: " + nome + " alterado com sucesso!!! </h3> ");
		out.println("<a href=/helloworldweb/buscartodos>Voltar</a></body></html>");
			
	}

}
