package ch05;

public class SubStringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String subject = "자바 프로그래밍";
//		String str = subject.substring(3);
//		String str2 = subject.substring(0,2);
//		System.out.println(str);
//		System.out.println(str2);
//		int index = subject.indexOf("사과");
//		System.out.println(index);
//		if(index ==-1) {
//			System.out.println("자바와 관련된 결과가 없습니다.");
//		}else {System.out.println("자바와 관련된 결과가 있습니다.");
//			}
//		}
		String fruit = "사과 딸기 포도 귤";
		String[] fruitList = fruit.split(" ");
		System.out.println(fruitList[2]);
		 
				
	}
	}


