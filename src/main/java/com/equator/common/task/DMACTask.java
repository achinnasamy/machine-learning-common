package com.equator.common.task;

import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

import com.equator.common.constraints.Conditions;
import com.equator.common.constraints.annotations.NotNull;
import java.util.function.Function;

public class DMACTask<X, Y> extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID 		= 1L;

	private static final int  MINIMUM_THRESHOLD 	= 10;
	
	private final Object[]                 			destination;
	private final int                      			end;
	private final transient  Function<X, Y> 		function;
	
	@NotNull
	private final List<X>                  			list;
	private final int                      			start;
	
	
	/**
	* @param list
	* @param destination
	* @param function
	* @param start
	* @param end
	*/
	public DMACTask (@NotNull final List<X> list,
	                            @NotNull final Object[] destination,
	                            @NotNull final Function<X, Y> function,
	                            final int start,
	                            final int end) {
	
	super ();
	
		Conditions.checkNotNull (list);
		Conditions.checkNotNull (destination);
		Conditions.checkNotNull (function);
		
		this.list        = list;
		this.start       = start;
		this.end         = end;
		this.destination = destination;
		this.function    = function;
	
	}
	
	
	@Override
	protected void compute () {
	
		final int bracketSize = (this.end - this.start);
		
		if (bracketSize < MINIMUM_THRESHOLD) {
		    this.computeFully ();
		} else {
			
			System.out.println(" $$$$$$$$$$$$$$ ");
		    final int                           middle        = this.start + (bracketSize / 2);
		    
		    final DMACTask<X, Y> firstSubtask  = new DMACTask<> (this.list,
		                                                         this.destination,
		                                                         this.function,
		                                                         this.start,
		                                                         middle);
		    
		    final DMACTask<X, Y> secondSubtask = new DMACTask<> (this.list,
		                                                         this.destination,
		                                                         this.function,
		                                                         middle + 1,
		                                                         this.end);
		
		    ForkJoinTask.invokeAll (firstSubtask,
		                            secondSubtask);
	
		}
	
	}
	
	/**
	* Do the computation directly.
	*/
	private void computeFully () {
	
		for (int i = this.start; i <= this.end; i++) {
		    final Y result = this.function.apply (this.list.get (i));
		
		    this.destination[i] = result;
		}
	}

}
