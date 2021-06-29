/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Eker
 */
public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Erik");
        pessoa.setIdade("2001-06-11");
        pessoa.setAltura(1.87);
        System.out.println(pessoa);
    }
}