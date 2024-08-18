import java.util.*;
public class Hello {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = 0;
    for(int i=0;i<5;i++)if(sc.nextInt()%2!=0) y++;
    System.out.print(y);}
}
