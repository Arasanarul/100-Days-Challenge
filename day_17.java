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
	int y=0;
	for(int i = 1; i<=x ;i++){
	    if(x%i==0){
	        System.out.print(i+ " ");y+=1;
	    }
	    if(y==3) {
	    break;
	    }
	}
}
}

