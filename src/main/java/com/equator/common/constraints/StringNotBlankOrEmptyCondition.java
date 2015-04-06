
package com.equator.common.constraints;

import com.equator.common.constraints.annotations.NotNull;
import com.equator.common.constraints.exception.InvalidArgumentException;



/**
 * 
 * Condition to check if a string is empty.
 *
 * @author Aravindh Chinnasamy
 * @version %I%, %G%
 * @since AW
 */
public class StringNotBlankOrEmptyCondition implements Condition<String>{

	//@Override
	public void check(@NotNull final String string) {
		
		if (string.trim().isEmpty()) {
			throw new InvalidArgumentException("argument_string_is_empty");
		}
		
	}

}
