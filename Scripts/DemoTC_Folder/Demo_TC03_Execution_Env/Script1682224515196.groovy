import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//To Open the browser
WebUI.openBrowser('')

//To navigate to the page Url
WebUI.navigateToUrl(GlobalVariable.URL)

//To find the object and send the String to it
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), GlobalVariable.USERNAME)

//To find the object and send the Encrypted String to it
WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), GlobalVariable.PASSWORD)

//To click on the Sign In button
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

//To verify the text in the page
WebUI.verifyTextPresent('Admin', false)

//To close the browser
WebUI.closeBrowser()

