import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	if(x>y){
	    for(int i=1; i<11; i++){
	        int c = x-y;
	        System.out.print(i*c + " ");
	    }
	}else{
	    int d = (y-x);
	    for(int i=1; i<11; i++){
	        System.out.print(i*d + " ");
	    }
	}

	}
}
