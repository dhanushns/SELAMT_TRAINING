package OOPS;

public class P6 {
	
	public static Student getHighestScore(Student s1,Student s2, Student s3) {
		
		
		if(s1.getAvg() > s2.getAvg() && s1.getAvg() > s3.getAvg()) {
			return s1;
		}
		else if(s2.getAvg() > s3.getAvg()) return s2;
		else return s3;
		
		
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
	
		
		Student s = getHighestScore(s1,s2,s3);
		System.out.println("With " + s.getAvg() + " , " + s.getName() + " is the highest score");
		
		
	}

}
