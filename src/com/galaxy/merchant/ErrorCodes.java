/**
 * 
 */
package com.galaxy.merchant;

/**
 * <p>This enum defines the error codes that are produced during the application runtime.<br>
 * These code are used by the Error class to generate custom error messages.<br>
 * SUCCESS_OK is used in case if no error is generated
 * <br>
 * @author Saket kumar
 *
 */
public enum ErrorCodes {

	/**
	 * This code specifies that there is no error
	 */
	SUCCESS_OK,
	
	/**
	 * This code specifies that there is input error. Input provided is empty
	 */
	NO_INPUT,
	
	
	/**
	 * This code specifies that it does not match with any conversation line type specified in paragraph conversationType enum
	 */
	INVALID,
	
	/**
	 * This error code specifies that roman number have some illegal characters 
	 */
	INVALID_ROMAN_CHARACTER,
	
	/**
	 * This error code specifies that roman literal is in invalid format.
	 */
	INVALID_ROMAN_STRING,
	
	/**
	 * This code specifies that a line has been identified as different type instead of its actual type
	 */
	INCORRECT_LINE_TYPE,
	
	
	NO_IDEA
}
