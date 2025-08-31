import java.io.IOException;
import java.util.Scanner;

public class x1083 {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int actualSum = 0;
    
    for(int i = 0; i < n - 1; i++) {
      int num = scanner.nextInt();
      actualSum += num;
    }

    int overalSum = n * (n + 1) / 2;

    System.out.println(overalSum - actualSum);
  }
}
