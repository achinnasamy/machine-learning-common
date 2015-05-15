package com.equator.common.function;

import java.util.function.Function;

import org.yaml.snakeyaml.Yaml;


public class YamlReaderFunction implements Function<String, Yaml> {

	@Override
	public Yaml apply(String yamlDocument) {
		
		System.out.println("In YamlReader Function");
		Yaml yaml = new Yaml();
		
		return yaml;
	}


}
