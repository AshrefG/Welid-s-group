package com.vermeg.welids;

import java.sql.Date;

public class ProduitAlimentaire extends Produit{

	    public ProduitAlimentaire() {
	    	super(identifiant,libelle,marque,prix,data_expiration);
	    }
	    
	    public boolean comparer(ProduitAlimentaire p){
	        return this.identifiant==p.identifiant&& this.libelle.equals(p.libelle) && this.prix==p.prix;
	    }
	    
	    public boolean comparer(ProduitAlimentaire p1,ProduitAlimentaire p2){
	       
	         return p1.identifiant==p2.identifiant&& p1.libelle.equals(p2.libelle) && p1.prix==p2.prix;
	    }
}
