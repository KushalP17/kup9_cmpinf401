package classwork_linkedlist;

public class Node {
		Node next;
		
		Object data;
		
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}
		
		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}
}
