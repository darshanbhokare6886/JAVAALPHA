public class TypeConversion {
    public static void main(String args[]){
        int a=25;
        float f=a;
        long l=a;
        double d=a;
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);
        
    }
}

 /*
  Typer conversion Widening Implicit

  byte->short->int->float->long->double

  Type conversion forn left to right is possible but right to left is not possible
  int to float, int to long, int to double possible but int to boolean is not possible
  size of destination is always greater than size of source in type conversion

  */