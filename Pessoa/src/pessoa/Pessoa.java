/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Eker
 */
public class Pessoa {

    private String nome, idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private int CalcularIdade(String idade) {
        LocalDate dataNascimento = LocalDate.parse(idade);
        LocalDate dataAtual = LocalDate.now();
        Period compare = Period.between(dataNascimento, dataAtual);
        return compare.getYears();
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + CalcularIdade(idade) + ", altura=" + altura + '}';
    }

}
