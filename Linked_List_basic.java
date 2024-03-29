
public class Linked_List_basic {
	Node head;
	
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
	//add-first,last
	public void addFirst(String data) {
		Node newNode= new Node(data);
		if (head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	
	}
	
	public void addLast(String data) {
		Node newNode= new Node(data);
		if (head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;

	}
//print
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode= head;
		while (currNode !=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println("NULL");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List_basic list= new Linked_List_basic();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		list.addLast("list");
		list.printList();
		
		
	}
}
	
