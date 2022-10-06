package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Banco;
import model.Colaborador;

@WebServlet(urlPatterns = "/mostraColaborador")
public class MostraColaboradorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	
    	Integer id = Integer.valueOf(request.getParameter("id"));
    	System.out.println(id);
    	
    	Banco banco = new Banco();
    	Colaborador colaborador = banco.findById(id);
    	
    	request.setAttribute("colaborador", colaborador);
    	RequestDispatcher rq = request.getRequestDispatcher("/formAlteraColaborador.jsp");
    	rq.forward(request, response);
    	
    	
    	
        //mensagem do lado do servidor
        System.out.println("Alterando Colaborador: " + colaborador);

        //pega o objeto para escrever caracteres do lado do client
        PrintWriter out = response.getWriter();

        //out.println("<html><body>Empresa " + nome +  " Cadastrada com Sucesso!</body></html>");


    }
}
