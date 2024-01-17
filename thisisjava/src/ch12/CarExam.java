package ch12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CarExam {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Class c = Car.class;
		
		Car car = new Car();
		Class c1 = car.getClass();
		
		Class c2 =null;
		
		try {
			c2 = Class.forName("ch12.Car");
		}
		catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않습니다");
		}
		
		System.out.println(c.getPackage());
		System.out.println(c1.getPackage());
		System.out.println(c2.getPackage());
		
		
		System.out.println(c.getSimpleName());
		System.out.println(c1.getName());
		
		Field[] fields = c2.getDeclaredFields();
		for(Field f:fields) {
			System.out.print("필드 수 : " +f.getType()); //문자열
			System.out.println(" " + f.getName()); //model, owner (필드 2개)
		}
		
		Constructor[] constructors = c2.getConstructors();
		System.out.println("생성자 수 : " + constructors.length);
		
		for(Constructor cc : constructors) {
			System.out.print(cc.getName());
			Class[] types = cc.getParameterTypes();
			for(Class t:types) {
				System.out.print(" " + t);  //string 타입 0개, 2개 , 1개 
			}
			System.out.println();
		}
	
		Method[] methods = c2.getDeclaredMethods(); //선언된 메소드
		System.out.println("메서드 수: " + methods.length);
		for(Method m: methods) {
			System.out.print(m.getName() + ",");
		}
		
		try {
		Method methods2 = c2.getDeclaredMethod("getModel"); 
			System.out.println(methods2.getName());
		}catch(NoSuchMethodException e) {
			System.out.println("해당 메소드가 존재하지 않습니다.");
		}
	}
	
	

}
