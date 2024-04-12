package tpencadre;
import fr.ulille.but.sae_s2_2024.*;

import java.util.List;
import java.util.ArrayList;


public class segunda {
    public static void main(String[] args) {
        MultiGrapheOrienteValue G1 = new MultiGrapheOrienteValue();
        Lugas A = new Lugas('A');
        Lugas B = new Lugas('B');
        Lugas C = new Lugas('C');
        Lugas D = new Lugas('D');

        Tranconas AB = new Tranconas(A, B, ModaliteTransport.TRAIN);
        Tranconas BA = new Tranconas(B, A, ModaliteTransport.TRAIN);
        Tranconas AC = new Tranconas(A, C, ModaliteTransport.TRAIN);
        Tranconas CA = new Tranconas(C, A, ModaliteTransport.TRAIN);
        Tranconas BC = new Tranconas(B, C, ModaliteTransport.TRAIN);
        Tranconas CB = new Tranconas(C, B, ModaliteTransport.TRAIN);
        Tranconas BD = new Tranconas(B, D, ModaliteTransport.TRAIN);
        Tranconas DB = new Tranconas(D, B, ModaliteTransport.TRAIN);
        Tranconas CD1 = new Tranconas(C, D, ModaliteTransport.TRAIN);
        Tranconas DC1 = new Tranconas(D, C, ModaliteTransport.TRAIN);
        Tranconas CD2 = new Tranconas(C, D, ModaliteTransport.AVION);
        Tranconas DC2 = new Tranconas(D, C, ModaliteTransport.AVION);

        G1.ajouterSommet(A);
        G1.ajouterSommet(B);
        G1.ajouterSommet(C);
        G1.ajouterSommet(D);

        G1.ajouterArete(AB, 90);
        G1.ajouterArete(BA, 90);
        G1.ajouterArete(AC,60);
        G1.ajouterArete(CA, 60);
        G1.ajouterArete(BC, 60);
        G1.ajouterArete(CB, 60);
        G1.ajouterArete(DB, 30);
        G1.ajouterArete(BD, 30);
        G1.ajouterArete(CD1, 90);
        G1.ajouterArete(DC1, 90);
        G1.ajouterArete(CD2, 30);
        G1.ajouterArete(DC2, 30);
        
        System.out.println("\n Pour passer de A à D, nous vous recommandons ces chemins :  ");
        List<Chemin> chemins = AlgorithmeKPCC.kpcc(G1, A, D,4);
        for (int i=1 ; i<chemins.size(); i++) {
                String s = "";
                List<Trancon> algo = chemins.get(i).aretes();
                ArrayList<Lieu> lieux = new ArrayList<Lieu>();
                for (int j=1 ; j<algo.size(); j++){
                    lieux.add(algo.get(j).getDepart());
                }

                s += i + ") Train de " + algo.get(0).getDepart() +  " à " + algo.get(algo.size()-1).getArrivee() + " en passant par ";
                for (int j=0 ; j<lieux.size()-1; j++){
                    s += lieux.get(j) + ", ";
                }
                s += lieux.get(lieux.size()-1) + ". Durée : " + chemins.get(i).poids()  + " minutes\n";
                
                System.out.println(s);
        }
        
    }
}
