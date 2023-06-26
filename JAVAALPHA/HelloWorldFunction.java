import java.util.Scanner;

public class HelloWorldFunction {

    public static void helloWorld(int n){
        for(int i=0;i<n;i++){
            System.out.println("Hello World");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        helloWorld(n); 
    }
}
