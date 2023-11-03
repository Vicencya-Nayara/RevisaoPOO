package Q2;
public class FaturaTeste {

    public static void main(String[] args) {
        Fatura fatura = new Fatura("56792", "Notebook Positivo", 2, 1500.00);

        fatura.cadastrar();

        double total = fatura.totalFatura();

        System.out.println("Total da fatura: " + total);
    }
}
