package _02Statements;

import org.junit.Assert;
import org.junit.Test;

public class StatementIfTest {
  @Test
  public void q1lagerThan0() throws Exception {
    Assert.assertEquals("OK", StatementIf.lagerThan0(1));
    Assert.assertEquals("NG", StatementIf.lagerThan0(0));
    Assert.assertEquals("NG", StatementIf.lagerThan0(-1));
  }

  @Test
  public void q2witchSign() throws Exception {
    Assert.assertEquals("0", StatementIf.witchSign(0));
    Assert.assertEquals("-", StatementIf.witchSign(-10));
    Assert.assertEquals("+", StatementIf.witchSign(4));
  }

  @Test
  public void q3isZero() throws Exception {
    Assert.assertEquals(false, StatementIf.isZero(-10));
    Assert.assertEquals(false, StatementIf.isZero(8));
    Assert.assertEquals(true, StatementIf.isZero(0));
  }

}