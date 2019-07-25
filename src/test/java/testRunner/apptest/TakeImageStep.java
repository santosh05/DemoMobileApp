package testRunner.apptest;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import testRunner.BaseClass;



	public class TakeImageStep extends BaseClass {
		@After
		public void tearDown(Scenario scenario) {
		    if (scenario.isFailed()) {	    	
		      log.info("Scenario failed, now taking screenshot");
		      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		      scenario.embed(screenshot, "image/png");
		    }
		}
	}
