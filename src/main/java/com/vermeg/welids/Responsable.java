
package com.vermeg.welids;
public class Responsable extends Employe{
    private float prime;

    public Responsable() {
    }

    public Responsable(float prime, int id, String nom, String adresse, int nbr_heure) {
        super(id, nom, adresse, nbr_heure);
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return super.toString()+"Responsable{" + "prime=" + prime + '}';
    }

    @Override
    public float calculerSalaire() {
        if(nbr_heure>160)
            return (nbr_heure-160)*12+160*10+prime;
        return nbr_heure*10+prime;
        
    }
    
    
    
    
}
