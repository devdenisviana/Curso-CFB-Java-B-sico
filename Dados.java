import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); // Corrigido de System.ini para System.in
        int n1=0, n2=0, res=0; 
        String nome = "";

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite um numeral: ");
        n1 = Integer.parseInt(scan.nextLine()); // Corrigido para converter a entrada para int

        System.out.println("Digite um numeral: ");
        n2 = Integer.parseInt(scan.nextLine()); // Corrigido para converter a entrada para int

        res = n1 + n2;

        // Corrigido para usar printf ou String.format
        System.out.printf("%s, a soma de %d com %d é igual a %d\n", nome, n1, n2, res); // Uso de printf para formatação
        
    }
}