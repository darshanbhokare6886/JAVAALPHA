public class ArrayBinarySearch {

    public static int binarySearch(int array[],int key){
        int start=0;
        int end=array.length-1;
       
        while(start<=end){

            int mid=(start+end)/2;

            if(array[mid]==key){
                return mid;
            }
            else if(array[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }

        return -1;

    }
    public static void main(String args[]){
        int array[]={2, 3, 6, 12, 23, 34, 49, 54, 56, 76};
        int key=34;
        int index=binarySearch(array,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is found at index "+index);
        }  
    }
}
