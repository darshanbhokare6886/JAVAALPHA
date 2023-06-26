import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int biCo(int n, int r){
        int nA=factorial(n);
        int rA=factorial(r);
        int nmrA=factorial(n-r);
        int answer=nA/(rA*nmrA);
        return answer;
    }

     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of r");
        int r=sc.nextInt();
        int finalAns=biCo(n, r);
        System.out.println("The Binomial Coefficient of given number is "+finalAns);
    }
    
}
