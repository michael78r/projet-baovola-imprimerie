
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import models.Employee;
import models.Genre;
import models.NiveauEtude;
import models.Specialite;
import services.InsertServices;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P14A_77_Michael
 */
public class main {
    public static void main(String[]args)throws Exception{
        NiveauEtude nv = new NiveauEtude();
        nv.setID("Niv_etude1");
        Genre g = new Genre();
        g.setID("GENRE3");
        Specialite s = new Specialite();
        s.setID("SPEC13");
        Employee e = new Employee();
        e.setNom("rakoto");
        e.setPrenom("jean");
        //java.util.Date dt=new java.util.Date(dtn.getTime());
        //java.util.Date utildate=dtn;
        //long utilTime = utildate.getTime();
        //java.sql.Date date= new java.sql.Date(utilTime);
        String date = "2000-12-11";
        Date dtn = new SimpleDateFormat("yyyy-mm-dd").parse(date);
        e.setDate_naissance(dtn);
        e.setNiveau(nv);
        e.setSpecialite(s);
        e.setGenre(g);

        //Dao_Employee.insertData(nom,  prenom, genre, dtn, specialite,NE);
        new InsertServices().setEmployee(e);
    }
}
