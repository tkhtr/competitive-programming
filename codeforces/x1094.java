import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class x1094 {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    ArrayList<Integer> nums = new ArrayList<>();

    for(int i = 0; i < n; i++) {
      int num = scanner.nextInt();
      nums.add(num);
    }

    long minNumbOfMoves = 0;
    for(int i = 1; i < nums.size(); i++) {
      if(nums.get(i) < nums.get(i - 1)) {
        int diff = nums.get(i - 1) - nums.get(i);
        nums.set(i, diff + nums.get(i));
        minNumbOfMoves += diff;
      } 
    }

    System.out.println(minNumbOfMoves);
  }
}
