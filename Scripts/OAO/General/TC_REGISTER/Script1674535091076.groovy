import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
 * Author: Muhammad Fadhlan Harits
 * Created at: 14 December 2022
 * Updated by: -
 * Updated at: -
 * Summary:
 * 1. Buka Aplikasi https://register.most.co.id/ atau https://join.most.co.id/
 * 2. Pilih button Daftar Baru
 */

if(individualRun) {
	'Navigate to MOST landing page'
	WebUI.callTestCase(findTestCase('pages/navigation/go to most landing page'), [:], FailureHandling.STOP_ON_FAILURE)
}

'Click register button'
WebUI.callTestCase(findTestCase('pages/landing page/click on register button'), [:], FailureHandling.STOP_ON_FAILURE)

'Assert user is directed to landing page'
WebUI.callTestCase(findTestCase('OAO/assertion/register page/assert user is in registration landing page'), [:], FailureHandling.STOP_ON_FAILURE)