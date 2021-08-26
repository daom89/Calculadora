
package calculadora;

import java.util.Scanner;


public class MiniCalculadora {
     public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("introduce numero 1: ");
       double a= leer.nextDouble();
       System.out.println("introduce numero 2: ");
       double b=leer.nextDouble();
       Operaciones op=new Operaciones();
       op.setNumeros(a,b);
       op.impremeNumeros();
       System.out.println("suma: "+op.Suma());
       System.out.println("resta: "+op.Resta());
       System.out.println("multiplicacion: "+op.Multi());
       System.out.println("division: "+op.Divi());
}

}