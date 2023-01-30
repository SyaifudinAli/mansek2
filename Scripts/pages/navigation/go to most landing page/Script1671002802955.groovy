import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
 * Author: Muhammad Fadhlan Harits
 * Created at: 14 December 2022
 * Updated by: -
 * Updated at: -
 * Summary:
 * 1. User go to https://register.most.co.id/ or https://join.most.co.id/
*/

'Open browser'
WebUI.openBrowser("", FailureHandling.STOP_ON_FAILURE)

//WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Navigate to most landing page'
WebUI.navigateToUrl('https://dev5.most.co.id/', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.delay(3)