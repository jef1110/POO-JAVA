package Aluno;

import java.util.Scanner;

public class Aluno {
    Scanner input = new Scanner(System.in);
    public String nome;
    public String matricula;
    public String curso;
    public double notaDisciplina1;
    public double notaDisciplina2;
    public double notaDisciplina3;

    public Aluno() {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notaDisciplina1 = notaDisciplina1;
        this.notaDisciplina2 = notaDisciplina2;
        this.notaDisciplina3 = notaDisciplina3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaDisciplina1() {
        return notaDisciplina1;
    }

    public void setNotaDisciplina1(double notaDisciplina1) {
        this.notaDisciplina1 = notaDisciplina1;
    }

    public double getNotaDisciplina2() {
        return notaDisciplina2;
    }

    public void setNotaDisciplina2(double notaDisciplina2) {
        this.notaDisciplina2 = notaDisciplina2;
    }

    public double getNotaDisciplina3() {
        return notaDisciplina3;
    }

    public void setNotaDisciplina3(double notaDisciplina3) {
        this.notaDisciplina3 = notaDisciplina3;
    }

    void cadastrarAluno(){
        System.out.println("Digite o nome do aluno: ");
        setNome(input.nextLine());
        System.out.println("Digite o número da matricula do aluno: ");
        setMatricula(input.nextLine());
        System.out.println("Digite o nome do curso desse aluno: ");
        setCurso(input.nextLine());
        System.out.println("Digite a nota da P1: ");
        setNotaDisciplina1(input.nextDouble());
        System.out.println("Digite a nota da P2: ");
        setNotaDisciplina2(input.nextDouble());
        System.out.println("Digite a nota da P3: ");
        setNotaDisciplina3(input.nextDouble());
    }

    void calcularMedia() {
        double media = (getNotaDisciplina1() + getNotaDisciplina2() + getNotaDisciplina3()) / 3;
        if (media >= 7) {
            System.out.println("Aluno aprovado com média " + media);
        }else{
            System.out.println("Aluno reprovado com média " + media);
        }
    }

    @Override
    public String toString() {
        return  "Nome= " + nome + "\n" +
                "Matricula= " + matricula + "\n" +
                "Curso= " + curso + "\n" +
                "NotaDisciplina1= " + notaDisciplina1 + "\n" +
                "NotaDisciplina2= " + notaDisciplina2 + "\n" +
                "NotaDisciplina3= " + notaDisciplina3;
    }
}
