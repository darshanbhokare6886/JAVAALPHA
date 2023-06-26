import java.util.*;
public class AdditionUsingFunction {

    public static int additionOfTwoNumbers(int a, int b){  //parameters or formal parameters
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value od b");
        int b=sc.nextInt();
        int sum=additionOfTwoNumbers(a,b);  //arguments or actual parameters
        System.out.println("Addition of a and b is "+ sum);
    }
}
