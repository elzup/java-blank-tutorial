package tips;

import org.junit.Assert;


public class ReferencesTypeTest {
  @org.junit.Test
  public void q1primitiveIsNotReferences() throws Exception {
    Assert.assertTrue(ReferencesType.primitiveIsNotReferences());
  }

  @org.junit.Test
  public void q2arrayIsReferences() throws Exception {
    Assert.assertTrue(ReferencesType.arrayIsReferences());
  }

  @org.junit.Test
  public void q3resetAllFalse() throws Exception {
    boolean[] flags = new boolean[]{ true, true, true, true, true };
    ReferencesType.resetAllFalse(flags);
    boolean[] ex = new boolean[]{ false, false, false, false, false };
    Assert.assertArrayEquals(ex, flags);
  }

  @org.junit.Test
  public void q4checkCannotChange() throws Exception {
    boolean a = false;
    int b = 111;
    String str = "Hello.";
    ReferencesType.checkCannotChange(a, b, str);
    Assert.assertEquals(false, a);
    Assert.assertEquals(111, b);
    Assert.assertEquals("Hello.", str);
  }

  @org.junit.Test
  public void q5noBangArraySum() throws Exception {
    int[] nums = new int[]{ 1, 2, 3, 4 };
    int sum = ReferencesType.noBangArraySum(nums);
    int[] ex = new int[]{ 1, 2, 3, 4 };

    Assert.assertEquals(10, sum);
    Assert.assertArrayEquals(ex, nums);
  }
}