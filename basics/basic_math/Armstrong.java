package basics.basic_math;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        
        if(new Armstrong().isArmstrong(num)){
            System.out.println(num + " is a armstrong number.");
        }
        else{
            System.out.println(num + " is not an armstrong number.");
        }

    }
    public boolean isArmstrong (int num){
        int armstrong = 0, dup =num;
        while(dup>0){
            int ld = dup%10;
            armstrong = armstrong+ ld*ld*ld;
            dup = dup/10;
        }

        return armstrong == num;
    }
}
