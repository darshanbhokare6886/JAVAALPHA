public class GettersAndSetters {
    public static void main(String args[]){
        Pen p1=new Pen();  
        p1.setColour("Blue");  
        System.out.println(p1.getColour());
        p1.setTip(5);  
        System.out.println(p1.getTip());
        p1.setColour("Yellow");  
        System.out.println(p1.getColour());  

    }
}

class Pen{

    private String colour;  //property
    private int tip;  //property

    String getColour(){  //getters
        return this.colour;
    }

    int getTip(){  //getters
        return this.tip;
    }

    void setColour(String newColour){  //function  //setters
        this.colour=newColour;  //this represent specific/current object
    }

    void setTip(int newTip){  //function  //setters
       this.tip=newTip;  //this represent specific/current object
    }

}


