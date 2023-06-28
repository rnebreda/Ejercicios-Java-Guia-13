/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia13Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        metodoC();

    }

    public static void metodoC() throws ArithmeticException {
        Scanner leer = new Scanner(System.in);
        System.out.println("1");
        try {
            System.out.println("2");
           // int i=leer.nextInt();
           //int i= 10/0;
            System.out.println("3");
        } catch (InputMismatchException e) {
            System.out.println("4");
        } catch (ArithmeticException e) {
            System.out.println("5");
            throw (e);
        } finally {
            System.out.println("6");
        }

    }
}
