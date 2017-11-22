package _02Statements;

import org.junit.Assert;
import org.junit.Test;

public class StatementIfTest {
  @Test
  public void q1lagerThan0() throws Exception {
    Assert.assertEquals(StatementIf.lagerThan0(1), "OK");
    Assert.assertEquals(StatementIf.lagerThan0(0), "NG");
    Assert.assertEquals(StatementIf.lagerThan0(-1), "NG");
  }

  @Test
  public void q2witchSign() throws Exception {
    Assert.assertEquals(StatementIf.witchSign(0), "0");
    Assert.assertEquals(StatementIf.witchSign(-10), "-");
    Assert.assertEquals(StatementIf.witchSign(4), "+");
  }

  @Test
  public void q3isZero() throws Exception {
    Assert.assertEquals(StatementIf.isZero(-10), false);
    Assert.assertEquals(StatementIf.witchSign(8), false);
    Assert.assertEquals(StatementIf.witchSign(0), true);
  }

}