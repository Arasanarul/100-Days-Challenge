import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if(isPrime(n)){
                System.out.print("prime");
            }else{
                System.out.print("no prime");
            }
    }   
    
    public static boolean isPrime(int n){
        if(n==1) return false;
        if(n==2||n==3) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=4,j=2;i*i<=n;i+=j,j=6-j){  
            if(n%i==0){
               return false;
            }
    }
    return true;
}
}
