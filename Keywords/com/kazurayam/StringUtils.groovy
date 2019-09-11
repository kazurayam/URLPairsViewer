package com.kazurayam

import java.util.regex.Matcher
import java.util.regex.Pattern

public class StringUtils {
	
	private StringUtils() {}
	
	static String trimLeadingWhitespaces(String s) {
		char[] chars = s.toCharArray()
		StringBuilder sb = new StringBuilder()
		boolean inBody = false
		Pattern p = Pattern.compile("\\h")
		for (int i = 0; i < chars.length; i++) {
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
		return sb.toString()
	}
	
	static String trimTrailingWhitespaces(String s) {
		StringBuilder sb = new StringBuilder(s)
		String reversed = sb.reverse().toString()
		String trimmed = trimLeadingWhitespaces(reversed)
		StringBuilder sb2 = new StringBuilder(trimmed)
		return sb2.reverse().toString()
	}
	
	static String trimWhitespaces(String s) {
		return trimTrailingWhitespaces(trimLeadingWhitespaces(s))
	}
	
}
