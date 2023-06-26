public class TypePromotion {
    public static void main(String args[]){
        char a='a';
        char b='b';

        System.out.println(a);  //a is printed
        System.out.println(b);

        System.out.println((int) a);  //ascii valur of a will printed
        System.out.println((int) b);
        
        System.out.println(a+b);  //a and b are promoted into int according to its ascii value then perform operation
        System.out.println(a-b);

        byte by=8;
        int i=2*by;  //byte by is promoted into int hence error not occured
        byte ans=(byte)(2*by);  //byte by is promoted into int hence type casting require if you want to print valur in byte 
        System.out.println(i);
        System.out.println(ans);

    
    }

}

/*
 java automatically promotes each byte, short, char operand into int when evaluatiog an expresstion
 
 if one operand is long, float, double the whole expression is promoted to long, float, double respectively

 */