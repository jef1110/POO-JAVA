
package media.java;

import java.util.Scanner;

public class calculandoMedia {

   
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Cálculo de média!");
        
        float[] notas = new float[5];
        
        System.out.println("Digite as notas!");
        for(int i = 0;i<notas.length;i++){
            notas[i] = entrada.nextFloat();        
       }    
        float cont = 0;
        
        for(int i=0; i<notas.length;i++){
            cont = cont + notas[i];      
        }
       float media = cont / notas.length;
       
        System.out.println("Sua média é: " + media);
    }
    
    
}
