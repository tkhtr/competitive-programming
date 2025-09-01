import java.util.Scanner;

public class x1072 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      long totalPairs = ((long)i * i * (i * i - 1)) / 2;
      long attacking = 4 * (i - 1) * (i - 2);
      long result = totalPairs - attacking;
      System.out.println(result);
    }
  }
}
