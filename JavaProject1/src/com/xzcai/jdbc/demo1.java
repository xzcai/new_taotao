package com.xzcai.jdbc;

import org.junit.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class demo1 {
	
	static {
	   try {
		FileInputStream inputStream = new FileInputStream("./src/db.properties");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Test
	public void say() {
		
	}
}
