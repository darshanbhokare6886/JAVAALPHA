public class ArrayFunction {

    public static void update(int marks[]){
        marks[0]=marks[0]+1;
        marks[1]=marks[1]+1;
        marks[2]=marks[2]+1;
    }
    public static void main(String args[]){
        int marks[]={95,96,97};

        update(marks);  //Array is follows call by reference means when you make
                        //changes in other fuctions it will affects on main array 
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}
