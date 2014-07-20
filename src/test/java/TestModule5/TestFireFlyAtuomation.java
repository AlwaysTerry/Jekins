package TestModule5;

import org.testng.annotations.Test;

import SoapUITest.MyWebServiceOne;

public class TestFireFlyAtuomation {

	@Test
	public void test1(){
		MyWebServiceOne a = new MyWebServiceOne();
		a.simpleWebService();
	}
}
