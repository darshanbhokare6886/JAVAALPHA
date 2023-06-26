import java.util.*;
public class PassOrFail {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks");
        int marks=sc.nextInt();

        String type=(marks>=33)?"Pass":"Fail";

        System.out.println(type);
    }
}
