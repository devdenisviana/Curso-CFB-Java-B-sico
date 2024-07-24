import java.util.Scanner;

public class UsoFor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número : ");

        int n1 = scan.nextInt();

        for (int cont = 0; cont < 5 ; cont++){
            
            System.out.println(cont +" - Texto");
        }       
            System.out.println("Fim do programa");
}
}