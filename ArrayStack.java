/**
Adam Epstein
3/21/19
This programs implement thei interface defined in the file Stack.java
 */

public class ArrayStack<T> implements Stack<T> 
{
	int top = -1;
	T[] arr;
	int size = 10;

	// creates a new empty stack.
	public ArrayStack()
	{
		arr = (T[]) new Object[size];
	}
	
	//adds an item to array
    public void push(T item) 
    {
        if (top == arr.length - 1) 
        {
            growArray();
        }
        arr[++top] = item;
    }

    // Removes the top element of this stack.
	public T pop() 
    {
        return arr[top--];
    }

    // Returns the top element of this stack without removing it.
    public T peek() 
    {
        return arr[top];
    }

    //returns true if the array is empty
    public boolean empty() 
    {
        if(top == -1)
        {
        	return true;
        }
        else
        {
        	return false; 
        }
    }

    //creates an array double the size
    private void growArray()
    {   
        T[] tempArr = (T[]) new Object[arr.length * 2];

        for(int i = 0; i < arr.length; i++)
        {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }  
}    	