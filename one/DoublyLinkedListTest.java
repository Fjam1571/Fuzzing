import static org.junit.Assert.*;

import org.junit.Test;

public class DoublyLinkedListTest {
	
	DoublyLinkedList<String> dll = new DoublyLinkedList<String>();

	@Test
	public void ItemAtHead() {
		System.out.println("Item At Head\n-----------------------------");
		
		dll.insertFirst("hi4");
		dll.insertFirst("hi3");
		dll.insertFirst("hi2");
		dll.insertLast("hi5");
		
		assertEquals("hi2", dll.getItemAt(0));
		
		dll.insertItemAt(0, "hi1");	
		dll.printList();
		
		dll.insertFirst("hi0");
		assertEquals("hi0", dll.getItemAt(0));
		
		System.out.print("\n");
		dll.printList();
	}
	
	@Test
	public void RemoveItemAtPosition(){
		System.out.println("Remove Item At Position\n-----------------------------");
		dll.insertFirst("hi4");
		dll.insertFirst("hi3");
		dll.insertFirst("hi2");
		dll.insertLast("hi5");
		dll.insertFirst("hi1");
		
		dll.printList();
		System.out.print("\n");
		
		assertEquals("hi3", dll.getItemAt(2));
		
		dll.removeItemAt(2);
		dll.printList();
		System.out.print("\n");
		
		assertNotSame("hi3", dll.getItemAt(2));
		
		dll.insertItemAt(2, "hi3");
		dll.printList();
		System.out.print("\n");
		
		assertEquals("hi3", dll.getItemAt(2));
		
		dll.insertLast("hi6");
		dll.printList();
		System.out.print("\n");
		
		assertEquals("hi3", dll.getItemAt(2));
		
		dll.removeItemAt(2);
		dll.printList();
		System.out.print("\n");
		
		assertNotSame("hi3", dll.getItemAt(2));
		
	}

}
