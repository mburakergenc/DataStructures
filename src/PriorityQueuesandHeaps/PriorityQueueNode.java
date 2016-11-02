package PriorityQueuesandHeaps;

public class PriorityQueueNode<T> implements Comparable<PriorityQueueNode>
{

   private static int nextorder = 0;
   private int priority;
   private int order;
   private T element;

   //================================================================
   //  Creates a new PriorityQueueNode with the specified data.
   //================================================================
   public PriorityQueueNode (T obj, int prio) 
   {
      element = obj;
      priority = prio;
      order = nextorder;
      nextorder++;
   }  // constructor PriorityQueueNode


   //================================================================
   // method getElement() returns the element
   //================================================================
   public T getElement() 
   {

 	return element;

   }  // method getElement

   //================================================================
   // method getPriority() returns the priority
   //================================================================
   public int getPriority() 
   {

 	return priority;

   }  // method getPriority

   //================================================================
   // method getOrder() returns the order
   //================================================================
   public int getOrder() 
   {

 	return order;

   }  // method getOrder


   //================================================================
   // method compareTo() returns the 1 if the current node has higher
   // priority than the given node, -1 otherwise
   //================================================================
   public int compareTo(PriorityQueueNode obj) 
   {
     int result;
     PriorityQueueNode<T> temp = obj;
     if (priority > temp.getPriority())
        result = 1;
     else if (priority < temp.getPriority())
        result = -1;
     else if (order > temp.getOrder())
        result = 1;
     else
        result = -1;
	return result;

   }  // method compareTo
   

}  // class PriorityQueueNode

