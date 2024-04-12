package tpencadre;

import fr.ulille.but.sae_s2_2024.*;

public class Tranconas implements Trancon{
    private Lieu depart;
    private Lieu arrivee;
    private ModaliteTransport modalite;

    public Tranconas(Lieu depart, Lieu arrivee, ModaliteTransport modalite){
    this.depart = depart;
    this.arrivee = arrivee;
    this.modalite = modalite;
    }

    public Lieu getDepart(){
        return depart;
    }

    public Lieu getArrivee(){
        return arrivee;
    }

    public ModaliteTransport getModalite(){
        return modalite;
    }

    public String toString(){
        return "De " + getDepart() + " à " + getArrivee() + " en " + getModalite();
    }

    public boolean isAvion(){
        return getModalite() == ModaliteTransport.AVION;
    }
    
}
