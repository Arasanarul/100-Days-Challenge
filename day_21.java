import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = 0;
	for(int i=1;i<=x;i++){
	    if(x%i==0 && y%i==0)
	    z=i;
	} System.out.print(z);

	}
}
