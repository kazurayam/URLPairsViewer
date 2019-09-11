import com.kazurayam.StringUtils

/**
 * runStringUtils
 */
def fixture = '  　あ 　い　 '
def expected = 'あ 　い'
def actual = StringUtils.trimWhitespaces(fixture)
System.out.println("fixture=\'${fixture}\' expected=\'${expected}\' actual=\'${actual}\'")
assert expected == actual