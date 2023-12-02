

public class CountWays {
    public static int CountNoWays(int NoStairs){
        
        if (NoStairs == 1 || NoStairs == 2) {
            return NoStairs;
        }
        else {
            return CountNoWays(NoStairs - 1) + CountNoWays(NoStairs - 2);
        }



    }
    public static void main(String[] args) {
        int NoStairs=6;
        int result = CountNoWays(NoStairs);
        System.out.println(result);
    }
}
