package basics.basic_pattern;

public class pattern2 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
