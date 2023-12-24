package com.questionno1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class ProjectDeserializer {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws IOException, ClassNotFoundException {

		Map<Project, ArrayList<Employee>>obj=null;
		String fileName="C:\\shyam\\nim6374.txt";
		
			FileInputStream fis =new FileInputStream(fileName);
			ObjectInputStream ous =new ObjectInputStream(fis);
			obj=(Map<Project, ArrayList<Employee>>)ous.readObject();
			ous.close();
			fis.close();
			
			for(Entry<Project, ArrayList<Employee>> temp:obj.entrySet()) {
				System.out.println("The project");
				System.out.println(temp.getKey()+" Has the following employees");
				System.out.println("Employees........");
				for(Employee t:temp.getValue()) {
					System.out.println(t);
				}
				
			}
			
			


		

	}
}
