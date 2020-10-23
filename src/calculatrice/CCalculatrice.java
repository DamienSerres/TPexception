/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.util.ArrayList;

/**
 *
 * @author Damien
 */
public class CCalculatrice {

    private CConsole console;
    //private CAffichage affichage;
    private ArrayList<CAffichage> listAffichages;
    private CCalculateur calculateur;

//    public CCalculatrice(CConsole console, CAffichage affichage, CCalculateur calculateur) {
//        this.console = console;
//        this.affichage = affichage;
//        this.calculateur = calculateur;
//    }

    public CCalculatrice(CConsole console, ArrayList<CAffichage> listAffichages, CCalculateur calculateur) {
        this.console = console;
        this.listAffichages = listAffichages;
        this.calculateur = calculateur;
    }

    public CCalculateur getCalculateur() {
        return calculateur;
    }

    public void setCalculateur(CCalculateur calculateur) {
        this.calculateur = calculateur;
    }

    public CConsole getConsole() {
        return console;
    }

    public void setConsole(CConsole console) {
        this.console = console;
    }

    public ArrayList<CAffichage> getListAffichages() {
        return listAffichages;
    }

    public void setListAffichages(ArrayList<CAffichage> listAffichages) {
        this.listAffichages = listAffichages;
    }

//    public CAffichage getAffichage() {
//        return affichage;
//    }
//
//    public void setAffichage(CAffichage affichage) {
//        this.affichage = affichage;
//    }
    public static void main(String[] args) {
        CCalculatrice calculatrice
                = new CCalculatrice(
                        new CConsole(),
                        new ArrayList(),
                        new CCalculateur()
                );
        for (int i = 0; i < 4; i++) {
            calculatrice.getListAffichages().add(new CAffichage());
        }

        calculatrice.getListAffichages().get(0).afficherTexte(calculatrice.getConsole().saisirTexte());
    }

}
