package premkupp.practice.datastructure;

public class BasicQueue<T> implements BasicQueueInterface<T>
{
	private T[] data;
	private int frontPointer;
	private int endPointer;

	public BasicQueue() 
	{
		this.data = (T[]) new Object[100];
		this.frontPointer = -1;
		this.endPointer = -1;
	}
	
	public int size()
	{
		if(frontPointer==-1 && endPointer==-1) 
			return 0;
		else 
			return(endPointer - frontPointer + 1);
	}
	@Override
	public void enqueue(T paramT) 
	{
		data[++endPointer]=paramT;
		if(frontPointer==-1) frontPointer++;
	}

	@Override
	public T dequeue() 
	{
		if(endPointer==-1 && frontPointer==-1)
			return null;
		else
		{
			return data[frontPointer++];
		}
	}

	@Override
	public boolean search(T paramT) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T access(T paramT) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
