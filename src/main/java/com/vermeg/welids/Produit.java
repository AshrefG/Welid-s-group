package com.vermeg.welids;

import java.util.Date;


<<<<<<< HEAD


public class Produit {
=======
public abstract class Produit {
	// les attributs
>>>>>>> taher_branch
	private int identifiant;
	   private String libelle;
	   private String marque;
	   private float prix;
	   private Date date_expiration;
	    // push
	    public Produit(){}
	    
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
<<<<<<< HEAD
	         }
	         }
	         
	    
=======
	         } // l
	    	}
	    // les getters and setters
>>>>>>> taher_branch
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
	    
	    public void afficher(){
	        System.out.println("ID :"+identifiant+" , Libelle : "
	                + ""+libelle+" ,Marque : "+marque+" , prix : "+prix);
	    }
	    
	    @Override
	    public String toString(){
	       return "ID :"+identifiant+" , Libelle : "
	                + ""+libelle+" ,Marque : "+marque+" , prix : "+prix+", Date : "+date_expiration;
	    }
	    
	    
	    public boolean comparer(Produit p){
	        return this.identifiant==p.identifiant&& this.libelle.equals(p.libelle) && this.prix==p.prix;
	    }
	    
	    public static boolean comparer(Produit p1,Produit p2){
	       
	         return p1.identifiant==p2.identifiant&& p1.libelle.equals(p2.libelle) && p1.prix==p2.prix;
	    }
	    
	    
}
