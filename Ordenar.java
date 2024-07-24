import java.util.Arrays;

public class Ordenar {

    public static void main(String[] args) {

      int[] num={9,2,7,1,8,5,3,4,0,6};
      
            Arrays.sort(num);

      for(int n:num){
            System.out.printf("%d - ",n);
      }
}

}