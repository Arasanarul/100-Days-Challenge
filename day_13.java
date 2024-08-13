import java.util.*;
public class Hello {
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String x = sc.next();
	String y = sc.next();
   if(x.charAt(0)==y.charAt(0) && x.charAt(1)==y.charAt(1) && x.charAt(2)==y.charAt(2)){
	       System.out.print("YES");
	   }else{
	    System.out.print("NO");
	}

	}
}
