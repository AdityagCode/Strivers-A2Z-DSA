package basics.basic_pattern;

public class pattern5 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i <num; i++) {
            for (int j = i; j <num; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
