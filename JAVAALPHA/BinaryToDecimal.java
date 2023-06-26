import java.util.Scanner;

public class BinaryToDecimal {

    public static int binToDec(int bin){

        int ans=0;
        int pow=0;

        while(bin>0){
            int ld=bin%10;
            ans=ans+ld*(int)Math.pow(2, pow);
            pow++;
            bin=bin/10;
        }

        return(ans);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number");
        int bin=sc.nextInt();
        int answer=binToDec(bin);
        System.out.println(answer);
    }
}
