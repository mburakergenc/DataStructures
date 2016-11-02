//*******************************************************************
//
//  HeapNode.java			Authors:  Lewis/Chase
//
//  Creates a binary tree node with a parent pointer for use in heaps.
//*******************************************************************
package datastructures;

public class HeapNode<T> extends BinaryTreeNode<T>
{


   protected HeapNode<T> parent;

   //================================================================
   //  Creates a new heap node with the specified data.
   //================================================================
   HeapNode (T obj) 
   {
      super(obj);
      parent = null;
   }  // constructor HeapNode


}  // class HeapNode

