package com.vermeg.welids;


import java.util.Date;


public abstract class Produit {
	// les attributs
	private int identifiant;
	   private String libelle;
	   private String marque;
	   private float prix;
	   private Date date_expiration;
	    
	    public Produit(){}
	    // constructeur 
	    public Produit(int identifiant,String libelle,String marque){
	        this.identifiant=identifiant;
	        this.libelle=libelle;
	        this.marque=marque;
	    }
	    
	    public Produit(int identifiant,String libelle,String marque,float prix) {
	        this.identifiant=identifiant;
	        this.libelle=libelle;
	        this.marque=marque;
	         if(prix>0) {
	        	 
	        this.prix=prix;
	         }
	    	}
	    // les getters and setters
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
	    
	    public  void afficher(){
	        System.out.println("ID :"+identifiant+" , Libelle : "
	                + ""+libelle+" ,Marque : "+marque+" , prix : "+prix);
	    } 
	    
	    // to string 
	    
	    @Override
	    public String toString(){
	       return "ID :"+identifiant+" , Libelle : "
	                + ""+libelle+" ,Marque : "+marque+" , prix : "+prix+", Date : "+date_expiration;
	    }
	    
	    public abstract boolean comparer(Produit p) ;
	    public abstract boolean comparer(Produit p1 ,Produit p2) ;
	    
	    
}