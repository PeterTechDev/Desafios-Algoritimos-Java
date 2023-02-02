
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

            Scanner leitor = new Scanner(System.in);
            int tamanho = leitor.nextInt();
            String porcentagem = "";

            // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
        for (int i = 0; i < tamanho; i++) {
            porcentagem = porcentagem + "/";
        }

        System.out.println(porcentagem);
    }
}