package demo12;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment2 {
public static void main(String[] args) {
ArrayList<School1> al = new ArrayList<School1>();{
	School1 s1 = new School1(103,20000,"Rajesh","tamil");
	School1 s2 = new School1(101,10000,"Malar","hindi");
	School1 s3 = new School1(102,30000,"Sudha","maths");
	al.add(s1);
	al.add(s2);
	al.add(s3);
	Collections.sort(al);
	for(School1 s : al) {
	System.out.println("Id: "+s.id+" "+"Salary: "+s.salary+"  "+"Name: "+s.name+" "+"Subject: "+s.subject);
	}
}
}
}
class School1 implements Comparable <School1>{
	int id,salary;
	String name,subject;
public School1(int id, int salary, String name, String subject) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.subject = subject;
}
@Override
public int compareTo(School1 o) {
	// TODO Auto-generated method stub
	if(salary == o.salary) {
	return 0;
}else if (salary<o.salary) {
	return 1;
}else {
	return -1;
}
}
}