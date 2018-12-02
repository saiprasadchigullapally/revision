import org.testng.Assert;
// To validate expected ouput is equal with actual output we go for assertion
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
