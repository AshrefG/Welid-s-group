package com.vermeg.welids;

public class Caissier extends Employe{
    
    private int numCaisse;

    public Caissier() {
     //  super();
    }

    public Caissier(int numCaisse) {
        //  super();
          this.numCaisse = numCaisse;
      }
  
      public Caissier(int numCaisse, int id, String nom, String adresse, int nbr_heure) {
          super(id, nom, adresse, nbr_heure);
          this.numCaisse = numCaisse;
      }
  
      public int getNumCaisse() {
          return numCaisse;
      }
  
      public void setNumCaisse(int numCaisse) {
          this.numCaisse = numCaisse;
      }
}
