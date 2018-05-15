package premkupp.practice.datastructure;

public interface BasicQueueInterface<T>
{
	public void enqueue(T paramT);
	public T dequeue();
	public boolean search(T paramT);
	public T access(T paramT);
}
