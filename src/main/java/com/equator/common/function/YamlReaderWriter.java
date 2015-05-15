package com.equator.common.function;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.yaml.snakeyaml.Yaml;

public class YamlReaderWriter {

	public void read(String filePath) {
		
		
//		try {
//			BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
//			bufferedReader.read();
//			bufferedReader.lines();
//		} catch (IOException e) {
//			System.out.println("exce  - " + e.getMessage());
//		}
		
		
		
		File file = new File("");		
		
		Function<String, Yaml> function = new YamlReaderFunction();
	    
		
		LocateYamlDocumentFunction bf = new LocateYamlDocumentFunction();
		
		
		Function<Integer, Yaml> function1 = function.compose(bf);
	   
		
		Function<Integer, Double> function2 = function1.andThen(new AfterFunction());
		
	    //BeforeFunction ee = BeforeFunction::new;
	    
	    function2.apply(new Integer("2"));

		System.out.println("Finally ");
		
		
		
	}
	
	
	public static void main(String[] args) {
		new YamlReaderWriter().read("");
	}
}
