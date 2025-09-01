import java.util.Scanner;

public class x1070 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextInt();

    if (n == 1) {
      System.out.println(1);
    } else if (n == 2 || n == 3) {
      System.out.println("NO SOLUTION");
    } else {
      StringBuilder result = new StringBuilder();

      for (int i = 2; i <= n; i += 2) {
        result.append(i);
        result.append(" ");
      }

      for (int i = 1; i <= n; i += 2) {
        result.append(i);
        result.append(" ");
      }

      System.out.println(result.toString().trim());
    }
  }
}
