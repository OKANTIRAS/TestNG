import baseTest.Hooks;
import listeners.ExtentReportListener;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentReportListener.class)
public class HomePageTest extends Hooks {

	@Test
	public void test() {
		ExtentReportListener.getTest().info("");




	}

}
