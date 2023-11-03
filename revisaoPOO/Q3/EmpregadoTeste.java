package Q3;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Vicencya", "Nayara", 1000.0);
        Empregado empregado2 = new Empregado("Eduarda", "Ferreira", 1500.0);

        System.out.println("Informações do Empregado 1:");
        empregado1.cadastrar();
        System.out.println("Salário Anual: " + empregado1.calcularSalarioAnual());

        System.out.println("\nInformações do Empregado 2:");
        empregado2.cadastrar();
        System.out.println("Salário Anual: " + empregado2.calcularSalarioAnual());

        empregado1.concederAumentoSalarial(10);
        empregado2.concederAumentoSalarial(10);

        System.out.println("\nSalário Anual após o Aumento:");

        System.out.println("Empregado 1 - Salário Anual: " + empregado1.calcularSalarioAnual());
        System.out.println("Empregado 2 - Salário Anual: " + empregado2.calcularSalarioAnual());
    }
}
