package Atividadeaula2103;

public class Main {
    public static void main(String[] args) {

        Suprimentos item1 = new Suprimentos("001", "Monitor", 2, 600.00);

        System.out.println("Número do Item: " + item1.getNumeroItem());
        System.out.println("Descrição do Item: " + item1.getDescricaoItem());
        System.out.println("Quantidade: " + item1.getQuantidade());
        System.out.println("Preço Unitário: " + item1.getPrecoUnitario());

        System.out.println("Valor da Fatura: " + item1.getInvoiceAmount());
    }
}

