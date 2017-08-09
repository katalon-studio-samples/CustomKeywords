import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Invoke Browser and Navigate to Demo Application'
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_Application)

'Wait till the page load'
WebUI.waitForPageLoad(15)

'Enter the value of username (From Internal Test Data)'
WebUI.setText(findTestObject('Login Page of Demo Application/input_username'), 'John Doe')

'Enter the value of password (From Internal Test Data)'
WebUI.setText(findTestObject('Login Page of Demo Application/input_password'), 'ThisIsNotAPassword')

'Click on Login Button\\r\\n'
WebUI.click(findTestObject('Login Page of Demo Application/button_Login'))

'Wait till the page load'
WebUI.waitForPageLoad(15)

'Verifying the dropdown with expected and actual values\\r\\n'
CustomKeywords.'newpackage.VerifyExpectedAndActualOptionsInDropdown.VerifyExpectedAndActual'(findTestObject('Make Appointment Page/Dropdown_Facility'), 
    ['Seoul CURA Healthcare Center', 'Hongkong CURA Healthcare Center', 'Tokyo CURA Healthcare Center'])

'Verify whether the values in the dropdown are in Alphabetical Order using Custom Keyword'
CustomKeywords.'newpackage.VerifyDrodownValues_AlphabeticalOrder.verifyOptionsInDropdownInAphabeticalOrder'(findTestObject(
        'Make Appointment Page/Dropdown_Facility'))

