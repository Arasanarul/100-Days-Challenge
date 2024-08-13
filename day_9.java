import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	if(x+y==z || x+z==y){
	    System.out.print("yes");
	}else{
	    System.out.print("no");
	}

	}
}
