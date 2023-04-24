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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://rmgtestingserver/domain/HRM_System/')

WebUI.setText(findTestObject('Object Repository/HRM_sf/Page_Admin Log in/Page_Admin Log in/input_HRINFORMATION_hr_email'), 
    username)

WebUI.setText(findTestObject('Object Repository/HRM_sf/Page_Admin Log in/Page_Admin Log in/input_HRINFORMATION_hr_password'), 
    password)

WebUI.selectOptionByValue(findTestObject('Object Repository/HRM_sf/Page_Admin Log in/Page_Admin Log in/select_Select Type                         _232881'), 
    type, true)

WebUI.click(findTestObject('Object Repository/HRM_sf/Page_Admin Log in/Page_Admin Log in/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/HRM_sf/Page_Admin Log in/Page_Admin  Dashboard/span_Administrator'), 
    'Administrator')

WebUI.closeBrowser()

