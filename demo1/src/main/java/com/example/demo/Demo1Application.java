package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
	ApplicationContext con=	   SpringApplication.run(Demo1Application.class, args);
	Student st=con.getBean(Student.class);
	Teacher tr=con.getBean(Teacher.class);
	st.setId(1);
	st.setName("bhaskar");
	st.setAddress("hyd");
	tr.setName("babu");
	tr.setSubject("maths");
System.out.println(tr.toString());
System.out.println(st.toString());
	}

}
