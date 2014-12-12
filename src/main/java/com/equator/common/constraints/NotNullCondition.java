package com.equator.common.constraints;


import com.equator.common.constraints.exception.NullArgumentException;



public class NotNullCondition<T>  implements Condition<T>{

    public void check (T object) {

        if (object == null) {
            throw new NullArgumentException();
        }

    }
}
