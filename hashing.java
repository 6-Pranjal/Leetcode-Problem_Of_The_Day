import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hashing {
  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<>();

    String s = "Pranjal";
    char[] s1 = s.toCharArray();

    // for (char e : s1) {
    // System.out.print(e + " ");
    // }
    // System.out.println(" ");

    // for (int e : s1) {
    // System.out.print(e + " ");
    // }

    // System.out.println(Arrays.toString(s1));

    // map.put('p', 1);
    // int value = map.get('p');
    // System.out.println(value);
    // System.out.println(map);
    // value = value + 1;
    // map.put('p', value);
    // System.out.println(map);

    // for (int i = 0; i < s1.length; i++) {
    // int count = 0;
    // if (map.containsKey(s1[i])) {
    // int value = map.get(s1[i]);
    // map.put(s1[i], value);
    // }

    // }

    System.out.println("counting the freqeuncy of char");
    System.out.println(s);

    for (char e : s1) {
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
      if (value == 1) {
        char key = e.getKey();
        list.add(key);
      }
    }

    System.out.print(list);

  }
}
