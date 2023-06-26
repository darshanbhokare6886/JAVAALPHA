public class ClassAndObject {
    public static void main(String args[]){
        Pen p1=new Pen();  //crete new object p1, allocate memory to the object, constructor
        p1.setColour("Blue");  //Call for setColour function
        System.out.println(p1.colour);
        p1.setTip(5);  //Call for setTip fuction
        System.out.println(p1.tip);
        p1.colour="Yellow";  //directly assign value to the property without calling the fucntion
        System.out.println(p1.colour);  

    }
    
}

class Pen{

    String colour;  //property
    int tip;  //property

    void setColour(String newColour){  //function
        colour=newColour;
    }

    void setTip(int newTip){  //function
        tip=newTip;
    }

}


/*
  
 * class:group of these entities
 * object:entities in real world
 
 class name : pen
 properties/attributes : colour(blue, red, yellow)
 functions/methods : changeColour

 class:pascal case
 functions:camel case

Pen p1=new Pen();
//crete new object p1, allocate memory to the object, constructor


 */