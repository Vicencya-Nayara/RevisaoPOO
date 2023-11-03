/*Crie uma classe em Java chamada Data que inclui três informações como variáveis de instância – 
mês (int), dia (int) e ano (int). A classe deve ter um método para cadastrar as informações. 
Forneça um método displayData que exibe o dia, o mês e o ano separados por barras normais ( / ). 
A classe deve ter também um método que retorna a data com o mês sendo escrito por extenso. 
Por exemplo: 12 de Outubro de 2023. Escreva um aplicativo de teste chamado DataTeste que demonstra as capacidades 
da classe Data. 
 */

package Q4;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano){
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public void cadastrarInfor(){
        System.out.println("Mês: " + mes);
        System.out.println("Dia: " + dia);
        System.out.println("Ano: " + ano);
    }

    public void displayData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public String getDataExtenso() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return dia + " de " + meses[mes - 1] + " de " + ano;
    }
}
