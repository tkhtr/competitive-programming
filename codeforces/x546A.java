import java.io.IOException;
import java.util.Scanner;

public class x546A {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int k = Integer.parseInt(scanner.next());
    int n = Integer.parseInt(scanner.next());
    int w = Integer.parseInt(scanner.next());

    int sum = 0;

    for(int i = 1; i <= w; i++) {
      int bananaPrice = i * k;
      sum += bananaPrice;
    }

    int diff = sum - n;

    if(diff > 0) {
      System.out.println(diff);
    } else {
      System.out.println(0);
    }
  }
}
