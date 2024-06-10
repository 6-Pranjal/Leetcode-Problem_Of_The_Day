import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class june4 {
  public static void main(String[] args) {

     // Create a frequency map of characters
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int maxLength = 0;
        boolean oddCountFound = false;

        // Calculate the length of the longest palindrome possible
        for (int count : charCountMap.values()) {
            if (count % 2 == 0) {
                maxLength += count;
            } else {
                maxLength += count - 1;
                oddCountFound = true;
            }
        }

        // If there is at least one character with an odd count, we can place one in the center
        if (oddCountFound) {
            maxLength += 1;
        }

        return maxLength;
    }
}

    String s = "Pranjal";
    System.out.println(s);
    if (s.length() == 1) {
      System.out.println("1");
      ;
    } else {
      char[] s1 = s.toCharArray();
      System.out.println(Arrays.toString(s1));
      Arrays.sort(s1);
      System.out.println(Arrays.toString(s1));

      

    }
  }

}
