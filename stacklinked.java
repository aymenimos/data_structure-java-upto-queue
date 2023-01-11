public class stacklinked {

  private class Node {

    int data;
    Node next;
  }

  Node head;
public void disp() {
    if (isempty()) {
        System.out.println("stack is empty disp");
        
    }else{
        Node pointer=head;
        while (pointer.next!=null) {
            System.out.println(pointer.data+" ");
            pointer=pointer.next;
            
        }
        System.out.println(pointer.data+" ");
    }


    
}
  public void push(int number) {

    Node newnode = new Node();
    newnode.data = number;
    if (head == null) {
      head = newnode;
    } else {
     newnode.next=head;
      head = newnode;
    }
  }
  public void pop() {
    if (isempty()) {
        System.out.println("the stack is empty");
    }else{
        Node pointer = head;
            System.out.println(pointer.data + " is poped");
            pointer = pointer.next;
            head = pointer;
    }

    
  }
private boolean isempty() {
    return head==null;
}
}
