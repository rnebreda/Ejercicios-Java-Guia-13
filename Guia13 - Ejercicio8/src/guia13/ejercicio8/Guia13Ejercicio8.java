/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejercicio8;

/**
 *
 * @author Usuario
 */
public class Guia13Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase3 c3= new Clase3();
        try {
System.out.println (c3.metodo()) ;
}catch(Exception e) {
System.err.println("Excepcion en metodo() ") ;
e.printStackTrace();
}
    }
    
}
