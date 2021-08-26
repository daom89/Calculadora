

package calculadora;

import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("introduce numero 1: ");
       double a= leer.nextDouble();
       System.out.println("introduce numero 2: ");
       double b=leer.nextDouble();
       System.out.println("la suma es : " +Suma(a,b));
       System.out.println("la resta es: " +Resta (a,b));
       System.out.println("la multiplicacion es : " +Multi(a,b));
       System.out.println("la division  es: " +Divi (a,b));
    }
    public static  double Suma(double x, double y){
        return x+y;
               
    }
    public static double Resta (double x, double y){
        if (x>y){
            return x-y;
        }else {
                    return y-x;
                    }
    }
     public static  double Multi(double x, double y){
        return x*y;    
}
      public static double Divi (double x, double y){
        if (x>y){
            return x/y;
        }else {
                    return y/x;
        }
      }
}
      
     

    
  
 