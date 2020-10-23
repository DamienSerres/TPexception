/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

import java.util.Scanner;

/**
 *
 * @author Damien
 */
public class DemoAssert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programme de division de 2 entiers : ");
        System.out.print("Saisir la valeur du numérateur : ");
        int num = sc.nextInt();
        System.out.print("Saisir la valeur du dénominateur (!=0) : ");
        int den = sc.nextInt();
        assert den!=0 : "Le dénominateur doit être != de 0";
        System.out.println("Quotient = " + num/den);
    }
}
