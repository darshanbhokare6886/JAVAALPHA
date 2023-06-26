import java.util.Scanner;

public class FactorialFunction {

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int answer=factorial(n);
        System.out.println("The factorial of given number is "+answer);
    }
}
