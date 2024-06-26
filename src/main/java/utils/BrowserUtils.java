package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

	public static void scrollDownWithPageDown() {
		Actions actions = new Actions(Driver.getDriver());
		actions.keyDown(Keys.PAGE_DOWN).release().build().perform();
		wait(1);
	}

	public static void scrollUpWithPageUp() {
		Actions actions = new Actions(Driver.getDriver());
		actions.keyDown(Keys.PAGE_UP).release().build().perform();
		wait(1);
	}

	public static void wait(int timeout) {
		try {
			Thread.sleep(timeout * 1000L);
		}
		catch (InterruptedException e) {
			throw new RuntimeException();
		}
	}

}
