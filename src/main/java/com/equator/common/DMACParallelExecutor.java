package com.equator.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;

import com.equator.common.constraints.Conditions;
import com.equator.common.constraints.annotations.NotNull;
import com.equator.common.task.DMACTask;


public class DMACParallelExecutor {

	
	public static <X, Y> List<Y> transform (@NotNull final List<X> inputList,
			 @NotNull final Function<X, Y> function) 

	{
	
			Conditions.checkNotNull (inputList);
			Conditions.checkNotNull (function);
			
			if (inputList.isEmpty ()) {
				return Collections.emptyList();
			}
		
			final ForkJoinPool                  forkJoinExecutor = new ForkJoinPool (Runtime.getRuntime().availableProcessors());
			final Object[]                      destination      = new Object[inputList.size ()];
			
			final DMACTask<X, Y> action         = new DMACTask<> (inputList,
			                                              		  destination,
			                                              		  function,
			                                              		  0,
			                                              		  inputList.size () - 1);
			
			forkJoinExecutor.invoke (action);
			
			final List<Y> resultList = new ArrayList (destination.length);
			
			for (final Object o : destination) {
			@SuppressWarnings ("unchecked") final Y y = (Y) o;			
			resultList.add (y);
		}
	
		return resultList;
	
	}
	
	
	public static void main(String[] args) {
		
		 List<String> userInputList = new ArrayList<String>();
		 userInputList.add("One");
		 userInputList.add("Two");
		 userInputList.add("Three");
		 userInputList.add("Four");
		 userInputList.add("Five");
		 userInputList.add("Six");
		 userInputList.add("Seven");
		 userInputList.add("Eight");
		 userInputList.add("Nine");
		 userInputList.add("Ten");
		 userInputList.add("Eleven");
		 userInputList.add("Twelve");
		 userInputList.add("Thirteen");
		 userInputList.add("Fourteen");
		 userInputList.add("Fifteen");
		 
		 
		 
		 List<String> outputList = DMACParallelExecutor.transform(userInputList, new UserFunction());
		
		 outputList.forEach((z) -> System.out.println(z));
	}
			 
}


class UserFunction implements Function<String, String> {

	@Override
	public String apply(String inputString) {
		return inputString + " - appended string after function transformation ";
	}
	
}

