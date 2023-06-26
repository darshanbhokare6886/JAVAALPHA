import java.util.Scanner;
public class DecimalToBinary {

    public static int decToBin(int dec){

        int ans=0;
        int pow=0;

        while(dec>0){
            int rem=dec%2;
            ans=ans+rem*(int)Math.pow(10, pow);
            pow++;
            dec=dec/2;
        }

        return ans;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int dec=sc.nextInt();
        int answer=decToBin(dec);
        System.out.println(answer);
        
    }
}
