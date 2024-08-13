import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	if (x%30==0 ||x%30==1 || x%30==2){
	    System.out.print("YES");
	}else{
	    System.out.print("NO");
	}

	}
}
