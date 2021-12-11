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
	    