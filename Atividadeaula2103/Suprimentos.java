package Atividadeaula2103;

public class Suprimentos {
    private String numeroItem;
    private String descricaoItem;
    private int quantidade;
    private final double valorUnitario;


    public Suprimentos(String numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;

        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }

        if (precoUnitario > 0.0) {
            this.valorUnitario = precoUnitario;
        } else {
            this.valorUnitario = 0.0;
        }
    }


    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getNumeroItem() {
        return numeroItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return valorUnitario;
    }

    public double getInvoiceAmount() {
        return quantidade * valorUnitario;
    }
}
