package org.karanki.coding.dsa_made_easy.linked_list;

import java.io.PrintStream;

/**
 * Single Linked List ADT.
 * 
 * @author Koteswara R. Karanki
 * @since Jun 2016
 */
public class SingleLinkedList {

	
	
	private DataNode HEAD;
	
	
	public void insert(int data)
	{
		
		DataNode newDataNode = new DataNode(data);
		DataNode currentNode = HEAD;
		
		if(currentNode == null)
		{
			HEAD = newDataNode;
			return;
		}
		
		
		while(currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		
		
		currentNode.setNext(newDataNode);
		
	}
	
	public void delete(int data) 
	{
		DataNode currentNode = HEAD;
		
		
	}
	
	public int find(int data)
	{
	
		int index = -1;
		
		if(HEAD == null)
		{
			return index;
		}
		
		DataNode currentNode = HEAD;
		
		while(currentNode != null)
		{
			index++;
			if(currentNode.getData() == data)
			{
				return index;
			}
			
			currentNode = currentNode.getNext();
		}
		
		
		return -1;
	}
	
	
	public void print(PrintStream out)
	{
		if(HEAD == null)
		{
			return;
		}
		
		DataNode currentNode = HEAD;
		out.print("[");
		while(currentNode != null)
		{
			out.print(currentNode.getData() + (currentNode.getNext() != null ? ", " : ""));
			currentNode = currentNode.getNext();
		}
		out.print("]");
		
		out.println();
	}
	
	
	private class DataNode
	{
		private int data;
		private DataNode NEXT;
		
		private DataNode(int data)
		{
			this.data = data;
		}
		
		public int getData()
		{
			return data;
		}
		
		public DataNode getNext()
		{
			return NEXT;
		}
	
		public void setNext(DataNode next)
		{
			this.NEXT = next;
		}
		
	}
	
	
	public static  void main(String []args) {
		
		SingleLinkedList ll = new SingleLinkedList();
		
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		
		
		
		System.out.println(ll.find(10));
		System.out.println(ll.find(20));
		System.out.println(ll.find(30));
		System.out.println(ll.find(40));
		
		ll.print(System.out);

	}
}
