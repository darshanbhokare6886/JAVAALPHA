public class ArraySmallest {

    public static int smallestElement(int array[]){

        int smallest=Integer.MAX_VALUE;  //It indicates plus infinity

        for(int i=0;i<array.length;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
        }

        return smallest;

    }
    public static void main(String args[]){
        int array[]={2,3,6,12,56,34,76,98,54,49,29};
        int SE=smallestElement(array);
        System.out.println("Smallest element in the array is "+SE);

    }
}
