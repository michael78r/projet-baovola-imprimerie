/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Employee;
import models.Erreur;
import models.Genre;
import models.NiveauEtude;
import models.Specialite;
import services.InsertServices;


/**
 *
 * @author P14A_77_Michael
 */
@WebServlet(name = "InsertionEmployee", urlPatterns = {"/InsertionEmployee"})
public class InsertionEmployee extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String lien="";
        try{
        response.setContentType("text/html;charset=UTF-8");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String genre = request.getParameter("genre");


        String dateNaissance = request.getParameter("date_naissance");
         Date dtn = new SimpleDateFormat("yyyy-mm-dd").parse(dateNaissance);
        String specialite = request.getParameter("specialite");
        String NE = request.getParameter("NE");
        
        PrintWriter out = response.getWriter();
        out.println("Nom : " + nom);
        out.println("Prénom : " + prenom);
        out.println("Genre : " + genre);
        out.println("Date de naissance : " + dateNaissance);
        out.println("Spécialité : " + specialite);
        NiveauEtude nv = new NiveauEtude();
        nv.setID(NE);
        Genre g = new Genre();
        g.setID(genre);
        Specialite s = new Specialite();
        s.setID(specialite);
        Employee e = new Employee();
        e.setNom(nom);
        e.setPrenom(prenom);
        //java.util.Date dt=new java.util.Date(dtn.getTime());
        //java.util.Date utildate=dtn;
        //long utilTime = utildate.getTime();
        //java.sql.Date date= new java.sql.Date(utilTime);
        e.setDate_naissance(dtn);
        e.setNiveau(nv);
        e.setSpecialite(s);
        e.setGenre(g);

        //Dao_Employee.insertData(nom,  prenom, genre, dtn, specialite,NE);
        if(Employee.checkAge(dtn)){
        new InsertServices().setEmployee(e);
        }
        
        else{ throw new Erreur("date invalide");
                }
        }
        catch(Exception e){
            request.setAttribute("Exception", e);  
            lien="exception.jsp";
        }
        finally{
            RequestDispatcher dispatcher = request.getRequestDispatcher(lien);
            dispatcher.forward(request, response);            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
