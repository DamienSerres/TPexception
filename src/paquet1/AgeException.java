/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

/**
 *
 * @author Damien
 */
public class AgeException extends Exception {

    public int age;

    public AgeException(int age) {
        this.age = age;
    }

}
