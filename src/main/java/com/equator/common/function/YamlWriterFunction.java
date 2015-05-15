package com.equator.common.function;

import java.util.function.Function;

import org.yaml.snakeyaml.Yaml;

public class YamlWriterFunction implements Function<Yaml, Boolean> {

	@Override
	public Boolean apply(Yaml t) {
		
		return Boolean.TRUE;
	}

}
