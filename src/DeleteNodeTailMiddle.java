
public class DeleteNodeTailMiddle extends LinkedList {

	public Node deleteNode(Node head, int k){
		int size = this.getSize();
		Node slow = head;
		Node fast =head;
		
		if(head.data == k){
			head = head.next;
			size --;
			this.setHead(head);
			this.setSize(size);
			return head;
		}
	
		while(fast != null && fast.data != k){
			slow =fast;
			fast = fast.next;
		}
		
		slow.next = fast.next;
		fast = null;
		size --;
		this.setSize(size);
	
		return head;
			
}
	
	public Node updateTailNext(Node head){
		int size = this.getSize();
			
		Node Tail =this.getNodeAtIndex(size-1);
		
		Node newMiddle ;
		
		if(size%2 == 0){
			newMiddle = this.getNodeAtIndex((size -2)/2);
		}else {
			newMiddle = this.getNodeAtIndex((size)/2);
		}
		
		System.out.println("newMiddle is   :" + newMiddle.data +"\n");
		Tail.next = newMiddle;
		
		return head;
	}
	
	
	public static void main(String[] args){
		
		DeleteNodeTailMiddle l = new DeleteNodeTailMiddle();
		 l.add(0,10);
		   l.add(1,12);
		   l.add(2,2);
		   l.add(3,3);
		   l.add(4, 45);
		   
		      
		   
		   System.out.println("After adding elements \n");
		   l.display();
		   
//Set the loop/ set the last node's next to the middle node in given input
		    Node head = l.getHead();
		    Node head2 = l.updateTailNext(head);

//delete the Node with value k = 45
		     int k = 45;
		   Node head3 = l.deleteNode(head2, k);
		   Node head4 = l.updateTailNext(head3);
		    	   
	}
}



public class LinkedList {
private Node head;
private int size;
 
 public LinkedList(){
	 head =null;
 }

public void add(int index, int value){
		if(index ==0){
			Node tmp = new Node(value);
			tmp.next = head;
			head= tmp;
			size ++;
		}else{
			Node current = goTo(index-1);
			Node newNode = new Node(value);
			newNode.next = current.next;
			current.next =newNode;
			size ++;
		}
	}

public Node getNodeAtIndex(int x){
	Node node = this.getHead();
	int size= getSize();
	if(x>size){
		return null;
	}
	  for (int i =0;i<size;i++){
		if(i== x){ break;}
		node = node.next;
	}
	  return node;
}

public void setSize(int size){
	this.size = size;
}

public void setHead(Node h){
	head = h;
}

}