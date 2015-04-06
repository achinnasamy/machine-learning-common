/**
 * Copyright (c) 2014 iPro,Inc. and its affiliates. All rights reserved.
 */
package com.equator.common.constraints;

/**
 * Utilities for verifying various conditions.
 *
 * @author <a href="mailto:aravindh.chinnasamy@gmail.com">Aravindh Chinnasamy</a>
 * @version %I%, %G%
 * @since AW
 */
public final class Conditions {

	/**
	 * 
	 */
	private static final NotNullCondition<Object>     NOT_NULL_CONDITION    = new NotNullCondition<Object>();
	
	/**
     * Check to verify that the provided object is not null.
     *
     * @param object
     *            the subject of the check.
     */
	public static void checkNotNull (
											final Object object) {
		NOT_NULL_CONDITION.check(object);
	}
	
	/**
	 * Check to verify that the provided string is not empty
	 * 
	 * @param string the subject of check
	 */
	public static void checkNotEmptyString(
											final String string) {
		new NotNullCondition<String>().check(string);
		new StringNotBlankOrEmptyCondition().check(string);
	}
	
}
