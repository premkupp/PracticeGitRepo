package practice;

public class BasicStack<X> implements BasicStackInterface<X>
{
  private X[] data;
  private int StackPointer;
  
  public BasicStack()
  {
    this.data = (X[]) new Object[1000];
    this.StackPointer = 0;
  }
  
  public X pop()
  {
    return (X)this.data[(--this.StackPointer)];
  }
  
  public void push(X newItem)
  {
    this.data[(this.StackPointer++)] = newItem;
  }
  
  public boolean contains(X x)
  {
    return false;
  }
  
  public X access(X x)
  {
    return null;
  }
}
