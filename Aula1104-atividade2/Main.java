package Atividade2aula1104;

//2) Escreva em Java uma classe Continente. Um continente possui um nome e é composto
//        por um conjunto de países. Forneça os membros de classe a seguir:
//        a) Construtor que inicialize o nome do continente;
//        b) Um método que permita adicionar países aos continentes;
//        c) Um método que retorne a dimensão total do continente;
//        d) Um método que retorne a população total do continente;
//        e) Um método que retorne a densidade populacional do continente;
//        f) Um método que retorne o país com maior população no continente;
//        g) Um método que retorne o país com menor população no continente;
//        h) Um método que retorne o país de maior dimensão territorial no continente;
//        i) Um método que retorne o país de menor dimensão territorial no continente;
//        j) Um método que retorne a razão territorial do maior pais em relação ao menor país.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Agora me diga seu continente:");
        String continente = scanner.nextLine();

        System.out.println("Qual a dimensão do continente:");
        double dimensaoContinente = scanner.nextDouble();

        System.out.println("Qual a população total do continente:");
        int populacaoContinente = scanner.nextInt();

        System.out.println("Qual a densidade desse continente:");
        double densidadeContinente = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual país tem a maior população no continente:");
        String maiorPopulacaoPais = scanner.nextLine();

        System.out.println("Qual país tem a menor população no continente:");
        String menorPopulacaoPais = scanner.nextLine();

        System.out.println("Qual país tem a maior dimensão territorial no continente:");
        String maiorDimensaoTerritorialPais = scanner.nextLine();

        System.out.println("Qual país tem a menor dimensão territorial no continente:");
        String menorDimensaoTerritorialPais = scanner.nextLine();

        System.out.println("Qual a razão territorial entre o maior e menor país");
        double razaoterritorial = scanner.nextDouble();

        Continente continente1 = new Continente(
                continente,
                dimensaoContinente,
                populacaoContinente,
                densidadeContinente,
                new Pais(maiorPopulacaoPais),
                new Pais(menorPopulacaoPais),
                new Pais(maiorDimensaoTerritorialPais),
                new Pais(menorDimensaoTerritorialPais),
                razaoterritorial);

        System.out.println("Olá! Por favor, digite o nome de um país que você gostaria de adicionar ao continente:");
        String nomePais = scanner.nextLine();
        scanner.nextLine();

        continente1.addPais(new Pais(nomePais));

        System.out.println(continente1.toString());


    }
}

