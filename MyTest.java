import org.testng.Assert;

public class MyTest {

	
	@Test
	public void Test1() {
		
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void Test2() {
		
		Assert.assertEquals(false, true);
	}
	
}
