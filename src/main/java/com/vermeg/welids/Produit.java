package com.vermeg.welids;


import java.util.Date;


public class Produit {
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
	    
}