package com.equator.common.function;

import java.util.function.Predicate;

public class IsItAValidYamlDocument implements Predicate<String> {

	@Override
	public boolean test(String yamlDocument) {
		
		return true;
	}

}
