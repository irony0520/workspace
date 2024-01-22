package ch14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExam {

	public static void main(String[] args) {
		
		
		String[][] mails =  new String[1000][3];
		for(int i =0;i<mails.length;i++) {
			mails[i][0] = "admil@my.com"; 
			mails[i][1] = "member" + i + "@my.com"; // 해당 멤버 계정에 아래 내용의 메일을 보냄
			mails[i][2] = "신상품 입고"; //메일 내용
		}
		
		ExecutorService ex = Executors.newFixedThreadPool(5); //5= 최대스레드 개수

		for(int i =0;i<1000;i++) {
			final int idx = i;
			ex.execute(new Runnable() {
				@Override 
				public void run() {
					Thread thread =  Thread.currentThread();
					String from= mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("Thread: " + thread.getName() +content +"from: " + from + ", to: " + to + ", content: " + content);
				}
				
				
				
			});
		}
		ex.shutdown();

	}

}
