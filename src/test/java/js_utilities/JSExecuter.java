package js_utilities;

import test_cases.TestBase;

public class JSExecuter extends TestBase {

	public static void AddArabicLettersUsingJSUtilities(char character, String id) {
		String jsCommand = String.format("document.getElementById('%s').value= '%s'", id, character);
//		js.executeScript("document.getElementById('cpn2').value= %s;".format(null, null));
		js.executeScript(jsCommand);
	}

}
