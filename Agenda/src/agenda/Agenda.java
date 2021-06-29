/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Eker
 */
public class Agenda {
    private static List<Pessoa> lista = new ArrayList<>();
    void cadastrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        Integer idade = entrada.nextInt();
        System.out.print("Digite sua altura: ");
        Float altura = entrada.nextFloat();
        lista.add(new Pessoa(nome, idade, altura));
    }
    void remover() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals(nome)) {
                lista.remove(i);
                break;
            }
        }
    }
    
    void listar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals(nome)) {
                System.out.println("A posição da pessoa é: " + (i+1));
                break;
            }
        }
    }
    
    void listarTodos() {
        for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i));
        }
    }
    
    void Posicao() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a sua posição: ");
        Integer posicao = entrada.nextInt();
        
        for (int i = 0; i < lista.size(); i++) {
            if (i == posicao) {
                System.out.println(lista.get(i));
                break;
            }
        }
    }
}
