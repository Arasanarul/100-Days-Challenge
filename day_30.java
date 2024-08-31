import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[] ar=new int[n];
	for(int i=0; i<n;i++){
	    
	ar[i]=sc.nextInt();
	int a=ar[i];
	int b=0;
    while(a>0){
        b=b*10+(a%10);
        a/=10;
}
	    ar[i]=b;
	}
	System.out.println(Arrays.toString(ar));
}
}
