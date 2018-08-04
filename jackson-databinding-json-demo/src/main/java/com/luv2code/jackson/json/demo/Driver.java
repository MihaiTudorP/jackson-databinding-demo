package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luv2code.jackson.json.demo.entities.Student;

public class Driver {
	private static final String STUDENT_DATA_INPUT_SAMPLE_JSON = "data/sample-full.json";

	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO
			// data/sample-*.json
			
			Student student = mapper.readValue(new File(STUDENT_DATA_INPUT_SAMPLE_JSON), Student.class);
			// print first name and last name
			
			System.out.println("First name: " + student.getFirstName());
			System.out.println("Last name: " + student.getLastName());
			System.out.println("Street: " + student.getAddress().getStreet());
			System.out.println("City: " + student.getAddress().getCity());
			
			System.out.println("Languages: ");
			for (String language: student.getLanguages()) {
				System.out.println(" - " + language);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
