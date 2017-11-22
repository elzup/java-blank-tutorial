package _02Statements;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatementSwitchTest {
  @Test
  public void q1toStr() throws Exception {
    Assert.assertEquals("One", StatementSwitch.toStr(1));
    Assert.assertEquals("Two", StatementSwitch.toStr(2));
    Assert.assertEquals("Three", StatementSwitch.toStr(3));
    Assert.assertEquals("-", StatementSwitch.toStr(0));
    Assert.assertEquals("-", StatementSwitch.toStr(-1));
    Assert.assertEquals("-", StatementSwitch.toStr(100));
  }

  @Test
  public void q2toNumber() throws Exception {
    Assert.assertEquals(100, StatementSwitch.toNumber("A"));
    Assert.assertEquals(200, StatementSwitch.toNumber("B"));
    Assert.assertEquals(200, StatementSwitch.toNumber("C"));
    Assert.assertEquals(300, StatementSwitch.toNumber("D"));
    Assert.assertEquals(300, StatementSwitch.toNumber("E"));
    Assert.assertEquals(-1, StatementSwitch.toNumber("hoge"));
    Assert.assertEquals(-1, StatementSwitch.toNumber("a"));
  }

  @Test
  public void q3toLogical() throws Exception {
    Assert.assertEquals(123, StatementSwitch.toLogical(1));
    Assert.assertEquals(777, StatementSwitch.toLogical(2));
    Assert.assertEquals(999, StatementSwitch.toLogical(3));
    Assert.assertEquals(-1, StatementSwitch.toLogical(400));
    Assert.assertEquals(-1, StatementSwitch.toLogical(-1));
  }

  @Test
  public void q4toStr2() throws Exception {
    Assert.assertEquals("One", StatementSwitch.toStr2(1));
    Assert.assertEquals("Two", StatementSwitch.toStr2(2));
    Assert.assertEquals("Three", StatementSwitch.toStr2(3));
    Assert.assertEquals("-", StatementSwitch.toStr2(0));
    Assert.assertEquals("-", StatementSwitch.toStr2(-1));
    Assert.assertEquals("-", StatementSwitch.toStr2(100));
  }
}