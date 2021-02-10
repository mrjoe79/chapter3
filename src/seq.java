import java.util.Scanner;
public class seq {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        int i;
        if (b>a) {
            for (i = a; i <= b; i++) {
                System.out.print(" " + i);
            }
        }
        else {
            for (i = b; i <= a; i++) {
                System.out.print(" " + i);
            }
        }
    }
}