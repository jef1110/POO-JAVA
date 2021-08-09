package contaCorrente;

import java.util.Scanner;

public class ContaCorrente {
    Scanner input = new Scanner(System.in);

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double valorASacar) {

        //tem saldo na conta
        if (saldo >= valorASacar) {
            saldo -= valorASacar;
            return true;
        } else {//nao tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= valorASacar) {
                    saldo -= valorASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;//nao é especial e nao tem saldo na conta
            }
        }
    }

    void checarSaque() {
        System.out.println("Digite o valor do saque: ");

        boolean saqueEfetuado = realizarSaque(input.nextDouble());

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Não foi possível realizar o saque! Saldo insuficiente");
        }
    }


    void depositar() {
        System.out.println("Digite o valor do deposito:");
        double valorDepositado = input.nextDouble();
        saldo += valorDepositado;
    }

    boolean usandoChequeEspecial(){
        return saldo < 0;
    }

    void consultarSaldo(){
        System.out.println("---------------------------------");
        if (usandoChequeEspecial()){
            System.out.println("Saldo atual da conta: " + saldo + "( " + (limiteEspecial + saldo)  + ")");
        }else{
            System.out.println("Saldo atual da conta: " + saldo);
        }
        System.out.println("---------------------------------");
    }

    void operacoes() {
        int i = 1;
        while (i == 1) {
            System.out.println(" 1 - Depositar\n 2 - RealizarSaque\n 3 - Consultar saldo");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    depositar();
                    break;
                case 2:
                    checarSaque();
                    break;
                case 3:
                    consultarSaldo();
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
    }
}
