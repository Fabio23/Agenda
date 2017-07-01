package logica;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Dao;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fabio.ribeiros
 */
@WebServlet(urlPatterns = "/Servlet")
public class ServletAdicionar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.getWriter().print("<html><h1>Cadastrado realizado com sucesso!!!</h1></html>");
    }

    @Override //aqui tem override msm?
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String dataNasc = request.getParameter("dataNasc");
        String telefone = request.getParameter("telefone");
        String celular = request.getParameter("celular");
        String rua = request.getParameter("rua");
        String numero = request.getParameter("numero");
        String complemento = request.getParameter("complemento");
        String bairro = request.getParameter("bairro");
        String cep = request.getParameter("cep");

        String[] vetor = new String[10];

        vetor[0] = nome;
        vetor[1] = email;
        vetor[2] = dataNasc;
        vetor[3] = telefone;
        vetor[4] = celular;
        vetor[5] = rua;
        vetor[6] = numero;
        vetor[7] = complemento;
        vetor[8] = bairro;
        vetor[9] = cep;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        Dao dao = new Dao();

        try {
            dao.inserir(vetor);
            //aqui atribui a msg
            request.setAttribute("mensagem", "Cadastro salvo com sucesso!");
            
            //aqui volta pra cadastra.jsp
            response.sendRedirect(request.getContextPath() + "/Cadastrar.jsp");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
