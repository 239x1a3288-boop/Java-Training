package day1;

public class Stu {
	String StdName="Scott";
	int RegNum=101;
	String Branch = "CSE";
public static void main(String[] args) {
	//creating the first obj
	Stu S1=new Stu();
	System.out.println("Student Name : "+S1.StdName);
	System.out.println("Register Num : "+S1.RegNum);
	System.out.println("Branch : "+S1.Branch);
	//creating the first obj
	Stu S2=new Stu();
	//System.out.println(S2);
	System.out.println("Student Name : "+S2.StdName);
	System.out.println("Register Num : "+S2.RegNum);
	System.out.println("Branch : "+S2.Branch);	
}
}
