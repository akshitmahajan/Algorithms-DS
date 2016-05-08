
package com.coursera.algorithm1.week2;

/*
 * Stack of Strings DataType - Stack API
 */
public class StackOfStrings {

	private Node first = null;
	
	private class Node{
		String item;
		Node next;
	}
	
	public void push(String item){
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
	}
	
	public String pop(){
		String item = first.item;
		first = first.next;
		return item;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	/*public int size(){
		return 0;
	}*/
}