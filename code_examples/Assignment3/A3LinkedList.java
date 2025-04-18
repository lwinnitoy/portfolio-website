// Name: Liam Winnitoy
// Student number: v01032129

public class A3LinkedList implements A3List {
	private A3Node head;
	private A3Node tail;
	private int length;
	
	public A3LinkedList() {
		head = null;
		tail = null;
		length = 0;
	}
	
	public void addFront(String s) {
		A3Node sNode = new A3Node(s);
		if (head == null){
			tail = sNode;
		}else{
			sNode.next = head;
			head.prev = sNode;
		}
		head = sNode;
		length++;
	}

	public void addBack(String s) {
		A3Node sNode = new A3Node(s);
		if (tail == null){
			head = sNode;
		}else{
			tail.next = sNode;
			sNode.prev = tail;
		}
		tail = sNode;
		length++;
	}

	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void removeFront() {
		if (head != null){
			if(head.next != null){
				head.next.prev = null;
			}
			head = head.next;
			length--;
		}
	}
	
	public void removeBack() {
		if (tail != null){
			if (tail.prev != null){
				tail.prev.next = null;
			}
			tail = tail.prev;
			length--;
		}
	}
	
	
	
	//////////////////
	/* PART 2 BELOW */
	//////////////////
	
	public void removeMiddle() {
		int position;
		A3Node cur = head;
		if (length == 0){
			return;
		}else if(length == 1){
			head = null;
			tail = null;
			length--;
		}else if(length == 2){
			head = null;
			tail = null;
			length -= 2;
		}else if (length % 2 == 0){
			position = length / 2;
			for (int i = 1; i < position; i++){
				cur = cur.next;
			}
			cur.prev.next = cur.next.next;
			cur.next.next.prev = cur.prev;
			length -= 2;
		}else if(length % 2 == 1){
			position = length / 2;
			for (int i = 1; i < position; i++){
				cur = cur.next;
			}
			cur.next.next.prev = cur;
			cur.next = cur.next.next;
			length --;
		}
	}
	
	
	public void interleave(A3LinkedList other) {
		A3Node cur1 = this.head;
		A3Node cur2 = other.head;
		while(cur1.next != null || cur2.next != null){
			A3Node temp = cur1.next;
			cur1.next = cur2.next;
			cur2.next.prev = cur1;
			cur2.next = temp;
			temp.prev = cur2;
			cur1 = cur1.next;
			cur2 = cur2.next;
		}
	}
	
	
	
	////////////////////////////////////////
	/* METHODS BELOW TO HELP WITH TESTING */
	////////////////////////////////////////
	
	/*
	 * Purpose: return a string representation of the list 
	 *          when traversed from front to back
	 * Parameters: none
	 * Returns: nothing
	 *
	 * USED TO HELP YOU WITH DEBUGGING
	 * DO NOT CHANGE THIS METHOD
	 */
	public String frontToBack() {
		String result = "{";
		A3Node cur = head;
		while (cur != null) {
			result += cur.getData();
			cur = cur.next;
		}
		result += "}";
		return result;
	}
	
	/*
	 * Purpose: return a string representation of the list 
	 *          when traversed from back to front
	 * Parameters: none
	 * Returns: nothing
	 *
	 * USED TO HELP YOU WITH DEBUGGING
	 * DO NOT CHANGE THIS METHOD
	 */
	public String backToFront() {
		String result = "{";
		A3Node cur = tail;
		while (cur != null) {
			result += cur.getData();
			cur = cur.prev;
		}
		result += "}";
		return result;
	}
}
	