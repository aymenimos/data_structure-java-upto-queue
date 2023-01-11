public class queuelinked {

  class Node {

    int data;
    Node next;
  }

  private Node front;
  private Node end;

  public void en(int number) {
    Node newnode = new Node();
    newnode.data = number;
    if (front == null) {
      front = newnode;
      end = newnode;
    } else {
      Node pointer = end;
      while (pointer.next != null) {
        pointer = pointer.next;
      }
      pointer.next = newnode;
      pointer = newnode;
    }
  }

  public void de() {
    if (front == null) {
      System.out.println("is empty");
    } else {
      Node store = front;
      front = front.next;
      System.out.println(store.data + " is removed");
    }
  }

  public void dis() {
    if (front == null) {
      System.out.println("nothing to show");
    } else {
      Node pointer = front;
      while (pointer != null) {
        System.out.println(pointer.data);
        pointer = pointer.next;
      }
      //  System.out.println(pointer.data);

    }
  }
}
