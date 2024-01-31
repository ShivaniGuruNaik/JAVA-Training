package com.tnsif.interfaces;
import java.util.Scanner;  
public class main {

	public static void main(String[] args) {
		Student st= new Student();
		Scanner obj = new Scanner(System.in);
		st.id= obj.nextInt();
		System.out.println("Student Registered " +st);
	}

}