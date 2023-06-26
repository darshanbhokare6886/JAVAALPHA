import java.util.*;
public class GretestOfthree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter teh 3rd number");
        int c=sc.nextInt();

        if(a>b&&a>c){
            System.out.println("a is greatest");
        }
        else if(b>c){
            System.out.println("b is greatest");
        }
        else{
            System.out.println("c is greatest");
        }
        

    }
}
