/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Numero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NumeroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Juego() {
        int contador = 0, intento;
        int num = (int) ((Math.random() * 500) + 1);
        Numero numero = new Numero(num);
        while (true) {
            System.out.println("Ingrese un número entero de 1 a 500");
            contador++;
            try {
                intento = leer.nextInt();
                if (numero.getNumero() == intento) {
                    System.out.println("Felicitaciones!! adivinaste");
                    System.out.println("La cantidad de intentos fue: " + contador);
                    break;
                } else if (numero.getNumero() < intento) {
                    System.out.println("El número buscado es menor al ingresado (" + intento + "). Intente nuevamente");
                } else {
                    System.out.println("El numero buscado es mayor al ingresado (" + intento + "). Intente nuevamente");
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es un número");
                leer.next();
            }

        }
    }

}
