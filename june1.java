import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 * june1
 */
public class june1 {
  public static void main(String[] args) {
    String name = "Pranjal";
    char[] b = name.toCharArray();
    // String[] b= name.split(",");
    int sum = 0;
    int n = b.length;
    int i = 0;
    while (i < n - 1) {
      int sub = (int) (Math.abs(b[i] + b[i + 1]));
      sum = sum + sub;
      i++;
    }
    // for (char c : b) {
    // System.out.print(c + "=" + (int) (c) + "");
    // // int sub = (int) c - (int) (c + 1);
    // // sum = sum + sub;
    // }

    System.out.println(sum);

  }

}
