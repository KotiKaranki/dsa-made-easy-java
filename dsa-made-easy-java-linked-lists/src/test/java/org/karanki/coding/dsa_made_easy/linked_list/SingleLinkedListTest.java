package org.karanki.coding.dsa_made_easy.linked_list;

import junit.framework.TestCase;

/**
 * Tests {@link SingleLinkedList} ADT.
 * @author Koteswara R. Karanki
 *
 */
public class SingleLinkedListTest extends TestCase {

	
	public void testInsertOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();
		
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		
		assertNotNull(ll);

		ll.print(System.out);
		
		ll.insert(40);
		ll.insert(100);
		

		ll.print(System.out);
	}
	
	public void testFindOp()
	{
		
		SingleLinkedList ll = new SingleLinkedList();
		
	
		ll.insert(30);
		ll.insert(40);
		ll.insert(100);
		ll.insert(10);
		ll.insert(20);
		
		assertEquals(1, ll.find(40));
		assertEquals(2, ll.find(100));
		assertEquals(4, ll.find(20));
		assertEquals(-1 /* Doesn't exist so -1 */, ll.find(2000));

	}
}
