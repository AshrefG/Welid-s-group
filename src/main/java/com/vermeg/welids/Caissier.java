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

      @Override
    public String toString() {
        return "Caissier [numCaisse=" + numCaisse + "]";
    }

    @Override
    public float calculerSalaire() {
        System.out.println("salaire caissier");
        if(nbr_heure>180)
            return (nbr_heure-180)*5.75f+180*5;
        return nbr_heure*5;
    }

    public void tester(){
        System.out.println("Caissier");
    }
}
