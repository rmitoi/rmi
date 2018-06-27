package gas;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	private String name;
	
	@Parameters(value="testParam")
	@BeforeClass
	protected void init(String name) {
		setName(name);
		System.out.println("Initialized name");		
	}
	
	@AfterClass
	protected void cleanup() {
		setName(null);
		System.out.println("Cleanup");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
