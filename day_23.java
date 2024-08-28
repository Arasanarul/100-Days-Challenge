import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y=0;
	for(int i=x; i>=1; i--){
	    y+=i;
	    
	   
	}
	System.out.print(y);
	}
}
