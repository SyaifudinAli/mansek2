import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


'Navigate to MOST landing page'
WebUI.callTestCase(findTestCase('pages/navigation/go to most landing page'), [:], FailureHandling.STOP_ON_FAILURE)
