public class ArithmeticOperators {
    public static void main(String args[]){

        int a=10;
        int b=5;

        System.out.println("Sum is "+ (a+b));
        System.out.println("Sub is "+(a-b));
        System.out.println("Mul is "+(a*b));
        System.out.println("Div is "+(a/b));
        System.out.println("Mod is "+(a%b));

        a=10;
        b=++a;  //pre increment operator
        System.out.println(a);
        System.out.println(b);

        a=10;
        b=a++;  //post increment operator
        System.out.println(a);
        System.out.println(b);

        a=10;
        b=--a;  //pre decrement operator
        System.out.println(a);
        System.out.println(b);

        a=10;
        b=a--;  //post decrement operator
        System.out.println(a);
        System.out.println(b);


    }
}
