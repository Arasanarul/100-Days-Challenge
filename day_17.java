import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char x = sc.next().charAt(0);
	for(int i = 1;i<=5; i++ ){
	    System.out.print(x);
	    x++;
	}

	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = 0,z = 1;
	while( y < 3){
	    if(x % z==0){
	        System.out.print(z + " ");
	        y++;
	    }
	    z++;
	}
	}
}

