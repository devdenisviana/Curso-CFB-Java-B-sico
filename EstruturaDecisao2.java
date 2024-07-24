import java.util.Scanner;

public class EstruturaDecisao2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");

        double nota = scan.nextDouble();

        System.out.println("Digite o numero de faltas do aluno:");

        int faltas = scan.nextInt();

        double media = 60;
        int maxFaltas = 5;

        if (nota >= media && faltas <= maxFaltas) {
            System.out.println("Aprovado");
        } else if (media >= 40) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Fim do programa");
    }
}