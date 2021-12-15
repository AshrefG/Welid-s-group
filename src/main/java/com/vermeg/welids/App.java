package com.vermeg.welids;


import entite.Caissier;
import entite.Employe;
import entite.Magasin;
import entite.Produit;
import entite.Responsable;
import entite.Vendeur;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class App 
{
    public static void main( String[] args )
    {
    	   // TODO code application logic here
        // System.out.println("Test");

        Produit p1 = new Produit();

        Produit p2 = new Produit(1021, "Lait", "Delice");
//                System.out.println(p2.identifiant);
//                System.out.println(p2.libelle);
//                System.out.println(p2.marque);
//                System.out.println(p2.prix);
        p2.setPrix(0.7f);
        Produit p3 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p4 = new Produit(3250, "Tomates", "Sicam", 1.2f);
        Produit p5 = new Produit(3250, "Tomates", "Sicam", 1.2f);

//        p2.afficher();
//        p3.afficher();
//        p4.afficher();
        // p2.date_expiration=new Date();
        p2.setDate_expiration(new Date(121, 0, 7));
        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");

        p3.setDate_expiration(sd.parse("2021/08/21"));

        //  System.out.println(p3);
        Magasin m1 = new Magasin(1, "Carrefour", "ariana");
        m1.ajouterProduit(p2);
        m1.ajouterProduit(p3);
        m1.ajouterProduit(p4);

        //System.out.println(m1);
        Magasin m2 = new Magasin(2, "Monoprix", "ariana");
        m2.ajouterProduit(p2);
        m2.ajouterProduit(p3);
        //m2.ajouterProduit(p4);

//        System.out.println("cmp m1 ="+m1.cmp);
//                System.out.println("cmp m2 ="+m2.cmp);
//        System.out.println("cmp total ="+Magasin.totale);
        //   System.out.println(Produit.comparer(p4,p2));
        Caissier c1 = new Caissier(1, 2, "Caissier1", "Ariana", 180);
                Caissier c2 = new Caissier(1, 2, "Caissier1", "Ariana", 180);

        Vendeur v1 = new Vendeur(0.7f, 4, "Responsable 1", "Tunis", 170);
        Responsable r1 = new Responsable(200, 3, "Responsable", "La Marsa", 162);

        m1.ajouterEmploye(c1);
        m1.ajouterEmploye(v1);
        m1.ajouterEmploye(r1);
        
        System.out.println(m1);
        
      //  Employe c2=new Caissier();
        
        //System.out.println(c2.toString());
        
//        for(int i=0;i<m1.cmp_emp;i++)
//         System.out.println(m1.emps[i].calculerSalaire());

   // Employe e3=new Caissier();
     System.out.println(c1.equals(c2));

    }

}
