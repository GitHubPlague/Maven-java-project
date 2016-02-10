package by.pankova.maven;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
  
  private SuperMath sm = new SuperMath();
  
  @Test
  public void testPow() {
    Assert.assertEquals(9, sm.pow(3));
  }
  
}