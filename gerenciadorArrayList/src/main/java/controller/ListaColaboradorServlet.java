package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Banco;
import model.Colaborador;

@WebServlet("/listaColaborador")
public class ListaColaboradorServlet extends HttpServlet {

	private static final long serialVersionUID = 1;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		Banco banco = new Banco();
		List<Colaborador> listaColaboradores = banco.getColaboradores();
		
		// pega o objeto para escrever caracteres do lado do client
		PrintWriter out = resp.getWriter();

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/listaColaborador.jsp");
		req.setAttribute("listaColaboradores", listaColaboradores);
		
		requestDispatcher.forward(req, resp);
		
	}

}
