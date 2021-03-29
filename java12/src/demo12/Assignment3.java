package demo12;
import java.util.ArrayList;
import java.util.Collections;
public class Assignment3 {
public static void main(String[] args) {
	ArrayList  <Schoolfee> al = new ArrayList <Schoolfee>();
	Schoolfee sf1 = new Schoolfee(103,"ram",Schoolfee.Status.FEE_NOT_PAID);
	Schoolfee sf2 = new Schoolfee(101,"sam",Schoolfee.Status.FEE_PAID);
	Schoolfee sf3 = new Schoolfee(102,"anu",Schoolfee.Status.FEE_PENDING);
al.add(sf1);
al.add(sf2);
al.add(sf3);
//Collections.sort(al);
for(Schoolfee s : al) {
	System.out.println("Id: "+s.id+" "+"Name: "+s.name+" "+"Status: "+s.status);
}
}
}
class Schoolfee{
	int id;
	String name;
	Status status;
	enum Status{
		FEE_PAID,FEE_NOT_PAID,FEE_PENDING
	}
	public Schoolfee(int id, String name, Status status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
}