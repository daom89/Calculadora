
package calculadora;


public class Operaciones {
    double a; double b;
    
    public void setNumeros(double x, double y)
    {
        
       this.a=x;
       this.b=y;
       
    }
    
    public void impremeNumeros (){
        System.out.println(" el numero 1 es : " +a+" y el numero 2 es: " +b );
    }
    
    public double Suma()
    {
        
        return a+b;
        
    }
    public  double Resta ()
    {
        
        if (a>b){
            return a-b;
        }else {
                    return a-b;
                    }
    }
    
     public   double Multi()
     
     {
         
        return a*b; 
     
     }
     
public  double Divi ()
{
        if (a>b){
            return a/b;
        }else {
                    return b/a;
        }
}
}