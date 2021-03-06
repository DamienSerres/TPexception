/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Damien
 */
public class DemoTP {

    public static void demoAssert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programme de division de 2 entiers : ");
        System.out.print("Saisir la valeur du numérateur : ");
        int num = sc.nextInt();
        System.out.print("Saisir la valeur du dénominateur (!=0) : ");
        int den = sc.nextInt();
        assert den != 0 : "Le dénominateur doit être != de 0";
        System.out.println("Quotient = " + num / den);
    }

    public static int calculer(int n1, int n2, char operateur, CCodeErreur code) {

        if (operateur == '+') {
            code.valeur = 3;
            return n1 + n2;
        }
        return 0;
    }

    public static void demoCalcul() {
        CCodeErreur eCode = new CCodeErreur();
        int resultat = DemoTP.calculer(4, 2, '+', eCode);

        System.out.println(resultat);
        System.out.println(eCode.valeur);
    }

    public static void demoException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programme de division de 2 entiers : ");
        System.out.print("Saisir la valeur du numérateur : ");
        int num;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Mauvais type de donnée, num = 0");
            num = 0;
            sc.nextLine();
        }
        System.out.print("Saisir la valeur du dénominateur (!=0) : ");
        int den;
        try {
            den = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Mauvais type de donnée, den = 1");
            den = 1;
            sc.nextLine();
        }
        //assert den!=0 : "Le dénominateur doit être != de 0";
        try {
            System.out.println("Quotient = " + num / den);
        } catch (ArithmeticException ex) {
            System.out.println("Division par 0 interdite");
            //Permet de relancer la division, mais attention à la récursivité qui
            //risque de créer des traitements infinis
            //demoException();
        }
    }

    public static void verifAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException(age); /// On génère ici l'exception
        }
    }

    public static void demoVerifAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel âge as-tu ?");
        try {
            DemoTP.verifAge(sc.nextInt());
        } catch (AgeException ex) {
            System.out.println("Erreur sur l'age, " + ex.age
                    + " n'est pas un age possible");
        } catch (InputMismatchException ex) {
            System.out.println("Utilisez des chiffres svp.");
        }
    }

    public static void main(String[] args) {
        DemoTP.demoVerifAge();
    }
}
