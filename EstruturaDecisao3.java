import java.util.Scanner;

public class EstruturaDecisao3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa: ");

        int idade = scan.nextInt();

        int idadeMaior = 18;

        String resultado = idade >= idadeMaior ? "Maior de idade" : "Menor de idade";

        System.out.println(resultado);

        System.out.println("Fim do programa");
    }
}