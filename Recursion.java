public class Recursion {


    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int resultrange = sumrange(10,98);
        System.out.println(resultrange);
      }
      public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
      }

    // written a function for adding number between given range like 45-98 through recursion

    public static int sumrange(int start, int end) {
        if (end > start) {
          return end + sumrange(start, end - 1);
        } else {
          return end;
        }
      }
    
    
}
