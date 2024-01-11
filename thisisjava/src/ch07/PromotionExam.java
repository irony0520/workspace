package ch07;

class F {}

class G extends F{}

class C extends F{}

class D extends G{}

class E extends C{}
//    -b d
//a  |
//    -c e

public class PromotionExam {

	public static void main(String[] args) {
		G g = new G();
		C c = new C();
		D d = new D();
		E e = new E();
		
		F fg = g;
		F fc = c;
		F fd = d;
		F fe = e;
		
		G gd = g ;
		C ce = c;
		
		//B be = e;
		//C cd = d;
		
	}
	
}
