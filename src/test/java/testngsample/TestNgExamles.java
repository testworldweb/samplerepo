package testngsample;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Since webdriver tests are in src/main/java
 * they are not being executed by maven
 * This class contains sample tests for testng execution
 * on Jenkins  
 *
 */
public class TestNgExamles {

	@Test
	public void passTest()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void passFail()
	{

		Assert.assertTrue(false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
