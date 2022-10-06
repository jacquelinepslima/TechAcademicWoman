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

@WebServlet(urlPatterns = "/Colaborador")
public class CadastraColaboradorServlet extends HttpServlet {

//	@Autowired
//	private ColaboradorRepository colaboradorRepository;
	
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    	System.out.println("Chamou o servlet Colaborador");
    	
        String nome = request.getParameter("nome");
        String data = request.getParameter("data");
        
        Colaborador colaborador = new Colaborador();
        colaborador.setNomeColaborador(nome);
        
        Date dataFormatada = null;
        
        try {
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataFormatada = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
        
        colaborador.setDataNascimento(dataFormatada);
        
        //colaboradorRepository.save(colaborador);
       
       
        Banco banco = new Banco();
        banco.add(colaborador);
        System.out.println(banco.getColaboradores());

        //mensagem do lado do servidor
        System.out.println("Cadastrando novo Colaborador: " + nome);

        //pega o objeto para escrever caracteres do lado do client
        PrintWriter out = response.getWriter();

//        //chamar o JSP 
//        RequestDispatcher rd = request.getRequestDispatcher("listaColaborador");
//        //pendura o atributo na requisição para enviar ao jsp
//        request.setAttribute("nomeColaborador", colaborador.getNomeColaborador());
//        //vá...mando a requisicao para chamar o jsp
//        rd.forward(request, resp);
//       
        response.sendRedirect("listaColaborador");
        
        System.out.println("Colaborador Salvo! ");

    }
    
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//    	SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(config.getServletContext());
//    }
//    
}
