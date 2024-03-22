package Atividadeaula21032;
public class Colaborador {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;


    public Colaborador(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        if (salarioMensal > 0)
            this.salarioMensal = salarioMensal;
        else
            this.salarioMensal = 0.0;
    }


    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0)
            this.salarioMensal = salarioMensal;
        else
            this.salarioMensal = 0.0;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }


    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }


    public void aplicarAumento(double percentual) {
        salarioMensal *= (1 + percentual / 100);
    }
}
