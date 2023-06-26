import java.util.*;
public class GreatestOfTwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the valur of b");
        int b=sc.nextInt();

        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is less than b");
        }


    }
}
