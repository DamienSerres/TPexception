/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.util.Scanner;

/**
 *
 * @author Damien
 */
public class CConsole {
//    Commenté pour garder la correction de l'exercice 1 mais devient obsolète
//    pour l'exercice 2.
//    private CAffichage affichage;
//
//    public CConsole(CAffichage affichage) {
//        this.affichage = affichage;
//    }

    public String saisirTexte() {
        Scanner sc = new Scanner(System.in);
        String retour = sc.nextLine();
        return retour;
    }

    public void saisirNombre() {
        throw new UnsupportedOperationException("Il faut écrire la méthode");
    }

    public void saisirOperateur() {
        throw new UnsupportedOperationException("Il faut écrire la méthode");
    }

//    public CAffichage getAffichage() {
//        return affichage;
//    }
//
//    public void setAffichage(CAffichage affichage) {
//        this.affichage = affichage;
//    }
//
//    public static void main(String[] args) {
//        CAffichage affichage = new CAffichage();
//        CConsole console = new CConsole(affichage);
//
//        //Si on avait une relation de composition :
//        //CConsole console = new CConsole(new CAffichage());
//        System.out.println("Écrivez un texte au clavier :");
//        String texte = console.saisirTexte();
//        console.getAffichage().afficherTexte(texte);
//    }
}
