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

WebUI.navigateToUrl('https://www.annauniv.edu/')

WebUI.click(findTestObject('Object Repository/Anna University/Page_Anna University, Chennai/img'))

WebUI.switchToWindowTitle('Anna University, Chennai')

WebUI.click(findTestObject('Object Repository/Anna University/Page_Anna University, Chennai/img'))

WebUI.switchToWindowTitle('Sign in to Outlook')

WebUI.setText(findTestObject('Object Repository/Anna University/Page_Sign in to Outlook/input_to continue to Outlook_loginfmt'), 
    'jothilakshmi13007@gmail.com')

WebUI.click(findTestObject('Object Repository/Anna University/Page_Sign in to Outlook/input_Create one_idSIButton9'))

WebUI.switchToWindowTitle('Anna University, Chennai')

WebUI.click(findTestObject('Object Repository/Anna University/Page_Anna University, Chennai/span_usernametf.annauniv.edu'))

WebUI.click(findTestObject('Object Repository/Anna University/Page_Anna University, Chennai/span_usernametf.annauniv.edu'))

WebUI.click(findTestObject('Object Repository/Anna University/Page_Anna University, Chennai/button_Email Service of Anna University_nav_d744f8'))

WebUI.click(findTestObject('Object Repository/Anna University/Page_Anna University, Chennai/a_Home'))

WebUI.click(findTestObject('Object Repository/Anna University/Page_Anna University, Chennai/span_UG Admission 2024-25'))

WebUI.switchToWindowTitle('Admissions')

WebUI.click(findTestObject('Object Repository/Anna University/Page_Admissions/a_B.EB.Tech'))

WebUI.click(findTestObject('Object Repository/Anna University/Page_Admissions/a_OTHER STATE'))

WebUI.closeBrowser()

