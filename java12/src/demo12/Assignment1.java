package demo12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
public class Assignment1 {
public static void main(String[] args) {
	HashSet <School> hs= new HashSet <School> ();
	School s1 = new School(103,"Ravi","02/03/2021","12/03/2021");
	School s2 = new School(104,"vinoth","06/03/2021","11/03/2021");
	School s3 = new School(101,"priya","01/03/2021","15/03/2021");
	hs.add(s1);
	hs.add(s2);
	hs.add(s3);
	List <School> list = new ArrayList <School>(hs);//Sorting hash set using list
	//TreeSet <School> ts = new TreeSet <School> (hs);//
	Collections.sort(list,new GivenDateComparator());
	//Collections.sort(list,new CompletionDateComparator());
 for(School s : list) {
		System.out.println("Student Id: "+s.id+" "+"Student Name: "+s.name+"  "+"Given_Date: "+s.given_date+" "+"Completion_date: "+s.Completion_date);
	}
}
}
class School {
	int id;
	String name,given_date,Completion_date;
	public School(int id, String name, String given_date, String Completion_date) {
		super();
		this.id = id;
		this.name = name;
		this.given_date = given_date;
	    this.Completion_date= Completion_date;
	}
}