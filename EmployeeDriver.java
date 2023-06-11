package com.jsp.Encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
s1.setId(22);
s1.setName("vishakha");
s1.setEmail("visha@2222");
s1.setCourse("develpment");
System.out.println(s1.getEmail());
System.out.println(s1.getName());
System.out.println(s1.getCourse());
System.out.println(s1.getId());

System.out.println("++++++++++++++++++++++++++");

Student s2=new Student();
s2.setId(22);
s2.setName("vishakha");
s2.setEmail("visha@2222");
s2.setCourse("develpment");
System.out.println(s2.getEmail());
System.out.println(s2.getName());
System.out.println(s2.getCourse());
System.out.println(s2.getId());


	}

}
