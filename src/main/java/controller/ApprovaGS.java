package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.GSBean;
import model.GSDAO;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name="approva-gs-servlet", value ="/approva-gs-servlet")
public class ApprovaGS extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        //Trova nel db il GS con nome == name(da input nella listGS accessibile solo da admin) e setta Stato a True
        GSDAO dao = new GSDAO();
        dao.setTrue(name);

        //Aggiorna il parametro gsList per la jsp con il nuovo db aggiornato tramite listGS del dao
        ArrayList<GSBean> gsList;
        gsList= dao.listGS();
        request.setAttribute("gsList", gsList);

        //Reindirizza alla pagina listGS con il db gruppistudio aggiornato
        String destPage="listGS.jsp"; //aggiornare con nome pagina lista dei gs in sezione admin
        RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
        dispatcher.forward(request, response);
    }
}