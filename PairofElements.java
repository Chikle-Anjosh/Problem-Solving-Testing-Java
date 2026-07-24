
public class PairofElements {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
             System.out.println("(" +arr[i] + " " + arr[j]+")");
        }
    }
}
