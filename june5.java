import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class june5 {
  public static void main(String[] args) {
    String[] words = { "bella", "label", "roller" };
    // String s1 = null;
    // for (int i = 0; i < words.length; i++) {
    // s1 = s1 + words[i];
    // }
    // System.out.println(s1);
    // char[] s2 = s1.toCharArray();
    // Arrays.sort(s2);
    // System.out.println(Arrays.toString(s2));

    String s1 = "";
    int n = words.length;
    for (int i = 0; i < n; i++) {
      s1 = s1 + words[i];
    }
    System.out.println(s1);
    char[] s2 = s1.toCharArray();

    System.out.println(Arrays.toString(s2));

    HashMap<Character, Integer> map = new HashMap<>();
    for (char e : s2) {
      int i = 0;
      if (map.containsKey(e)) {
        int value = map.get(e);
        value += 1;
        map.put(e, value);
      } else {
        map.put(e, 1);
      }
      i++;
    }

    System.out.println(map);

    ArrayList<Character> list = new ArrayList<>();
    for (Map.Entry<Character, Integer> e : map.entrySet()) {
      int value = e.getValue();
      if (value % n == 0) {
        char key = e.getKey();
        list.add(key);
      }
    }

    System.out.println(list);
  }
}
