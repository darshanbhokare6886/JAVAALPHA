public class TypesOfConstructor {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("Darshan");
        s2.roll=12;
        Student s3=new Student(13);


        s2.marks[0]=100;
        s2.marks[1]=90;
        s2.marks[2]=80;

        Student s4=new Student(s2);


        for(int i=0;i<3;i++)
        {
            System.out.println(s4.marks[i]);
        }

        s2.marks[0]=20;

         for(int i=0;i<3;i++)
        {
            System.out.println(s4.marks[i]);
        }

        
        
/* 
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s3.roll);
        System.out.println(s4.name);
        System.out.println(s4.roll); */

    }
}

class Student{

    String name;
    int roll;
    int marks[];

    Student(){  //Non parameterized
        System.out.println("Constructor is called...");
        marks=new int[3];

    }

    Student(String name){  //Parameterized
        this.name=name;
        marks=new int[3];

    }

    Student(int roll){  //Parameterized
        this.roll=roll;
        marks=new int[3];

    }

    /* 
    Shallow copy constructor
    Student(Student s2){  //Copy
        marks=new int[3];
        this.name=s2.name;
        this.roll=s2.roll;
        this.marks=s2.marks;
    }

    */

    Student(Student s2)
    {
        marks=new int[3];
        this.name=s2.name;
        this.roll=s2.roll;
        for(int i=0;i<marks.length;i++)
        {
            this.marks[i]=s2.marks[i];
        }
    }

}

/*

 * Non parameterized
 * Parameterized
 * Copy  //here properties of 
 
 You can write many constructor in your class
 Java by default create its own constructor when you not create any constructor

 When user create multiple constructor with different types of parameters/arguments 
 is known as Constructor Overloading

 Constructor Overloading is an example of Polymorphism.

 Shallow copy: copy references(changes reflects)
 Deep copy: new create of data types(changes do not reflects)
 
 */