package tips;

import org.junit.Assert;
import org.junit.Test;

public class CastVariableTest {
  @Test
  public void q1longToInt() throws Exception {
    int i = CastVariable.longToInt(12345L);
    Assert.assertEquals(12345, i);
  }

  @Test
  public void q2calcFloat() throws Exception {
    double f = CastVariable.calcFloat(3, 10);
    Assert.assertEquals(0.3f, f, 0.0001);
  }

  @Test
  public void q3toString() throws Exception {
    String r = CastVariable.toString(100);
    Assert.assertEquals("100", r);
  }

  @Test
  public void q4toInteger() throws Exception {
    int i = CastVariable.toInteger("555");
    Assert.assertEquals(555, i);
  }

}