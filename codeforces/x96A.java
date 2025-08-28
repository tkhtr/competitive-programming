import java.util.Scanner;

public class x96A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    
    int n = str.length();
    int k = 7;

    for(int i = 0; i <= n - k; i++) {
      int counter = 0;
      for(int j = i; j <= i + k - 1; j++) {
        if(str.charAt(i) == str.charAt(j)) {
          counter++;
        }
      }
      if(counter == k) {
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}