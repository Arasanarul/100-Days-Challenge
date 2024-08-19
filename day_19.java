import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 10) {
            int M = N+1;
            System.out.print(M);
        } else {
            int O = N-1;
            System.out.print(O);
        }
    }
}
