
package com.mycompany.banco;
import java.util.Scanner;
public class Banco {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();
        System.out.print("Digite o Nome: ");
        cb.setNome(teclado.next());
        System.out.print("Digite a Conta: ");
        cb.setnumConta(teclado.nextInt());
       // System.out.print("Digite o Deposito: ");
       //cb.realizarDeposito(teclado.nextDouble());
        System.out.print("Digite o Saque: ");
        cb.realizarSaque(teclado.nextDouble());
        System.out.println("----DADOS DA CONTA----");
        cb.mostrar();
        
    }
}
