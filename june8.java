import java.util.Arrays;
import java.util.Scanner;

public class june8 {
  public static void main(String[] args) {
    int k = 6;
    int[] nums = { 23, 2, 4, 6, 7 };

    System.out.println(Arrays.toString(nums));

    int n = nums.length;
    int count = 0;
    int sum = 0;
    if (n == 1 && nums[0] <= k) {
      System.out.println("false");
      System.out.println("n " + n);
    } else {
      for (int i = 0; i < n; i++) {
        sum += nums[i];

        if (sum % k != 0 && nums[i] < k && sum > k) {
          count += 1;
          System.out.println("sum " + sum + "i " + i + "count " + count);
        } else {
          sum = 0;
          count = 0;
        }

        if (i == n - 1 && sum % k != 0) {

          System.out.println(false);
        }

      }

      if (count > 1) {
        System.out.println(true);
        System.out.println("count " + count);
      } else {
        System.out.println(false);
      }
    }
  }
}