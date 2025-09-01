import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class x230A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int initialPower = scanner.nextInt(), n = scanner.nextInt();

    ArrayList<int[]> dragons = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      int dragonPower = scanner.nextInt(), bonus = scanner.nextInt();
      dragons.add(new int[]{dragonPower, bonus});
    }
    
    dragons.sort(Comparator.comparingInt(d -> d[0]));

    for (int[] item : dragons) {
      if (initialPower > item[0]) {
        initialPower += item[1];
      } else {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}
