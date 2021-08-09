package Aluno;

public class VerificarAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.cadastrarAluno();

        System.out.println(aluno);

        System.out.println("-------------------------------");

        aluno.calcularMedia();
    }
}
