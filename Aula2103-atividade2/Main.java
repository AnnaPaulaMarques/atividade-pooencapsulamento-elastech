package Atividadeaula21032;

public class Main {
    public static void main(String[] args) {

        Colaborador colaborador1 = new Colaborador("Rafael", "Silva", 5000);
        Colaborador colaborador2 = new Colaborador("Anna", "Marques", 6000);

        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + ": " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + ": " + colaborador2.calcularSalarioAnual());

        colaborador1.aplicarAumento(10);
        colaborador2.aplicarAumento(10);

        System.out.println("Após aumento de 10%:");
        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + ": " + colaborador1.calcularSalarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + ": " + colaborador2.calcularSalarioAnual());
    }
}

