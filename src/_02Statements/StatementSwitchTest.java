package _02Statements;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatementSwitchTest {
  @Test
  public void q1toStr() throws Exception {
    Assert.assertEquals(StatementSwitch.toStr(1), "One");
    Assert.assertEquals(StatementSwitch.toStr(2), "Two");
    Assert.assertEquals(StatementSwitch.toStr(3), "Three");
    Assert.assertEquals(StatementSwitch.toStr(0), "-");
    Assert.assertEquals(StatementSwitch.toStr(-1), "-");
    Assert.assertEquals(StatementSwitch.toStr(100), "-");
  }

  @Test
  public void q2toNumber() throws Exception {
    Assert.assertEquals(StatementSwitch.toNumber("A"), 100);
    Assert.assertEquals(StatementSwitch.toNumber("B"), 200);
    Assert.assertEquals(StatementSwitch.toNumber("C"), 200);
    Assert.assertEquals(StatementSwitch.toNumber("D"), 300);
    Assert.assertEquals(StatementSwitch.toNumber("E"), 300);
    Assert.assertEquals(StatementSwitch.toNumber("hoge"), -1);
    Assert.assertEquals(StatementSwitch.toNumber("a"), -1);
  }

  @Test
  public void q3toLogical() throws Exception {
    Assert.assertEquals(StatementSwitch.toLogical(1), 123);
    Assert.assertEquals(StatementSwitch.toLogical(2), 777);
    Assert.assertEquals(StatementSwitch.toLogical(3), 999);
    Assert.assertEquals(StatementSwitch.toLogical(400), -1);
    Assert.assertEquals(StatementSwitch.toLogical(-1), -1);
  }

  @Test
  public void q4toStr2() throws Exception {
    Assert.assertEquals(StatementSwitch.toStr2(1), "One");
    Assert.assertEquals(StatementSwitch.toStr2(2), "Two");
    Assert.assertEquals(StatementSwitch.toStr2(3), "Three");
    Assert.assertEquals(StatementSwitch.toStr2(0), "-");
    Assert.assertEquals(StatementSwitch.toStr2(-1), "-");
    Assert.assertEquals(StatementSwitch.toStr2(100), "-");
  }
}