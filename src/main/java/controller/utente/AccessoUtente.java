package controller.utente;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ConPool;
import model.UtenteBean;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(urlPatterns = "/accesso-utente-servlet")
public class AccessoUtente extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        //verifica se l'utente è registrato oppure no
        try (Connection con = ConPool.getConnection()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM utenti WHERE email = '"+email+"' AND password = '"+password + "'");

            if(rs.next()){
                if (rs.getBoolean(11)==true){
                    /*Utente Admin*/
                        UtenteBean utenteLoggato = new UtenteBean();
                        utenteLoggato.setId(rs.getInt(1));
                        utenteLoggato.setName(rs.getString(2));
                        utenteLoggato.setSurname(rs.getString(3));
                        utenteLoggato.setEmail(rs.getString(4));
                        utenteLoggato.setPassword(rs.getString(5));
                        utenteLoggato.setRuolo(true);
                        request.getSession().setAttribute("utenteLoggato", utenteLoggato);
                        RequestDispatcher dispatcher = request.getRequestDispatcher("areaAdmin.jsp");
                        dispatcher.forward(request, response);
                    /*Utente Admin*/
                }else{
                    UtenteBean utenteLoggato = new UtenteBean();
                    utenteLoggato.setId(rs.getInt(1));
                    utenteLoggato.setName(rs.getString(2));
                    utenteLoggato.setSurname(rs.getString(3));
                    utenteLoggato.setEmail(rs.getString(4));
                    utenteLoggato.setPassword(rs.getString(5));
                    request.getSession().setAttribute("utenteLoggato", utenteLoggato);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                    dispatcher.forward(request, response);
                }
            }else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("../webapp/static/html/homepage.html");
                dispatcher.forward(request, response);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}