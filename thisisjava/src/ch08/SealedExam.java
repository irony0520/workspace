package ch08;

public class SealedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ImplClass impl = new ImplClass();
		
		InterfaceA ia = impl;
		impl.methodA();
						
		InterfaceB ib = impl;
		impl.methodA();
		impl.methodB();		
		
		InterfaceC ic = impl;
						
		impl.methodA();
		impl.methodB();
		impl.methodC();
	}

}
