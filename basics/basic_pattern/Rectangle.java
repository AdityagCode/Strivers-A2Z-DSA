package basics.basic_pattern; 

public class Rectangle {
    public static void main(String[] args) {
        int n = 3;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("X - ");
            }
            System.out.println("");
        }
    }
}