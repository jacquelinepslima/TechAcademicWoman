package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//diz que e um servelt //endereco para acessar no navegador
@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        
    	//pega o objeto que sabe mandar mensagem ao usuario
    	PrintWriter out = resp.getWriter();
    	
    	//monta o html 
        out.println("<html>");
        out.println("<body>");
        out.println("Oi Mundo, Seu primeiro Servlet");
        out.println("</body>");
        out.println("</html>");

        System.out.println("Chamou o servlet Oi");

    }
}
