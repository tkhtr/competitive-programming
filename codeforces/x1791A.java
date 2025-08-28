import java.util.Scanner;

public class x1791A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    String codeforces = "codeforces";

    for (int i = 0; i < n; i++) {
      char character = scanner.next().charAt(0);
      int counter = 0;
      
      for (int j = 0; j < codeforces.length(); j++) {
        if (character == codeforces.charAt(j)) {
          counter++;
        } 
      }

      if (counter >= 1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
