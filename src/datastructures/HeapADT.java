//*******************************************************************
//
//  HeapADT.java		Authors:  Lewis and Chase
//
//  defines the interface to a Heap
//*******************************************************************

package datastructures;

public interface HeapADT<T> extends BinaryTreeADT<T> 
{

   
   public void addElement (T obj);

   public T removeMin();
   
   public T findMin();

}  // interface HeapADT
