
package tabuadajava;

import java.util.*;

public class Calculo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
            for(int i = 1;i<=10;i++){
                int res = N*i;
                System.out.println(i + " " + N + "x" + i + "= " + res);
            }
    }
    
}
