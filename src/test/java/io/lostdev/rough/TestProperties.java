package io.lostdev.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		Properties config = new Properties();
		Properties OR = new Properties();
		
		try {
			FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			try {
				config.load(inputStream);
				OR.load(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println((config.getProperty("browser")));
		System.out.println((OR.getProperty("browser")));
	}
}
