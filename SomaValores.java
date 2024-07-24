import java.util.Scanner;

public class SomaValores {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");

        int n1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");

        int n2 = scan.nextInt();

        int res = n1 + n2;

        System.out.printf("A soma de %d com %d e igual a %d.", n1,n2,res);
       
       
}
}