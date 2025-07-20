package basics.basic_math;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num ");
        int num = sc.nextInt();
        sc.close();

        int ld =  0;
        int rev = 0;
        while (num>0) {
            ld = num % 10;
            rev = (rev * 10) +ld;
            num = num/10;
        }
        System.out.println("Reversed Number = "+rev);
    }
    
}