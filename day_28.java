import java.util.*;
public class Hello {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y=0;
    int z=1;
    for(int i = 1; i<=x; i++){
        int a=y+z;
        z =y;
        y=a;
    System.out.print(z + " ");
}
}
}
