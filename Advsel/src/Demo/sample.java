package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample 
{

	@Test
	public void test1()
	{
		Reporter.log("Hello",true);
	}
	@Test
	public void test2()

	{
		Reporter.log("Bye",true);

	}

}
