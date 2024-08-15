import java.util.*;
public class Hello {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    String y = sc.next();
    if(x.charAt(0)==y.charAt(0) || x.charAt(2)==y.charAt(2)){
        System.out.print("yes");
    }else{
        System.out.print("no");
    }
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	if(y<x && y<z){
	    if(x%y==0 && z%y==0){
	        System.out.print("yes");
	    }else{
	        System.out.print("no");
	    }
	}else if(x<y && x<z){
	    if(y%x==0 && z%x==0){
	        System.out.print("yes");
	    }else{
	        System.out.print("no");
	    }
	}else{
	    if(x%z==0 && y%z==0){
	        System.out.print("yes");
	    }else{
	        System.out.print("no");
	    }
	}
	
	}
}
