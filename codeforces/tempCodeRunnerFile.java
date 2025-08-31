import java.util.Scanner;

public class x1069 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    int maxCount = 0;

    for (int i = 0; i < str.length(); i++) {
      int currSeqCount = 1;
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
          currSeqCount++;
        }
      }
      maxCount = Math.max(maxCount, currSeqCount);
    }

    System.out.println(maxCount);
  }
}
