import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int i;
        int temp;
        int sum = 0;
        for(i=1; i<=7; i++) {


            //sum = sum++;
            temp = sc1.nextInt();
            sum = sum + temp;
        }
            System.out.println(sum);

    }
}
