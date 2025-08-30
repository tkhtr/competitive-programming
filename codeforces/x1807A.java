import java.util.Scanner;

public class x1807A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for(int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      if(a + b == c) {
        System.out.println('+');
      } else {
        System.out.println('-');
      }
    }
  }
}
