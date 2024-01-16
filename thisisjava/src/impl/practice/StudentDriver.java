package thisisjava;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student1 = new Student("선남");
		student1.quizEnter();
		student1.middleExamEnter();
		student1.finalExamEnter();
		
	
	
		Student student2 = new Student("선녀");
		student2.quizEnter();
		student2.middleExamEnter();
		student2.finalExamEnter();
	
		double totalScore1 = calcTotalScore(student1);
		char grade1 =  calcGrade(totalScore1);
		double totalScore2 = calcTotalScore(student2);
		char grade2 = calcGrade(totalScore2);
		
		EnterResult(student1,totalScore1,grade1);
		EnterResult(student2,totalScore2,grade2);
	}
	
	public static double calcTotalScore(Student s) {
		return s.quiz*0.2 + s.middleExam*0.3 + s.finalExam*0.5;
		
	}
	
	public static char calcGrade(double totalScore) {
		 if (totalScore >= 90) {
	            return 'A';
	        } else if (totalScore >= 80) {
	            return 'B';
	        } else if (totalScore >= 70) {
	            return 'C';
	        } else if (totalScore >= 60) {
	            return 'D';
	        } else {
	            return 'F';
	 
	        }
	  	
	   }
	
	public static void EnterResult(Student s, double totalScore, char grade) {
		System.out.println(s.name + "의 총점은 " + totalScore + "이고 학점은" + grade + "이다");
		
	}

	}


	

