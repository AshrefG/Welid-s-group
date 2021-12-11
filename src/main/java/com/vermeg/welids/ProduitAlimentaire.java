package com.vermeg.welids;

import java.sql.Date;

public class ProduitAlimentaire {

	private int identifiant;
	   private String libelle;
	   private String marque;
	   private float prix;
	   private Date date_expiration;
	    
	    public ProduitAlimentaire(){}
	    
	    public ProduitAlimentaire(int identifiant,String libelle,String marque){
	        this.identifiant=identifiant;
	        this.libelle=libelle;
	        this.marque=marque;
	    }
	    
	    public ProduitAlimentaire(int identifiant,String libelle,String marque,float prix){
	        this.identifiant=identifiant;
	        this.libelle=libelle;
	        this.marque=marque;
	         if(prix>0)
	        this.prix=prix;
	    }
	    public int getIdentifiant(){
	        return identifiant;
	    }
	    public void setIdentifiant(int identifiant){
	        this.identifiant=identifiant;
	    }

	    public String getLibelle() {
	        return libelle;
	    }

	    public void setLibelle(String libelle) {
	        this.libelle = libelle;
	    }

	    public String getMarque() {
	        return marque;
	    }

	    public void setMarque(String marque) {
	        this.marque = marque;
	    }

	    public Date getDate_expiration() {
	        return date_expiration;
	    }

	    public void setDate_expiration(Date date_expiration) {
	        this.date_expiration = date_expiration;
	    }
	    
	    public void setPrix(float prix){
	        if(prix>0)
	            this.prix=prix;
	    }

	    public float getPrix() {
	        return prix;
	    }
}
