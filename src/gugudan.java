import java.util.Scanner;
public class gugudan {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
  //      Scanner sc2 = new Scanner(System.in);
  //      int b = sc2.nextInt();

        int i =0;
        int j = 9;
            //for (i = a;; i++) {
        /*
        for (j=1; j <=9; j++) {
            System.out.println(" " + i + '*' + j + '=' + (i*j));

        }
         */
        for(i=1; i<10; i++){
            System.out.println(a+"*"+i+" = "+a*i);
        }
  }
}
