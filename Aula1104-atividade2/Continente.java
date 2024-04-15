package Atividade2aula1104;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Continente {
    private String nome;
    private ArrayList<Pais> paisesContinentes = new ArrayList<>();
    private double dimensaoTotal;
    private double populacaoTotal;
    private double densidadePopulacional;


    private Pais paisMaiorPopulacao;
    private Pais paisMenorPopulacao;
    private Pais paisMaiorDimensao;
    private Pais paisMenorDimensao;
    private double razaoTerritorial;


    public Continente(String nome,
                      double dimensaoTotal,
                      double populacaoTotal,
                      double densidadePopulacional,
                      Pais paisMaiorPopulacao,
                      Pais paisMenorPopulacao,
                      Pais paisMaiorDimensao,
                      Pais paisMenorDimensao,
                      double razaoTerritorial) {
        this.nome = nome;
        this.dimensaoTotal = dimensaoTotal;
        this.populacaoTotal = populacaoTotal;
        this.densidadePopulacional = densidadePopulacional;
        this.paisMaiorPopulacao = paisMaiorPopulacao;
        this.paisMenorPopulacao = paisMenorPopulacao;
        this.paisMaiorDimensao = paisMaiorDimensao;
        this.paisMenorDimensao = paisMenorDimensao;
        this.razaoTerritorial = razaoTerritorial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pais> getPaisesContinentes() {
        return paisesContinentes;
    }

    public void setPaisesContinentes(ArrayList<Pais> paisesContinentes) {
        this.paisesContinentes = paisesContinentes;
    }

    public double getDimensaoTotal() {
        return dimensaoTotal;
    }

    public void setDimensaoTotal(double dimensaoTotal) {
        this.dimensaoTotal = dimensaoTotal;
    }

    public double getPopulacaoTotal() {
        return populacaoTotal;
    }

    public void setPopulacaoTotal(double populacaoTotal) {
        this.populacaoTotal = populacaoTotal;
    }

    public double getDensidadePopulacional() {
        return densidadePopulacional;
    }

    public void setDensidadePopulacional(double densidadePopulacional) {
        this.densidadePopulacional = densidadePopulacional;
    }

    public Pais getPaisMaiorPopulacao() {
        return paisMaiorPopulacao;
    }

    public void setPaisMaiorPopulacao(Pais paisMaiorPopulacao) {
        this.paisMaiorPopulacao = paisMaiorPopulacao;
    }

    public Pais getPaisMenorPopulacao() {
        return paisMenorPopulacao;
    }

    public void setPaisMenorPopulacao(Pais paisMenorPopulacao) {
        this.paisMenorPopulacao = paisMenorPopulacao;
    }

    public Pais getPaisMaiorDimensao() {
        return paisMaiorDimensao;
    }

    public void setPaisMaiorDimensao(Pais paisMaiorDimensao) {
        this.paisMaiorDimensao = paisMaiorDimensao;
    }

    public Pais getPaisMenorDimensao() {
        return paisMenorDimensao;
    }

    public void setPaisMenorDimensao(Pais paisMenorDimensao) {
        this.paisMenorDimensao = paisMenorDimensao;
    }

    public double getRazaoTerritorial() {
        return razaoTerritorial;
    }

    public void setRazaoTerritorial(double razaoTerritorial) {
        this.razaoTerritorial = razaoTerritorial;
    }

    public void addPais(Pais pais) {
        paisesContinentes.add(pais);
    }

    public String toString() {
        return "Continente{" +
                "nome='" + nome + '\'' +
                ", dimensaoTotal=" + dimensaoTotal +
                ", populacaoTotal=" + populacaoTotal +
                ", densidadePopulacional=" + densidadePopulacional +
                ", paisMaiorPopulacao=" + paisMaiorPopulacao +
                ", paisMenorPopulacao=" + paisMenorPopulacao +
                ", paisMaiorDimensao=" + paisMaiorDimensao +
                ", paisMenorDimensao=" + paisMenorDimensao +
                ", razaoTerritorial=" + razaoTerritorial +
                '}';
    }
}
