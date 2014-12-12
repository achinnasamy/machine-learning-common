package com.equator.common.constraints;



import com.equator.common.constraints.annotations.NotNull;
import com.equator.common.constraints.exception.InvalidArgumentException;


public class NotEmptyButNullCondition implements Condition<String>{
	
    public void check(@NotNull final String value){
    	
        if (value != null && value.trim().isEmpty()) {
            throw new InvalidArgumentException();
        }

    }

}
