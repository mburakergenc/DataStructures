//*******************************************************************
//
// HeapSort.java		Authors: Lewis/Chase
//
//*******************************************************************

package datastructures;

public class HeapSort<T>
{

   //================================================================
   //  sorts a given array of Comparable objects using a heap
   //================================================================
   public void HeapSort(T[] data, int min, int max) 
   {
      Heap<T> temp = new Heap<T>();

      //copy the array into a heap

      for (int ct=min; ct<=max; ct++)
         temp.addElement(data[ct]);

      //place the sorted elements back into the array

      int count=min;
      while (!(temp.isEmpty()))
      {
         data[count] = temp.removeMin();
         count++;
      }

   }  // method HeapSort

} //class HeapSort

