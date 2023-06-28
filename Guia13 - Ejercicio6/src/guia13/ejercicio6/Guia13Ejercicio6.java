/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejercicio6;

/**
 *
 * @author Usuario
 */
public class Guia13Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("1");
        try {

            int i=10/0;

        } catch (Exception e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
    }
}