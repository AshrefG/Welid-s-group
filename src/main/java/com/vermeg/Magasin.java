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