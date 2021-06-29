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
public class Elevador {
    private Integer capacidade, andares;
    
    void iniciar(int capacidade, int andares) {
        System.out.println("Elevador funcionando");
        Controlador controlador = new Controlador();
        controlador.painel();
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getAndares() {
        return andares;
    }

    public void setAndares(Integer andares) {
        this.andares = andares;
    }
}
