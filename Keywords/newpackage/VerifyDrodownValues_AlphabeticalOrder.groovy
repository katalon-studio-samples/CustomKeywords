package newpackage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory


public class VerifyDrodownValues_AlphabeticalOrder {
	
	@Keyword
	public static void verifyOptionsInDropdownInAphabeticalOrder(TestObject objectto) {
		WebElement element = WebUiCommonHelper.findWebElement(objectto, 20);
	Select ele = new Select(element)
	List<String> expectedOptions = new ArrayList<>()
	List<String> actualOptions = new ArrayList<>()
	for (WebElement option : ele.getOptions()) {
	System.out.println("Dropdown options are: " + option.getText())
	actualOptions.add(option.getText())
	expectedOptions.add(option.getText())
	}
	Collections.sort(actualOptions)
	System.out.println("Numbers of options present in the dropdown: " + actualOptions.size())
	Assert.assertEquals(expectedOptions.toArray(), actualOptions.toArray())
	System.out.println("Yes Dropdown values are in Alphabetical order")
	
	}
}
