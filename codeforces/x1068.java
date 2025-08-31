import java.io.IOException;
import java.util.Scanner;

public class x1068 {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    long n = Integer.parseInt(scanner.nextLine());

    while (n >= 1) {
      if(n == 1) {
        System.out.println(1);
        break;
      }
      System.out.print(n + " ");
      if (n % 2 == 0) {
        n /= 2;
      } else if (n % 2 != 0) {
        n = (n * 3) + 1;
      }
    }
  }
}
