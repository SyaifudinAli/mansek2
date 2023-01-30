import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
 * Author: Muhammad Fadhlan Harits
 * Created at: 14 December 2022
 * Updated by: -
 * Updated at: -
 * Summary: 
 * 1. Buka Aplikasi https://register.most.co.id/ atau https://join.most.co.id/
*/

'Navigate to MOST landing page'
WebUI.callTestCase(findTestCase('pages/navigation/go to most landing page'), [:], FailureHandling.STOP_ON_FAILURE)

'Assert user is directed to landing page'
WebUI.callTestCase(findTestCase('OAO/assertion/general/assert user is in landing page'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('landing page/button_register'), FailureHandling.STOP_ON_FAILURE)
