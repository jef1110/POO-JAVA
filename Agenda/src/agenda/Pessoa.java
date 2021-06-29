/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Eker
 */
public class Pessoa {
        private String nome;
    private Integer idade;
    private Float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + '}';
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, Integer idade, Float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}
