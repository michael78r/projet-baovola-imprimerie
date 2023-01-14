/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author P14A_77_Michael
 */
public class Genre extends Base{
    String nom;

    public Genre(){}
    public String getNom() {
        return nom;
    }

    public void setNom(String genre) {
        this.nom = genre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
}
