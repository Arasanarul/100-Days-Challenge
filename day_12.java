import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	if((x>=y)&&(y>=z) || (x<=y)&&(y<=z)){
	    System.out.print("SORTED");
	}else{
	    System.out.print("NOTSORTED");
	}

	}
}
