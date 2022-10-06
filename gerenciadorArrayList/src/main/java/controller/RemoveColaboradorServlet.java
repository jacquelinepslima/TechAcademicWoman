package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Banco;
import model.Colaborador;

@WebServlet(urlPatterns = "/removeColaborador")
public class RemoveColaboradorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    	System.out.println("Chamou o Servlet Remove Empresa");
    	
    	Integer id = Integer.valueOf(request.getParameter("id"));
    	System.out.println(id);
    	
    	Banco banco = new Banco();
        banco.remove(id);
        
    	//mensagem do lado do servidor
        System.out.println("Removendo Colaborador: " + id);

        response.sendRedirect("listaColaborador");
        
        System.out.println("Colaborador Removido");
        

    }
    
}
