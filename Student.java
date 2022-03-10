package OOP;

public class Student {
       String name;
       int id;
       double cgpa;
       
       static int counter=0;
       Student(String name,int id,double cgpa){
    	   this.name=name;
    	   this.id=id;
    	   this.cgpa=cgpa;
    	   
    	   counter++;
    	   
       }
       
       void StudentInfo() {
			System.out.println("Name: "+name);
			System.out.println("Id: "+id);
			System.out.println("CGPA: "+cgpa);
		}
		
}
