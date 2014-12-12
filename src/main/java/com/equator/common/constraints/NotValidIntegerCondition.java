package com.equator.common.constraints;

import com.equator.common.constraints.annotations.NotNull;
import com.equator.common.constraints.exception.InvalidArgumentException;


public class NotValidIntegerCondition implements Condition<Integer>{
	
	public void check(@NotNull final Integer value){
    	
        if (value == null || value == 0) {
            throw new InvalidArgumentException();
        }

    }
}
