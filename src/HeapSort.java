
import java.util.Arrays;
import java.util.Scanner;


public class HeapSort {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    HeapUtils.sort(array);
    System.out.println(Arrays.toString(array));
  }
}


class HeapUtils {
  public static void heapify(int[] array, int size, int pos) {
    while (2 * pos + 1 < size) {
      int t = 2 * pos + 1;
      if (t + 1 < size && array[t] < array[t + 1]) {
        t = t + 1;
      }
      if (array[pos] < array[t]) {
        swap(array, pos, t);
        pos = t;
      } else {
        break;
      }
    }
  }


  public static int[] heapMake(int[] array) {
    int n = array.length;
    for (int i = n - 1; i >= 0; i--) {
      heapify(array, n, i);
    }
    return array;
  }

  public static void sort(int[] array) {
    int n = array.length;
    heapMake(array);
    while (n > 0) {
      swap(array, 0, n - 1);
      n--;
      heapify(array, n, 0);
    }

  }


  //some shift added


  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}