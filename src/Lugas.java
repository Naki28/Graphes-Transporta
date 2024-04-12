package tpencadre;
import fr.ulille.but.sae_s2_2024.*;

public class Lugas implements Lieu{
    private char nom;

    public Lugas(char nom){
        this.nom = nom;
    }

    public char getNom(){
        return nom;
    }

    public String toString(){
        return "" + nom;
    }
}
