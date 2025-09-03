import java.util.ArrayList;

class x74m {

  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {5, 6, 7}};
    int target = 1;
    boolean result = searchMatrix(matrix, target);
    System.out.println(result);
  }

  public static boolean binarySearch(int[] arr, int target) {
      int start = 0, end = arr.length - 1;

      while (start <= end) {
          int mid = (start + end) / 2;
          if (arr[mid] == target) {
              return true;
          } else if (arr[mid] < target) {
              start = mid + 1;
          } else {
              end = mid - 1;
          }
      }
      return false;
  }

  public static boolean searchMatrix(int[][] matrix, int target) {
      if (matrix.length == 0) {
          return false;
      }

      ArrayList<Boolean> result = new ArrayList<>();
      for (int[] row : matrix) {
          boolean x = binarySearch(row, target);
          result.add(x);
      }
      if (result.contains(true)) {
          return true;
      } else {
          return false;
      }
  }
}
