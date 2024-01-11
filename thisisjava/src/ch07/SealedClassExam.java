package ch07;

public class SealedClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People people = new People();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		people.work();
		e.work();
		m.work();
		d.work();
		
	}

}
