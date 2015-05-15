package com.equator.common.function;

import java.util.function.Function;

public class LocateYamlDocumentFunction implements Function<Integer, String> {

	@Override
	public String apply(Integer integer) {
		
		System.out.println(integer.toString());
		
		switch (integer.toString()) {
		case "1" :
		case "2" :
		case "3" :
		}
		
		System.out.println("You are in Before");
		return "Input to YAML";
	}

}
