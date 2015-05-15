package com.equator.common.function;

import java.util.function.Function;

import org.yaml.snakeyaml.Yaml;

public class AfterFunction implements Function<Yaml, Double> {

	@Override
	public Double apply(Yaml t) {
		System.out.println("Inside the after function");
		return null;
	}

}
