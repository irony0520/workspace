package ch12;

public class BytesToString {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String data = "자바";	
		//String data = "JAVA" //4
		
		String receive = new String(new byte[] {-20,-98,-112,-21,-80,-108});
		//String receive = new String(bytes)
 		System.out.println(receive);
		
		byte[] bytes = data.getBytes();
		
		byte[] bytes1 = data.getBytes("EUC-KR");
		System.out.println(bytes1.length); //6
		
		String receive2 = new String(bytes, "EUC-KR");
		System.out.println(receive2);
		
		String receive3 = new String(new byte[] {-64,-38,-71,-39},"EUC-KR");
		System.out.println(receive3);
		
	}

}
