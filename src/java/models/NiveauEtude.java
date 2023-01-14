package models;

public class NiveauEtude extends Base {
    String nom;    

    public NiveauEtude(){}
    public NiveauEtude(String iD, String nom) {
        super(iD);
        this.nom = nom;
    }

    public NiveauEtude(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
