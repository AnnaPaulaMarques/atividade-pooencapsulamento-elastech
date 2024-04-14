package Atividade1aula1104;

//1) Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de
//        itens ou eventos. A classe deve oferecer métodos que devem:
//        a) Zerar;
//        b) Incrementar;
//        c) Retornar o valor do contador.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valor = scanner.nextInt();
        Contador contador1 = new Contador(valor);

        contador1.valor();
        System.out.println("Valor do contador: " + contador1.getValor());

        contador1.incrementar();
        System.out.println("Valor do contador após incrementar: " + contador1.getValor());

        contador1.zerar();
        System.out.println("Valor do contador após zerar: " + contador1.getValor());

    }
}
