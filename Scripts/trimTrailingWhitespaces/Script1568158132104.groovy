import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.util.regex.Pattern
import java.util.regex.Matcher

def fixture = '  　あ 　い　 '

def trimTrailingWhitespaces(String s) {
	char[] chars = s.toCharArray()
	StringBuilder sb = new StringBuilder()
	boolean inBody = false
	Pattern p = Pattern.compile("\\h")
	for (int i = chars.length - 1; i >= 0; i--) {
		String ch = String.valueOf(chars[i])
		if (inBody == false) {
			Matcher m = p.matcher(ch) 
			if (m.matches()) {
				// ignore the trailing whitespace character 
			} else {
				sb.append(ch)
				inBody = true
			}
		} else {
			sb.append(ch)
		}
	}
	return sb.reverse().toString()
}

def expected = 'あ 　い'
def actual = trimTrailingWhitespaces(fixture)
System.out.println("expected=\'${expected}\' actual=\'${actual}\'")
assert expected == actual