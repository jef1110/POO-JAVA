
package exebanco;


public class ExeBanco {

  
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        ContaBanco p2 = new ContaBanco();
        
        p1.setNumConta(178459);
        p1.setDono("Jefferson");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.fecharConta();
        
        p2.setNumConta(156489);
        p2.setDono("Livia");
        p2.abrirConta("CP");
        p2.depositar(250);
        p2.sacar(400);
        p2.fecharConta();
        
        p2.estadoAtual();
    }
    
}
