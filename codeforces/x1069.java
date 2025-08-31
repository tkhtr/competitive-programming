import java.util.Scanner;

public class x1069 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    int maxCount = 0, currStreak = 1;

    if (str.length() == 1) {
      System.out.println(1);
      return;
    }

    for (int i = 1; i < str.length(); i++) {
      if(str.charAt(i) == str.charAt(i - 1)) {
        currStreak++;
      } else {
        currStreak = 1;
      }
      maxCount = Math.max(maxCount, currStreak);
    }

    System.out.println(maxCount);
  }
}
