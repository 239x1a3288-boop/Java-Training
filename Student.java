package day2;

public class Student {
	//Declaration of states
	String StdName,Branch;
	int RegNum;
	double Percentage;
	public static void main(String[]args) {
		Student S1=new Student();
		S1.StdName="MANIKANTA";
		S1.RegNum=123;
		S1.Branch="EEE";
		S1.Percentage=98.9;
		System.out.println("Student Name"+S1.StdName);
		System.out.println("Register Number ="+S1.RegNum);
		System.out.println("Banch ="+S1.Branch);
		System.out.println("Percentage ="+S1.Percentage);
	}

}
