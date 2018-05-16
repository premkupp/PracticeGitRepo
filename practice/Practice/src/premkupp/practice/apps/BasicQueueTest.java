package premkupp.practice.apps;

import premkupp.practice.datastructure.*;

public class BasicQueueTest {

	BasicQueue<String> q;
	public BasicQueueTest()
	{
		q = new BasicQueue<String>();
	}
	public void fill()
	{
		q.enqueue("One");
		q.enqueue("Two");
		q.enqueue("Three");
		q.enqueue("Four");
		q.enqueue("Five");
	}
	public static void main(String[] args) 
	{
		BasicQueueTest qt = new BasicQueueTest();
		qt.fill();
		System.out.println(qt.q.size());
		System.out.println(qt.q.dequeue());
		System.out.println(qt.q.size());
		System.out.println(qt.q.dequeue());
		System.out.println(qt.q.size());
		System.out.println(qt.q.dequeue());
		System.out.println(qt.q.size());
		
	}

}
