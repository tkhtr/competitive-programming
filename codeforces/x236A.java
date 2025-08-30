import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;

public class x236A {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Set<Character> set = new HashSet<>();

    for(int i = 0; i < str.length(); i++) {
      set.add(str.charAt(i));
    }

    if(set.size() % 2 == 0) {
      System.out.println("CHAT WITH HER!");
    } else {
      System.out.println("IGNORE HIM!");
    }
  }
}
