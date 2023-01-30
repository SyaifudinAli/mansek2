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
import javax.swing.JFrame
import javax.swing.JOptionPane
import java.util.Scanner;

/*
 * Author: Muhammad Fadhlan Harits
 * Created at: 14 December 2022
 * Updated by: -
 * Updated at: -
 * Summary:
 * 1. Buka Aplikasi https://register.most.co.id/ atau https://join.most.co.id/
 * 2. Pilih button Daftar Baru
 * 3. Kosongkan kolom Email
 * 4. Masukkan valid Password
 * 5. Masukkan Confirm Password
 * 6. Masukkan Nomor Ponsel
 * 7. Klik Check Box yang tersedia
 * 8. Klik Selanjutnya
 */

if(individualRun) {
	'Navigate to MOST landing page'
	WebUI.callTestCase(findTestCase('pages/navigation/go to most landing page'), [:], FailureHandling.STOP_ON_FAILURE)

	'Click register button'
	WebUI.callTestCase(findTestCase('pages/landing page/click on register button'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.setText(findTestObject('register page/page 1/input_email'), 'testttotppp01@dispostable.com', FailureHandling.STOP_ON_FAILURE)


WebUI.setText(findTestObject('register page/page 1/input_phone'), '81311451035', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register page/page 1/input_password'), 'Test01!', FailureHandling.STOP_ON_FAILURE)

'Click on register button'
WebUI.click(findTestObject('register page/page 1/input_checkbox_1'), FailureHandling.STOP_ON_FAILURE)

'Click on register button'
WebUI.click(findTestObject('register page/page 1/input_checkbox_2'), FailureHandling.STOP_ON_FAILURE)

'Click on register button'
WebUI.click(findTestObject('register page/page 1/button_submit'), FailureHandling.STOP_ON_FAILURE)

Scanner myObj = new Scanner(System.in)

println("Enter otp:");

String otp = myObj.nextLine()

WebUI.delay(2)


WebUI.setText(findTestObject('register page/otp/input_first_number'), otp[0], FailureHandling.STOP_ON_FAILURE)


WebUI.setText(findTestObject('register page/otp/input_second_number'), otp[1], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register page/otp/input_third_number'), otp[2], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('register page/otp/input_fourth_number'), otp[3], FailureHandling.STOP_ON_FAILURE)