package _02Statements;

import java.util.HashMap;

public class StatementSwitch {
  // keyword: Switch, case, default

  // Q1
  static String toStr(int v) {
    // FIXME: As follows
    // v == 1: -> "One"
    // v == 2: -> "Two"
    // v == 3: -> "Three"
    // other:  -> "-"

    switch (v) {
      case 100:
        return "One";
      case 2:
        return "2";
      case 0:
        return "Zero";
      default:
        return "-";
    }
  }

  // Q2
  static int toNumber(String str) {
    // FIXME: As follows
    // "A"      : -> 100
    // "B", "C" : -> 200
    // "D", "E" : -> 300
    // other    :  -> -1
    switch (str) {
      case "A":
        return 100;
      case "B":
      case "C":
        return 200;
      default:
        return -1;
    }
  }

  // Q3
  static int toLogical(int v) {
    // FIXME: As follows
    // 1     : -> 123
    // 2     : -> 777
    // 3     : -> 999
    // other : -> -1

    int c = 0;
    switch (v) {
      case 1:
        c = 123;
      case 2:
        c = 777;
        break;
      case 3:
        c = 999;
        break;
    }
    return c;
  }

  // Q4
  static String toStr2(int v) {
    // FIXME: As follows
    // v == 1: -> "One"
    // v == 2: -> "Two"
    // v == 3: -> "Three"
    // other:  -> "-"

    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "One");
    map.put(2, "Two");
    return map.getOrDefault(v, "-");
  }
}
