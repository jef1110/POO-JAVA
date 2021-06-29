
package praticando;

import java.util.Scanner;

public class multiplicacao {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Numero 1: ");
        int num1 = entrada.nextInt();
        System.out.print("Numero 2: ");
        int num2 = entrada.nextInt();
        
        int multi = num1 * num2;
        
        System.out.println(num1 + " x " + num2 + " = " + multi);
    }
    
}
