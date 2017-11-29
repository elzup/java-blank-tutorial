package _04Array;

public class Basic {

  static public int[] initializeArray() {
    // FIXME: create and return [123, 456, 789]
    int a[] = new int[3];
    a[0] = 0;
    a[1] = 0;
    a[2] = 0;
    return a;
  }

  static public int[] balkInitializeArray() {
    // FIXME: create and return [10, 20, 30, 40, 50]
    return new int[]{10, 50};
  }

  static public int[] all100() {
    // FIXME: return all value initialized by 100
    // Use Arrays.fill
    int[] a = new int[500];
    return a;
  }

  static public int passArrayToMethod(int[] vals) {
    // FIXME: call `funcA` (with argumnet `vals`) and return result
    return 0;
  }

  static public int[][] multiple99Array() {
    // FIXME: create 9x9 table
    // a[3][5] = 15
    // 0 <= i <= 9
    // a.length = 10
    int[][] a = new int[10][10];
    for (int i = 0; i < 10; i++) {
      a[i][0] = 0;
    }
    return a;
  }

  // --- NOT EDIT ME ---
  private
  static int funcA(int[] a) {
    return a.length;
  }
}
