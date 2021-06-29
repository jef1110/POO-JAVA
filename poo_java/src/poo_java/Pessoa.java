package poo_java;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome, data;
    private double altura;
    

    public String getNome() {
        return nome;
    }
            
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    private int calcularIdade(String data){
        LocalDate nascimento = LocalDate.parse(data);
        LocalDate atual = LocalDate.now();
        Period compare = Period.between(nascimento, atual);
        return compare.getYears();
    }

    @Override
    public String toString() {
        return "O seu nome é " + this.nome + " e sua idade é " + calcularIdade(this.data) + " e sua altura é " + this.altura;
    }   
}
