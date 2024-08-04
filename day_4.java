
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=0;
		    if(a>=b)
		    c=a-b;
		    
		    int ans=(c/4);
		    ans=(c%4!=0)?ans+1:ans;
		    System.out.println(ans);
		}

	}
}
