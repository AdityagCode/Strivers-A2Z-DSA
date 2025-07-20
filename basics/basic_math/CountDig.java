package basics.basic_math;

 class Solution{
    public int countDig(int num){
        int dig = 0;

        while(num>0){
            num = num/10;
            dig++;
        }
        return dig;
    }
 }

 public class CountDig {
    public static void main(String[] args ){
        Solution sol = new Solution();
        int dig = sol.countDig(4);
        System.out.println("Digit : " + dig );
    }
}