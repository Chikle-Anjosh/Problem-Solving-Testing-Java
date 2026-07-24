
public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {10,21,3,133,122,31,1,5};
        int min=arr[0];
        for (int i = 1; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            } 
        }
        System.out.println("The Smallest Element is : "+min);
    }
}
