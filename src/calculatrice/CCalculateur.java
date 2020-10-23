/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Damien
 */
public class CCalculateur {

    private float n1;
    private float n2;
    private String codeErreur;

    public void additionner() {
        throw new UnsupportedOperationException("Il faut écrire la méthode");
    }

    public void soustraire() {
        throw new UnsupportedOperationException("Il faut écrire la méthode");
    }

    public void multiplier() {
        throw new UnsupportedOperationException("Il faut écrire la méthode");
    }

    public float diviser() throws DivisionParZeroException {
        if (n2 == 0) {
            throw new DivisionParZeroException();
        }
        return n1 / n2;
    }

    public static float diviser(int n1, int n2) throws DivisionParZeroException {
        if (n2 == 0) {
            throw new DivisionParZeroException();
        }
        return n1 / n2;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public String getCodeErreur() {
        return codeErreur;
    }

    public void setCodeErreur(String codeErreur) {
        this.codeErreur = codeErreur;
    }

    public static void main(String[] args) {
//        try {
//            System.out.println(CCalculateur.diviser(2, 1));
//        } catch (DivisionParZeroException ex) {
//            Logger.getLogger(CCalculateur.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        CCalculateur calc = new CCalculateur();
//        calc.setN1(25);
//        calc.setN2(0);
//        try {
//            System.out.println(calc.diviser());
//        } catch (DivisionParZeroException ex) {
//            //System.out.println("On ne peut pas diviser par 0");
//            Logger.getLogger(CCalculateur.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            int res = 2 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Arrêtz de diviser par 0 !");
        }

    }
}
