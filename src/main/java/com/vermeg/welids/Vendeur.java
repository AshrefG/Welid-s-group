package com.vermeg.welids;

public class Vendeur extends Employe{
    
    private float tauxDeVente;

    public Vendeur() {
    }

    public Vendeur(float tauxDeVente, int id, String nom, String adresse, int nbr_heure) {
        super(id, nom, adresse, nbr_heure);
        this.tauxDeVente = tauxDeVente;
    }
}
