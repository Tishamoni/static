package OOP;

public class Nstudent {

	public static void main(String[] args) {
		Student s1=new Student("Naz",192,2.7);
		s1.StudentInfo();
		Student s2=new Student("moon",193,3.7);
		s2.StudentInfo();
		Student s3=new Student("Nahar",201,2.5);
		s3.StudentInfo();
		Student s4=new Student("moni",211,3.00);
		s4.StudentInfo();
		
		System.out.println(s1.counter);
		//System.out.println(s2.counter);
		//System.out.println(s3.counter);
		//System.out.println(s4.counter);

	}

}
