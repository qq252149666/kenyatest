package com.kenya.until;



public class StringUtil {

	public static boolean isEmpty( String content ) {
		return content == null || "".equals(content);
	}
	
	public static boolean isNotEmpty( String content ) {
		return !isEmpty(content);
	}
}
