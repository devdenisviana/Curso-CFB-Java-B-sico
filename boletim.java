public class boletim {
    public static void main(String[] args) {
        
        int nota = 85;
        int faltas = 10;
        int maxFaltas = 5;
        int media = 60;

        if (nota >= media && faltas <= maxFaltas) {
            System.out.println("Aprovado");
        }else if(nota >= 40){
            System.out.println("recuperacao");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("Fim do programa");

    }
}
