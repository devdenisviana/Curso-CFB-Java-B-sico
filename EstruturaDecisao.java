import java.util.Scanner;

public class EstruturaDecisao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");

        double nota = scan.nextDouble();

        double media = 60;

        if (nota >= media) {
            System.out.println("Aprovado");
        } else if (media >= 40) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Fim do programa");
    }
}