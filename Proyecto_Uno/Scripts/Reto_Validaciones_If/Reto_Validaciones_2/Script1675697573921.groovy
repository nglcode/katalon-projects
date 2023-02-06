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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('www.google.com')

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

zoomOut()

WebUI.scrollToElement(findTestObject('Reto_Validaciones/Page_DEMOQA/button_Submit'), 2)

WebUI.waitForElementClickable(findTestObject('Reto_Validaciones/Page_DEMOQA/button_Submit'), 2)

WebUI.click(findTestObject('Object Repository/Reto_Validaciones/Page_DEMOQA/button_Submit'))

nombre = WebUI.waitForElementAttributeValue(findTestObject('Reto_Validaciones/Page_DEMOQA/input_Name_firstName xpath'), 
    '0', '0', 3)

apellido = WebUI.waitForElementAttributeValue(findTestObject('Reto_Validaciones/Page_DEMOQA/input_Name_lastName xpath'), 
    '0', '0', 3)

println(nombre)

println(apellido)

if (nombre == false) {
    WebUI.setText(findTestObject('Reto_Validaciones/Page_DEMOQA/input_Name_firstName xpath'), 'Marco')
}

if (apellido == false) {
    WebUI.setText(findTestObject('Reto_Validaciones/Page_DEMOQA/input_Name_lastName xpath'), 'Polo')
}

WebUI.closeBrowser()

void zoomOut() {
    Robot robot = new Robot()

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_MINUS)

    robot.keyRelease(KeyEvent.VK_CONTROL)

    robot.keyRelease(KeyEvent.VK_MINUS)
}

