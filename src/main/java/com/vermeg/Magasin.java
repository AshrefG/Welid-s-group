package com.vermeg;

public class Magasin {
	private int id;
	   private String nom;
	   private String adresse;
	   public  static final int CAPACITE=50;
	   private Produit[] prods;//=new Produit[CAPACITE];
	   public int cmp=0;
	   public static int totale=0;

// modification 	   
	   public Employe[] emps;
	    public int cmp_emp;
	    

	    public Magasin() {
	        prods=new Produit[CAPACITE];
	        emps=new Employe[20];
	    }
// add constructeur
	    public Magasin(int id, String nom, String adresse) {
	        this.id = id;
	        this.nom = nom;
	        this.adresse = adresse;
	        prods=new Produit[CAPACITE];
	        emps=new Employe[20];

	    }
	    // ajouter Employe 
	    public void ajouterEmploye(Employe e){
	        if(cmp_emp<20){
	            emps[cmp_emp]=e;
	            cmp_emp++;
	        }
	    }
	    
	    // add products
	    public void ajouterProduit(Produit p){
	        if(cmp<CAPACITE ){
	            if(!chercherProduit(p)){
	            prods[cmp]=p;
	            cmp++;
	            totale++;
	            }else System.out.println("Le produit existe deja");
	        }else System.out.println("Capacite Max = 50");
	    }
	    
	    
	    @Override
	    public String toString(){
	        String s="";
	        for(int i=0;i<cmp;i++)
	            s+=prods[i].getLibelle()+" "+prods[i].getPrix();
	        for(int i=0;i<cmp_emp;i++)
	            s+=emps[i].toString();
	        return "Id = "+id+" , nom = "+nom+" , adresse = "+adresse+", les produits : "+s;
	    }
	    
	    
	    // chercher Produit 
	    public boolean chercherProduit(Produit p){
	        for(int i=0;i<cmp;i++)
	            if(prods[i].comparer(p))
	                return true;
	        return false;
	    }
	    
	    public int indexOfProduit(Produit p){
	        for(int i=0;i<cmp;i++)
	            if(prods[i].comparer(p))
	                return i;
	        return -1;
	    }
	    
	    // supprimer produit
	    public void supprimerProduit(Produit p){
	        int pos=indexOfProduit(p);
	        //1ere maniere
        if(pos!=-1 && pos!=cmp-1){
	            for(int i=pos;i<cmp-1;i++)
	                prods[i]=prods[i+1];
	            cmp--;
        }else if(pos==cmp-1){
            prods[cmp-1]=null;
            cmp--;
        }
	           
	       
	    }
	    // comparer Magasin
	    public static Magasin comparerMagasin(Magasin m1,Magasin m2){
	        if(m1.cmp>m2.cmp)
	            return m1;
	        else return m2;
	    }
	    
	    // sommeSalaireCaissier
	    public float sommeSalaireCaissier(){
	        
	    }
	    // sommePrimeResponsable
	    public float sommePrimeResponsable(){
	        
	    }
	    
	}

	    