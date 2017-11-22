package _02Statements;

public class StatementIf {
  // keyword: If, 条件分岐, else, else if

  // Q1
  static String lagerThan0(int v) {
    if (true) { // FIXME: if larger than 0
      return "OK";
    }
    return "NG";
  }

  // Q2
  static String witchSign(int v) {
    // FIXME: includes branch
    // v == 0: -> "0"
    // v > 0: -> "+"
    // v < 0: -> "-"

    if (v == 0) {
      return "0";
    } else if (v > 0) {
      return "0";
    } else {
      return "0";
    }
  }

  // Q3
  static boolean isZero(int v) {
    return false; // FIXME: v is 0 ? make online
  }
}
