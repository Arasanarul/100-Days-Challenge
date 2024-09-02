import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a=1;
        
        while(b>0){
            int c = (b%10);
            b/=10;
            
            
        System.out.print(c);
        }
	

	}
}
