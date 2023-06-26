import java.util.Scanner;

public class MultiplyFunction {

    public static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int mul=multiply(a,b);
        System.out.println("The multiplication of a and b is "+mul);
    }
}
