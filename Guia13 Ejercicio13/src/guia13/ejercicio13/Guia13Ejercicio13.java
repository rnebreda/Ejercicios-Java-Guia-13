/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado. 
 */
package guia13.ejercicio13;

import entidades.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia13Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean exito= false;
        DivisionNumero dn = new DivisionNumero();
        do{
        System.out.println("Ingrese 2 numeros enteros");
        dn.setNum1(leer.next());
        dn.setNum2(leer.next());
        try{
        int nro1 = Integer.parseInt(dn.getNum1());
        int nro2 = Integer.parseInt(dn.getNum2());
        System.out.println("El resultado es: " + (nro1 / nro2));
        exito=true;
        }catch (NumberFormatException nfe){
            System.out.println("El valor ingresado No es un número entero");
            exito=false;
        }catch (ArithmeticException ae){
            System.out.println("La división por cero No es posible");
            exito=false;
        }
        }while(!exito);

    }
}
