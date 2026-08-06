
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("The Largest Element is : "+a);
        }else if(a<b){
            System.out.println("The Largest Element is : "+b);
        }else{
            System.out.println("Both Are Equal");
        }
    }
 }
