
package televisao;

public class Televisao {

    public static void main(String[] args) {
       ControleRemoto channel = new ControleRemoto();
      
       channel.aumentarCanal();
       channel.aumentarCanal();
       channel.aumentarVolume();
       channel.diminuirCanal();
       channel.status();
       //channel.escolherCanal();
    }
    
}
