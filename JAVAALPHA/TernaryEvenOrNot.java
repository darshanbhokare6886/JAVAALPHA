import java.util.*;

public class TernaryEvenOrNot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=sc.nextInt();

        String type=((num%2)==0)?"Even":"Odd";

        System.out.println(type);
    }
}
