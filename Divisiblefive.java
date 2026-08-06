import java.util.Scanner;
public class Divisiblefive {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a%5==0 || a%11==0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }
    }
}

