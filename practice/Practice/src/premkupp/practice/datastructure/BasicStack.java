package premkupp.practice.datastructure;

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
	  boolean found=false;
	  for(int i=0; i<this.StackPointer; i++)
	  {
		  if(data[i].equals(x))
		  {
			  found=true;
			  break;
		  }
	  }
	  return found;
  }
  
  public X access(X accessItem)
  {
	  X tempItem;
	  while(this.size()>0)
	  {
		  tempItem = this.pop();
		  if (tempItem.equals(accessItem)) return tempItem;
	  }
    return null;
  }
  
  public int size()
  {
	  return this.StackPointer;
  }
}
