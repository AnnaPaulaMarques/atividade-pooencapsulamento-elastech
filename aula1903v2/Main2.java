package aula1903v2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public class ListadeTarefas {
    }

    public static void main(String[] args) {
        ArrayList<String> listaTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            exibirMenu();
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner


            switch (escolha) {
                case 1:
                    adicionarTarefa(listaTarefas, scanner);
                    break;
                case 2:
                    removerTarefa(listaTarefas, scanner);
                    break;
                case 3:
                    listarTarefas(listaTarefas);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }


    public static void exibirMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Remover Tarefa");
        System.out.println("3. Listar Tarefas");
        System.out.println("4. Sair do Programa");
        System.out.print("Escolha uma opção: ");
    }


    public static void adicionarTarefa(ArrayList<String> listaTarefas, Scanner scanner) {
        System.out.print("Digite a nova tarefa: ");
        String tarefa = scanner.nextLine();
        listaTarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }


    public static void removerTarefa(ArrayList<String> listaTarefas, Scanner scanner) {
        if (listaTarefas.isEmpty()) {
            System.out.println("Não há tarefas para remover.");
            return;
        }


        System.out.println("Tarefas pendentes:");
        for (int i = 0; i < listaTarefas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTarefas.get(i));
        }
        System.out.print("Digite o número da tarefa que deseja remover: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpar o buffer do scanner
        if (indice >= 0 && indice < listaTarefas.size()) {
            String tarefaRemovida = listaTarefas.remove(indice);
            System.out.println("Tarefa '" + tarefaRemovida + "' removida com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }


    public static void listarTarefas(ArrayList<String> listaTarefas) {
        if (listaTarefas.isEmpty()) {
            System.out.println("Não há tarefas pendentes.");
            return;
        }


        System.out.println("Tarefas pendentes:");
        for (int i = 0; i < listaTarefas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTarefas.get(i));
        }
    }
}

