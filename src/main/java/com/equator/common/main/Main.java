package com.equator.common.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("Dhara");
		listOfStrings.add("Bose");
		listOfStrings.add("Che");
		
		List<String> filteredListOfStrings = listOfStrings
											
											.parallelStream()
											
											.filter((z) -> z.startsWith("B"))
											.collect(Collectors.toList());
			
			
		filteredListOfStrings.forEach((z) -> System.out.println(z));
		
	}

}
