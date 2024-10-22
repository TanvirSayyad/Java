package queueInterface;

import java.util.ArrayDeque;

public class ADeque {

	public static void main(String[] args) {

		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.offer(10);
		dq.offer(20);
		dq.addFirst(1);// two side insertion deletion
		dq.addLast(2);

		System.out.println(dq);
//	Output[1, 10, 20, 2]
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());


	}

}
