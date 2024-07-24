import java.util.Scanner;

public class SwitchExemplo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a posicao do competidor ");

        int pos = scan.nextInt();

        switch (pos) {
            case 1:
            System.out.println("Primeiro lugar");
            System.out.println("Fim do programa");
            break;

            case 2:
            System.out.println("Segundo lugar");
            System.out.println("Fim do programa");
            break;

            case 3:
            System.out.println("Terceiro lugar");
            System.out.println("Fim do programa");
            break;

            default:
            System.out.println("Não subiu ao podio.");
            System.out.println("Fim do programa");
            break;
        }

       
}
}