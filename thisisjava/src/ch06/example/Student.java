package ch06.example;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public Student() {
		
	}
	
	Student (String name, int ban, int no, int kor, int eng, int math) {
			this.name = name;
			this.ban = ban;
			this.no= no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}

	int getTotal() {
		return kor + eng + math;
		
	}
	
	float getAverage() {
		return (float)(kor +eng + math)/3;
	}
	
	String info() {
		
		return this.name + this.ban + "," + this.no + "," + 
		this.kor + "," + this.eng + "," + this.math + "," + (kor + eng + math)
		+ "," + (float)(kor +eng + math)/3;
		
		}
	
}
//+ this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math;


 	



//(Math.round((kor +eng + math)/3)*100)/100;
//System.out.println(this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math);