package _04Array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class StreamTest {
  @Test
  public void q1arrayStreamMap() throws Exception {
    List<Integer> res = Stream.arrayStreamMap(Arrays.asList(2, 4, 6));
    int r0 = res.get(0);
    int r1 = res.get(1);
    int r2 = res.get(2);
    Assert.assertEquals(4, r0);
    Assert.assertEquals(8, r1);
    Assert.assertEquals(12, r2);
  }

  @Test
  public void q2arrayStreamMap2() throws Exception {
    List<Integer> res = Stream.arrayStreamMap2(Arrays.asList(0, 10, 3));
    int r0 = res.get(0);
    int r1 = res.get(1);
    int r2 = res.get(2);
    Assert.assertEquals(123, r0);
    Assert.assertEquals(163, r1);
    Assert.assertEquals(135, r2);
  }

  @Test
  public void q3arrayStreamFilter() throws Exception {
    List<Integer> res = Stream.arrayStreamFilter(Arrays.asList(0, 10, 5, 120));
    Assert.assertEquals(2, res.size());
    int r0 = res.get(0);
    int r1 = res.get(1);
    Assert.assertEquals(0, r0);
    Assert.assertEquals(5, r1);
  }

  @Test
  public void q4arrayStreamFilter2() throws Exception {
    List<Integer> res = Stream.arrayStreamFilter2(Arrays.asList(1, 100, 20, 40));
    Assert.assertEquals(2, res.size());
    int r0 = res.get(0);
    int r1 = res.get(1);
    Assert.assertEquals(1, r0);
    Assert.assertEquals(20, r1);
  }

  @Test
  public void q5arrayStreamCombination() throws Exception {
    List<String> res = Stream.arrayStreamCombination(Arrays.asList(10, 25, 50, 15, 45, 60, 95));
    String s = res.stream().collect(Collectors.joining("-"));
    Assert.assertEquals("<20>-<50>-<30>-<90>", s);
  }

}