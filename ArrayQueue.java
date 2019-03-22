/**
Adam Epstein
3/21/19
This programs implement thei interface defined in the file Stack.java
 */

public class ArrayQueue<T> implements Queue<T> 
{
	int head;
	int tail;
	int size = 10;
	T[] arr;

	//Creates an empty queue using size.
	public ArrayQueue()
	{
		arr = (T[]) new Object[size];
	}

	//Removes the element at the front of the queue 
	public T dequeue() 
    {
        if (empty()) 
        {
            throw new IllegalArgumentException("No elements in array");
        }
    	return arr[head++];
    }

    //Adds the specified element to the rear of the queue
	public void enqueue (T item)
	{
		if (tail == arr.length) 
		{ 
			growArray();
		}	

		arr[tail] = item;
		tail++;
   }

   // checks to see if the queue is empty 
    public boolean empty() 
    {
        if(head == tail)
        {
        	return true;
        }
        return false;	
    }

    ////creates an array double the size
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