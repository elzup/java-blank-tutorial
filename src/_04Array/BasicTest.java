package _04Array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BasicTest {
  @Test
  public void q1initializeArray() throws Exception {
    Assert.assertArrayEquals(new int[]{123, 456, 789}, Basic.initializeArray());
  }

  @Test
  public void q2balkInitializeArray() throws Exception {
    Assert.assertArrayEquals(new int[]{10, 20, 30, 40, 50}, Basic.balkInitializeArray());
  }

  @Test
  public void q3all100() throws Exception {
    int[] a = new int[500];
    Arrays.fill(a, 100);
    Assert.assertArrayEquals(a, Basic.all100());
  }

  @Test
  public void q4passArrayToMethod() throws Exception {
    Assert.assertEquals(2, Basic.passArrayToMethod(new int[]{0, 1}));
    Assert.assertEquals(5, Basic.passArrayToMethod(new int[]{1, 1, 1, 1, 1}));
  }

  @Test
  public void q5multiple100Array() throws Exception {
    Assert.assertArrayEquals(
            new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 2, 4, 6, 8, 10, 12, 14, 16, 18}, {0, 3, 6, 9, 12, 15, 18, 21, 24, 27}, {0, 4, 8, 12, 16, 20, 24, 28, 32, 36}, {0, 5, 10, 15, 20, 25, 30, 35, 40, 45}, {0, 6, 12, 18, 24, 30, 36, 42, 48, 54}, {0, 7, 14, 21, 28, 35, 42, 49, 56, 63}, {0, 8, 16, 24, 32, 40, 48, 56, 64, 72}, {0, 9, 18, 27, 36, 45, 54, 63, 72, 81}},
            Basic.multiple99Array()
    );
  }

}