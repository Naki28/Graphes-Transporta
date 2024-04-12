package tpencadre;

import fr.ulille.but.sae_s2_2024.*;

public class primero {
    public static void main(String[] args) {
        MultiGrapheOrienteValue mg = new MultiGrapheOrienteValue();
        Lugas l1 = new Lugas('A');
        Lugas l2 = new Lugas('B');
        Tranconas t1 = new Tranconas(l1, l2, ModaliteTransport.TRAIN);

        mg.ajouterSommet(l2);
        mg.ajouterSommet(l1);
        mg.ajouterArete(t1, 1);
        System.out.println(mg);
    }
}