public class ArrayLargestElement {

    public static int largestElement(int array[]){

        int largest=Integer.MIN_VALUE;  //It indicates minus infinity

        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }

        return largest;
    }
    public static void main(String args[]){
        int array[]={2,3,6,12,56,34,76,98,54,49,29};
        int LE=largestElement(array);
        System.out.println("Largest element in the array is "+LE);
    }
}
