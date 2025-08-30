import java.util.Scanner;

public class x281A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    System.out.println(Character.toUpperCase(str.charAt(0)) + str.substring(1));
  }
}
