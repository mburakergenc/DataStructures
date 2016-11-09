import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;

import org.junit.Test;

public class MultiwayTree<T> {
	
	public static class TreeNode<T> {
		T value;
		
		TreeNode<T> leftChild=null;
		TreeNode<T> rightSibling=null;
		TreeNode<T> parent=null;
		
		
		public TreeNode(T value) {
			super();
			this.value = value;
		}


		public void addChild(T value){
			if (leftChild==null){
				leftChild=new TreeNode<T>(value);
				leftChild.parent=this;
				return;
			}
			TreeNode<T> current=leftChild;
			while (current.rightSibling!=null){
				current=current.rightSibling;
			}
			
			TreeNode<T> newNode=new TreeNode<>(value);
			newNode.parent=this;
			current.rightSibling=newNode;
			return;
		}
		
	}
	
	
	TreeNode<T> root;
	
	
	public void breadthFirstTraverse(Consumer<TreeNode<T>> consumer){
	// Complete here
		}
		
		Queue<TreeNode<T>> queue=new LinkedList<>();
		queue.offer(root);
		
		while (!queue.isEmpty()){
			TreeNode<T> node=queue.poll();
			consumer.accept(node);
			
			TreeNode<T> child=node.leftChild;
			while (child!=null){
				queue.offer(child);
				child=child.rightSibling;
			}
		}
	}
	
	@Test
	public void test(){
		
		MultiwayTree<Integer> tree=new MultiwayTree<>();
		tree.root=new TreeNode<Integer>(1);
		
		for (int i=10; i<15; i++){
			// Complete here
		}
		
		for (int i=100; i<105; i++){
			tree.root.leftChild.addChild(i);
		}
		for (int i=200; i<205; i++){
			tree.root.leftChild.rightSibling.addChild(i);
		}
		
		List<Integer> out=new ArrayList<>(20);
		Consumer<TreeNode<Integer>> consumer=a->{
			out.add(a.value);
		};
		
		tree.breadthFirstTraverse(consumer);
		
		int[] expected={1, 10, 11, 12,13,14, 100, 101, 102, 103, 104, 200, 201, 202, 203, 204};
		
		
		for (int i=0; i<expected.length; i++){
			assertEquals(out.get(i).intValue(), expected[i]);
		}
		
		
	}
	
	
	

}
