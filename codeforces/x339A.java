import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class x339A {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();

      String result = "";
      List<Integer> nums = new ArrayList<>();

      for(char c : str.toCharArray()) {
        if(c != '+') {
          nums.add(c - '0');
        }
      }

      Collections.sort(nums);

      for(int i = 0; i < nums.size(); i++) {
        result += nums.get(i);
        if(i != nums.size() - 1) {
          result += '+';
        }
      }

      System.out.println(result);

  }
}
