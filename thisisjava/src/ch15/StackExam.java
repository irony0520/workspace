package ch15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Coin> stack = new Stack<>();
		stack.push(new Coin(100));
		stack.push(new Coin(50));
		stack.push(new Coin(500));
		stack.push(new Coin(10));
		stack.peek();
		while(!stack.isEmpty()) {
			Coin coin = stack.pop();
			System.out.println(coin.getValue());
		}	
		
		Queue<Coin> q = new LinkedList<>();
		
		q.offer(new Coin(100));
		q.offer(new Coin(50));
		q.offer(new Coin(500));
		q.offer(new Coin(10));
		q.peek(); //가장 위에 있는값 꺼내진 않고 확인
		
		System.out.println();
		
		while((!q.isEmpty())) {
			Coin coin = q.poll();
			System.out.println(coin.getValue());
		}
	}

	
	
}
