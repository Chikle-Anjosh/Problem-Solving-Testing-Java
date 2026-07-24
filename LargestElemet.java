
public class LargestElemet{
    public static void main(String[] args) {
        int arr[] = {12,100,15,17,21,64};
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            System.out.println("The Largest Element is : " +max);
    }
}
