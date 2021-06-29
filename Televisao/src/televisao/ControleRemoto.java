package televisao;

import java.util.Scanner;

public class ControleRemoto {

    //Atributos
    private int volume = 10, canal;
    //public int [] canais = new int[10];
    public String nome;

    //Método
    
    public void aumentarCanal() {
        this.setCanal(this.getCanal() + 1);
    }

    public void diminuirCanal() {
        this.setCanal(this.getCanal() - 1);
    }

    public void aumentarVolume() {
        this.setVolume(this.getVolume() + 5);
    }

    public void diminuirVolume() {
        this.setVolume(this.getVolume() - 5);
    }

    public void escolherCanal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um canal:");
        int ch = entrada.nextInt();
        
        System.out.println("Você está no canal " + ch);
        
    }

    public void status() {
        System.out.println("Você entá no canal " + this.getCanal());
        System.out.println("volume: " + this.getVolume());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

}
