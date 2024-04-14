package Atividade1aula1104;

public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void zerar() {
        this.valor = 0;

    }

    public void incrementar() {
        this.valor++;

    }

    public int valor() {
        return this.valor;
    }
}
