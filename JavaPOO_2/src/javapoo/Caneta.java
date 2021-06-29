
package javapoo;


public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.print("A caneta " + this.cor);
        System.out.println(" Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    
    public void tampar(){//esse método por ser publico te da acesso a um atributo privado.
        this.tampada = true;//private
    }
    
    public void destampar(){
        this.tampada = false;
    }    
    
    
}
