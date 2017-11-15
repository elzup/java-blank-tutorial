package tips;

import org.junit.Assert;

public class ReferencesTypeTest {
  @org.junit.Test
  public void primitiveIsNotReferences() throws Exception {
    Assert.assertTrue(ReferencesType.primitiveIsNotReferences());
  }

  @org.junit.Test
  public void arrayIsReferences() throws Exception {
    Assert.assertTrue(ReferencesType.arrayIsReferences());
  }

  @org.junit.Test
  public void resetAllFalse() throws Exception {
    boolean[] flags = new boolean[]{ true, true, true, true, true };
    ReferencesType.resetAllFalse(flags);
    Assert.assertArrayEquals(flags, new boolean[]{ false, false, false, false, false });
  }

  @org.junit.Test
  public void checkCannotChange() throws Exception {
    boolean a = false;
    int b = 111;
    String str = "Hello.";
    ReferencesType.checkCannotChange(a, b, str);
    Assert.assertEquals(a, false);
    Assert.assertEquals(b, 111);
    Assert.assertEquals(str, "Hello.");
  }

}