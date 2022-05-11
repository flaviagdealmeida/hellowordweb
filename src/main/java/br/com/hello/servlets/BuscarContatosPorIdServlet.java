package br.com.hello.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.hello.entity.Contato;
import br.com.hello.repository.ContatoRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/buscarporid")
public class BuscarContatosPorIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		PrintWriter out = response.getWriter();
		Contato contato = new Contato();
		ContatoRepository contatoRepository = new ContatoRepository();
		
		contato = contatoRepository.findById(id);
		
		out.println("<p>" + contato.getNome() + " : " + contato.getEmail() + "</p>");
		
	}

}
