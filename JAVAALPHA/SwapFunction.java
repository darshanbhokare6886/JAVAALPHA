import java.util.Scanner;

public class SwapFunction {

    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        swap(a,b);
    }
}

//Java always call by value