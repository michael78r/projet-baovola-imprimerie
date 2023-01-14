package models;

import connexion.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Employee extends Base{
    String nom;
    String prenom;
    Genre genre;
    float salaire;
    

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public Employee(){}
    
    Date date_naissance;
    
    Specialite specialite;
    NiveauEtude niveau;

    public Employee(String iD, String nom, String prenom, Genre genre,Date date_naissance, Specialite specialite,
            NiveauEtude niveau) {
        super(iD);
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.date_naissance = date_naissance;
        this.specialite = specialite;
        this.niveau = niveau;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Date getDate_naissance() {
        return date_naissance;
    }
    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }
    public Specialite getSpecialite() {
        return specialite;
    }
    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }
    public NiveauEtude getNiveau() {
        return niveau;
    }
    public void setNiveau(NiveauEtude niveau) {
        this.niveau = niveau;
    }
        public void setEmployee(Employee sortie) throws Exception{
        Connexion con = null;
       
        try{
            String request = "insert into employee values(concat('EMPLOYEE',nextval('EmployeSec')),?,?,?,?,?,?)";            
            //String requests = "INSERT INTO Candidat values(concat('CANDIDAT',nextval('idcandidat')),?,?,?,?,?);";
            con=new Connexion(request);
            con.getPreparedStatement().setDate(4,java.sql.Date.valueOf(new SimpleDateFormat("yyyy-mm-dd").format(sortie.getDate_naissance())));
            con.getPreparedStatement().setString(1,sortie.getNom());
            con.getPreparedStatement().setString(2,sortie.getPrenom());
            con.getPreparedStatement().setString(3,sortie.getGenre().getID());
            con.getPreparedStatement().setString(5,sortie.getSpecialite().getID());
            con.getPreparedStatement().setString(6,sortie.getNiveau().getID());
            con.Execute();
            System.out.println(request);
        }
        catch(Exception e){throw new Exception(e);}
        finally{if(con!=null)con.Closed();} 
              
    }
        
       public static boolean checkAge(Date birthdate) {
        try {
            Date now = new Date();
            long diff = now.getTime() - birthdate.getTime();
            long diffDays = diff / (24 * 60 * 60 * 1000);
            int age = (int) (diffDays / 365);
            if (age > 19) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}