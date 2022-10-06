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

@WebServlet(urlPatterns = "/alteraColaborador")
public class AlteraColaboradorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	
    	System.out.println("Alterando Empresa");
    	
        String nome = request.getParameter("nome");
        String data = request.getParameter("data");
 
    	Integer id = Integer.valueOf(request.getParameter("id"));
         
        Date dataFormatada = null;
        
        try {
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataFormatada = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
        
        Banco banco = new Banco();
        
        Colaborador colaborador = banco.findById(id);
        colaborador.setNomeColaborador(nome);
        colaborador.setDataNascimento(dataFormatada);
        
        System.out.println(banco.getColaboradores());

        //mensagem do lado do servidor
        System.out.println("Alterando Colaborador: " + nome);

        response.sendRedirect("listaColaborador");
        
        System.out.println("Colaborador Alterado!");

    }
      
}
