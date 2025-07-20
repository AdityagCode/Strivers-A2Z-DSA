package basics.basic_math;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

            int temp = num, rev = 0;
            while(temp>0){
                int ld = temp%10;
                rev =rev * 10 + ld;
                temp = temp /10;
            }

            if(num == rev){
                System.out.println(num + " is a palindrome number");
            }
            else{
                System.out.println(num + " is not a palindrome number");
            }
    }
}
