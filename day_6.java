import java.util.*;
public class Hello {

    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(x%2==0 && y%2==0){
        System.out.print("EVEN");
    }else if(x%2==1 && y%2==1){
        System.out.print("ODD");
    }else{
        System.out.print("MIXWD");
    }
    }
}
