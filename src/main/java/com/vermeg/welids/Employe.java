
package com.vermeg.welids;

public abstract class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbr_heure;

   
     public Employe() { }
    

    public Employe(int id, String nom, String adresse, int nbr_heure) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heure = nbr_heure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbr_heure() {
        return nbr_heure;
    }

    public void setNbr_heure(int nbr_heure) {
        this.nbr_heure = nbr_heure;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbr_heure=" + nbr_heure + '}';
    }
    
    public abstract float calculerSalaire();
    
    
    
    @Override
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(this.getClass()!=obj.getClass())
            return false;
        Employe other=(Employe)obj;
        
        return this.id==other.id && this.nom.equals(other.nom);
        
    }
    
}
