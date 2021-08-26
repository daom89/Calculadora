
package calculadora;

import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("introduce numero 1: ");
       double a= leer.nextDouble();
       System.out.println("introduce numero 2: ");
       double b=leer.nextDouble();
       double suma=a+b;
       double resta = b-a;
       System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
    }
    
}
