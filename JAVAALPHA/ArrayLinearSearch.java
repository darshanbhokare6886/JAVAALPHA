public class ArrayLinearSearch {

    public static int linearSearch(int array[], int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int array[]={2,3,6,12,56,34,76,23,54,49,29};
        int key=56;
        int index=linearSearch(array,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is found at index "+index);
        }
    }
}
