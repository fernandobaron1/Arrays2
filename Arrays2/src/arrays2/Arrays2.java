
package arrays2;

import java.util.Random;


public class Arrays2 {

    
    public static void main(String[] args) {
        
        double[] precosProdutos = new double[10];
        
       Random r = new Random();
       
       for (int i = 0; i < precosProdutos.length; i++) {
           precosProdutos[i] = r.nextDouble();
       }
       
                 for(int i = 0; i < precosProdutos.length; i++){
                     System.out.println (i+": "+precosProdutos[i]);
                   
                     
                 }
    }
    
}
