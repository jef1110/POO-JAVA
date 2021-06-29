/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevador;

/**
 *
 * @author Eker
 */
public class MainElevador {

    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        int capacidade = 5;
        int andares = 10;
        elevador.iniciar(capacidade, andares);
    }
}
