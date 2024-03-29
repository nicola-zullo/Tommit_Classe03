package controller.donazione;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.entity.Fondi;

import java.io.IOException;

@WebServlet(name="donazione", value ="/donazione")
public class Donazione extends HttpServlet {
    /**
     * Implemneta la funzionalità di Donazione
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Fondi fondi = new Fondi();

        String ritorno = "Errore nel pagamento";

        if (request.getParameter("metodoPagamento").equalsIgnoreCase("cartadicredito")){
            ritorno = fondi.pagaCarta(request.getParameter("nome"),request.getParameter("ccNum"),request.getParameter("cvv"),request.getParameter("scadenza"), Integer.parseInt(request.getParameter("amount")));
        }else if (request.getParameter("metodoPagamento").equalsIgnoreCase("paypal")){
            ritorno = fondi.pagaPayPal(request.getParameter("email"),request.getParameter("password"), Integer.parseInt(request.getParameter("amount")));
        }else if (request.getParameter("metodoPagamento").equalsIgnoreCase("bitcoin")){
            ritorno = fondi.pagaBitcoin(request.getParameter("wallet"), Integer.parseInt(request.getParameter("amount")));
        }

        request.setAttribute("ritornoPagamento",ritorno);
        //Reindirizza alla pagina donazione avvenuta con successo
        String destPage="DonazioneEffettuata.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
        dispatcher.forward(request, response);
    }
}