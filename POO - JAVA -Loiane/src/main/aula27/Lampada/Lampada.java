package Lampada;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;


    //metodos
    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if(ligada) {
            System.out.println("A Lâmpada está ligada!");
        }else{
            System.out.println("A Lâmpada está desligada!");
        }
    }
}
