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

    /**
     * Fais la division en utilisant les attributs n1/n2 Attention, ici la
     * division par 0 ne fait pas d'erreur mais renvoie "infinity"
     *
     * @return Le résultat de la division
     * @throws DivisionParZeroException
     */
    public float diviser() throws DivisionParZeroException {
        if (n2 == 0) {
            throw new DivisionParZeroException();
        }
        return n1 / n2;
    }

    /**
     * Fais la division des entiers n1/n2 passés en paramètres On illustre le
     * changement de type d'exception : on empêche la division par 0 en
     * interceptant le dénominateur pour vérifier sa valeur et éventuellement
     * lever notre exception spécialisée.
     *
     * @param n1
     * @param n2
     * @return
     * @throws DivisionParZeroException
     */
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
        //Utilisation de la méthode diviser(int n1, int n2), division entière.
        //L'exeption possible de type DivisionParZeroException est une Exception
        //dites "checked". Cela signifie que l'on a obligation de l'entourer de 
        //try et catch.
        try {
            System.out.println(CCalculateur.diviser(2, 1));
        } catch (DivisionParZeroException ex) {
            Logger.getLogger(CCalculateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Utilisation de la méthode diviser() utilisant les attributs n1 et n2
        CCalculateur calc = new CCalculateur();
        calc.setN1(25);
        calc.setN2(0);
        try {
            System.out.println(calc.diviser());
        } catch (DivisionParZeroException ex) {
            //Plutôt que de laisser le message classique on peut choisir de faire
            //un traitement différent.
            //System.out.println("On ne peut pas diviser par 0");
            Logger.getLogger(CCalculateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Exemple de la gestion de l'exception arithmétique déjà présente lors de
        //la division entière par 0. Cette exception est de type "unchecked" cela
        //signifie qu'on n'est pas contraint de l'entourer de try, catch mais ça
        //ouvre le code à une erreur fatale.
        try {
            int res = 2 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Arrêtez de diviser par 0 !");
        }
    }
}
