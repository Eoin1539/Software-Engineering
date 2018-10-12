
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eoinkirwan
 */
public class Average{
    
    public static int add(int a, int b){
        return a+b;
    }
    
    public static int avg(int a, int b, int c, int d){
        return d/3;
    }
    
    public static int subtract(int a, int b, int c, int d, int e){
        return a-b-c-d-e;
    }
    
    public static double multiplyDivide(double a, double b, double c, double d, double e){
        return a*b*c*d/e;
    }
    
    public static int fibonacci(int n)  {
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return fibonacci(n - 1) + fibonacci(n - 2);
}
private double sideLen;

public Average(double len){ 
    sideLen=len;
}
public double area(){
    return sideLen*sideLen;
}
}

