import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
 * Author: Muhammad Fadhlan Harits
 * Created at: 14 December 2022
 * Updated by: -
 * Updated at: -
 * Summary:
 * 1. Verify button register is visible
 * 2. Verify button continue register is visible
*/


'Verify button register is visible'
WebUI.verifyElementVisible(findTestObject('landing page/button_register'), FailureHandling.CONTINUE_ON_FAILURE)

'Verify button continue register is visible'
WebUI.verifyElementVisible(findTestObject('landing page/button_continue_register'), FailureHandling.CONTINUE_ON_FAILURE)
