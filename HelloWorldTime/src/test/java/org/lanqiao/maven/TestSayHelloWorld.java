package org.lanqiao.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSayHelloWorld {
	@Test
  public  void testSayHWTime() {
		SayHelloWorld  shw=new SayHelloWorld();
		String result = shw.sayHWTime("morning");
		assertEquals("Hello zs,morning", result);
  }
}
