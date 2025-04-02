package OOPS;

public class P8 {
	
	public static Student getHighestScore(Student[] students) {
		
		Student student_max = new Student();
		student_max.setAvg(0);
		
		for(Student current_student : students) {
			
			if(current_student.getAvg() > student_max.getAvg()) {
				
				student_max.setAvg(current_student.getAvg());
				student_max.setName(current_student.getName());
				
			}
			
		}
		
		return student_max;
		
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Senthil",34,89,87);
		Student s2 = new Student("Guna",36,90,79);
		Student s3 = new Student("Velu",24,89,81);
		
		s1.computeAvearge();
		s2.computeAvearge();
		s3.computeAvearge();
		
		System.out.println("The Avearge marks scored by " + s1.getName() + " is " + s1.getAvg());
		System.out.println("The Avearge marks scored by " + s2.getName() + " is " + s2.getAvg());
		System.out.println("The Avearge marks scored by " + s3.getName() + " is " + s3.getAvg());
		
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		
		Student s = getHighestScore(students);
		System.out.println("With " + s.getAvg() + " , " + s.getName() + " is the highest score");
		
		
	}
	
}
