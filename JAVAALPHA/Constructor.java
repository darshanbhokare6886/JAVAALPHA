public class Constructor {
    public static void main(String args[]){
        Student s1=new Student("Darshan");
        System.out.println(s1.name);
    }
    
}

class Student{

    String name;
    int roll;

    Student(String name){  //constructor
        this.name=name;
        System.out.println("Constructor is called...");
    }

}

/*
 
Constructor is a special methos which is invoked automatically at the time of abject creation.
        Pen p1=new Pen();
It have the same name as class or structure
It do not have a return type(not even void)
It are only called once, at object creation
Memory allocation happens when constructor is called

Java create constructor automatically when user not create it by own.

Initialization is possible with the help of constructor
        Student s1=new Student("Darshan");
        Student(String name){  //constructor
        this.name=name;
        }


 */
