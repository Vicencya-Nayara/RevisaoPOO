package Q2;
/*Crie uma classe em Java chamada fatura para uma loja de suprimentos de informática. 
A classe deve conter quatro variáveis – o número (String), a descrição (String), a quantidade 
comprada de um item (int) e o preço por item (double). A classe deve ter um método para cadastrar as informações.
Além disso, forneça um método chamado TotalFatura que calcula o valor da fatura e depois retorna o valor como um double. 
Escreva um aplicativo de teste chamado FaturaTeste (em outro arquivo) que demonstra as capacidades da classe Fatura.
 */


public class Fatura {
    private String codigo;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Fatura(String codigo, String descricao, int quantidade, double precoItem) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }

    public void cadastrar() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço por item: " + precoItem);
    }

    public double totalFatura() {
        return quantidade * precoItem;
    }
    
}