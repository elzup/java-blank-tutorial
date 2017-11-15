package tips;

public class ReferencesType {
  // keyword: 参照型, 破壊的メソッド

  // Q1
  static boolean primitiveIsNotReferences() {
    int a = 100;
    int b = a;
    b = 101;
    return a == ; // FIXME: true となる比較へ変える
  }

  // Q2
  static boolean arrayIsReferences() {
    int[] a = new int[]{ 1, 2, 3 };
    int[] b = a;
    b[0] = 100;
    return a[0] == ; // FIXME: true となる比較へ変える
  }

  // Q3
  static void resetAllFalse(boolean[] flags) {
    // FIXME: flags の中身を全て false にする
    flags[0] = false;
  }

  // Q4
  static void checkCannotChange(boolean a, int b, String str) {
    // FIXME: a, b, str に好きな値を代入する
    str = "change";
  }
}
