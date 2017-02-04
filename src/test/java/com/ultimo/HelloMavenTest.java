package com.ultimo;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase{

	@Override
	protected String getConfigFile() {
		return "jenkinproject.xml";
	}
	
	@Test
	public void mavenFlowReturns() throws Exception{
		runFlowAndExpect("jenkinFlow", "Hello World");
	}
}
