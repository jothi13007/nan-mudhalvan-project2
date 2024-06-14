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

WebUI.navigateToUrl('https://www.google.com/')

WebUI.click(findTestObject('Object Repository/gmail/Page_Google/a_Gmail'))

WebUI.click(findTestObject('Object Repository/gmail/Page_Gmail Private and secure email at no c_d3ebd8/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/gmail/Page_Gmail/input_to continue to Gmail_identifier'), 'jothilakshmi13007')

WebUI.click(findTestObject('Object Repository/gmail/Page_Gmail/div_Learn more about using Guest mode_VfPpk_8ca253'))

WebUI.setEncryptedText(findTestObject('Object Repository/gmail/Page_Gmail/input_Too many failed attempts_Passwd'), 'B7/jK/HkOOKJQbh0vSAIEw==')

WebUI.click(findTestObject('Object Repository/gmail/Page_Gmail/span_Next'))

WebUI.click(findTestObject('Object Repository/gmail/Page_Google Account/span_Not now'))

WebUI.click(findTestObject('Object Repository/gmail/Page_Inbox (1) - jothilakshmi13007gmail.com_a93ea1/div_Inbox1'))

WebUI.click(findTestObject('Object Repository/gmail/Page_Inbox (1) - jothilakshmi13007gmail.com_a93ea1/span_Katalon Team'))

WebUI.closeBrowser()

