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

WebUI.navigateToUrl('https://www.watchyesnetwork.com/')

WebUI.click(findTestObject('Object Repository/MVPD login/Page_Watch  YES Network/button_LOGIN WITH TV PROVIDER'))

WebUI.click(findTestObject('Object Repository/MVPD login/Page_Watch  YES Network/div_Select your Television Service Provider_8b0fc0'))

WebUI.setText(findTestObject('Object Repository/MVPD login/Page_Optimum Login Service/input_Optimum ID_j_username'), 'research48')

WebUI.setEncryptedText(findTestObject('Object Repository/MVPD login/Page_Optimum Login Service/input_Password_j_password'), 
    'aywt9+lOzPb+WuyDJkmGLw==')

WebUI.click(findTestObject('Object Repository/MVPD login/Page_Optimum Login Service/button_SIGN IN'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MVPD login/Page_Watch  YES Network/img_On Now_mvpd-logo mr-4 mb-1'), 
    0)

WebUI.click(findTestObject('Object Repository/MVPD login/Page_Watch  YES Network/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MVPD login/Page_Watch  YES Network/div_Manage YES Profile'), 
    0)

WebUI.click(findTestObject('Object Repository/MVPD login/Page_Watch  YES Network/div_Log Out'))

WebUI.closeBrowser()

