package Q4;

public class DataTeste {
    public static void main(String[] args) {
    
        Data data = new Data(2, 2, 2004);

        data.cadastrarInfor();
        data.displayData();

        System.out.println(data.getDataExtenso());
    }
}
