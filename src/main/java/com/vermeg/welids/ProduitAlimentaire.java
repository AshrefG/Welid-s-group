package com.vermeg.welids;

public class ProduitAlimentaire extends Produit{
	
    public boolean comparer(Produit p){
        return this.identifiant==p.identifiant&& this.libelle.equals(p.libelle) && this.prix==p.prix;
    }
    
    public  boolean comparer(Produit p1,Produit p2){
       
         return p1.identifiant==p2.identifiant&& p1.libelle.equals(p2.libelle) && p1.prix==p2.prix;
    }
}
