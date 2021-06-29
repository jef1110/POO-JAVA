/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Scanner;

/**
 *
 * @author Eker
 */
public class Painel {
    void mostrar() {
        Agenda agenda = new Agenda();
        while (0 == 0) {
            Scanner entrada = new Scanner(System.in);
            
            System.out.print("1- Cadastrar pessoa \n"
                    + "2- Remover pessoa \n"
                    + "3- Listar posição \n"
                    + "4- Listar todas as pessoas \n"
                    + "5- Listar pela posição \n"
                    + "Insira uma das opções: ");
            int opcao = entrada.nextInt();
            
            if (opcao == 1) {
                agenda.cadastrar();
            } else if (opcao == 2) {
                agenda.remover();
            } else if (opcao == 4) {
                agenda.listarTodos();
            } else if (opcao == 5) {
                agenda.Posicao();
            }
            else if (opcao == 3) {
                agenda.listar();
            } else {
                System.exit(0);
                break;
            }
        }
    }
}
