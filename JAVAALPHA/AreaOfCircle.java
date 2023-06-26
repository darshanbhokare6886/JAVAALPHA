import java.util.*;
public class AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        float area=3.14f*r*r;  //by default 3.14 is double hence we write 3.14f for float
        System.out.println(area);
    }
}
