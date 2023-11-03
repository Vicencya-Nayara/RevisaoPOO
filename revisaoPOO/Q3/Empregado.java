/*Crie uma classe em Java chamada Empregado que inclui três partes de informações como variáveis de instância 
– nome (String), sobrenome (String) e um salário mensal (double). A classe deve ter um método para cadastrar as informações. 
Escreva um aplicativo de teste chamado EmpregadoTeste que cria dois objetos Empregado e exibe o salário anual de cada objeto. 
Crie um método para exibir as informações do empregado. Crie um método para conceder aumento salarial aos empregados. 
Então dê a cada Empregado um aumento de 10% e exiba novamente o salário anual de cada Empregado.
 */

package Q3;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public void cadastrar(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Salario Mensal: " + salarioMensal);
    }

    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    public void concederAumentoSalarial(double percentualAumento) {
        salarioMensal += salarioMensal * (percentualAumento / 100);
    }
}
