package ch07;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal animal = new Animal(); 추상 클래스 구현불가능
		
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();

	}
//
//	public static void animalSound(Animal animal) {
//		animal.sound();
//	} //무조건 구현됐다는 전제하에 쓰여질수 있는 메소드
	
}
