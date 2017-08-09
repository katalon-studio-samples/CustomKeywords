package newpackage

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper

public class VerifyExpectedAndActualOptionsInDropdown {
	@Keyword
	public static void VerifyExpectedAndActual(TestObject objectto, List<String> listOfOptions) {
		try {
			WebElement element = WebUiCommonHelper.findWebElement(objectto, 20);
			Select ele = new Select(element);
			List<String> expectedOptions = listOfOptions;
			List<String> actualOptions = new ArrayList<String>();
			for (WebElement option : ele.getOptions()) {
				
				actualOptions.add(option.getText());
			}
			Collections.sort(actualOptions)
			Collections.sort(expectedOptions)
			Assert.assertEquals(expectedOptions.toArray(), actualOptions.toArray());
		} catch (Exception e) {
			
			Assert.fail(e.getMessage());
		}
	}

}