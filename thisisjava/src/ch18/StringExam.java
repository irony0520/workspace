package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) throws Exception {
		Scanner scanner  = new Scanner(System.in);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		System.out.println(str);
	}

}
