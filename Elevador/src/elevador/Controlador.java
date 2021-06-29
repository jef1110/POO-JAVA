/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevador;

import java.util.Scanner;

/**
 *
 * @author Eker
 */
public class Controlador extends Elevador implements ControladorInterface {

    private Integer capacidade;
    private Integer andares;
    private Integer andar = 0;
    private Integer pessoas = 0;

    private Integer getPessoas() {
        return pessoas;
    }

    private void setPessoas(Integer pessoas) {
        this.pessoas = pessoas;
    }
    
    private Integer getAndar() {
        return andar;
    }

    private void setAndar(Integer andar) {
        this.andar = andar;
    }
            
    @Override
    public void painel() {
        
        setAndares(8);
        setCapacidade(5);
        
        Scanner in = new Scanner(System.in);
        
        while (0 == 0) {
            System.out.print("1- Subir \n"
                    + "2- Descer\n"
                    + "3- Entrar\n"
                    + "4- Sair\n"
                    + "5- Sair do Sistema\n \n"
                    + "Digite uma opção: ");
            int opcao = in.nextInt();
            if (opcao == 1) {
                subir();
            } else if (opcao == 2) {
                descer();
            } else if (opcao == 3) {
                entrar();

            } else if (opcao == 4) {
                sair();
            } else {
                System.exit(0);
                break;
            }
        }
    }

    @Override
    public void subir() {
        if (getAndar() < getAndares()) {
            System.out.println("Subindo...");
            setAndar(getAndar() + 1);
        } else {
            System.out.println("Último Andar");
        }
    }
    @Override
    public void descer() {
        if (getAndar() > 0) {
            System.out.println("Descendo...");
            setAndar(getAndar() - 1);
        } else {
            System.out.println("Terreo");
        }
    }

    @Override
    public void entrar() {
        if (getPessoas() < getCapacidade()) {
            System.out.println("Entrando mais uma pessoa...");
            setPessoas(getPessoas() + 1);
        } else {
            System.out.println("Limite de pessoas");
        }
    }

    @Override
    public void sair() {
        if (getPessoas() > 0) {
            System.out.println("Saindo mais uma pessoa...");
            setPessoas(getPessoas() - 1);
        } else {
            System.out.println("Não há pessoas para sair");
        }
    }
}
