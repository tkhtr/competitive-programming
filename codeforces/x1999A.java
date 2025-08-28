import java.util.Scanner;

public class x1999A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for(int i = 0; i < n; i++) {
      int num = scanner.nextInt();
      int sum = 0;
      String strNum = String.valueOf(num);

      for(int j = 0; j < strNum.length(); j++) {
        sum += strNum.charAt(j) - '0';
      }

      System.out.println(sum);
    }
  }
}
