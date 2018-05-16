package premkupp.practice.datastructure;

public interface BasicQueueInterface<T>
{
	public void enqueue(T param);
	public T dequeue();
	public boolean search(T param);
	public T access(T param);
}
