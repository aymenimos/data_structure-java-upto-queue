public class linkedoperarion {

  private class node {

    private int data;
    private node next;
    private node prev;
  }

  node head;

  public void addbegin(int num) {
    node newnode = new node();
    newnode.data = num;

    if (head == null) {
      head = newnode;
    } else {
      newnode.next = head;
      head = newnode;
    }
  }

  public void mid(int number) {
    node newnode = new node();
    newnode.data = number;
    if (head == null) head = newnode; else {
      node slow = head;
      node fast = head;
      while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
      newnode.next = slow.next;
      slow.next = newnode;
    }
  }

  public void delb() {
    node pointer = head;
    if (head == null) {
      System.out.print("nothing to delet");
    } else {
      head = pointer.next;
    }
  }
  public void delm() {
    node prev=null;
    if (head == null) {
      System.out.print("nothing to delet");
    } else {
        node fast=head;
        node slow=head;
        while (fast.next!=null&&fast.next.next!=null) {
            prev=slow;
            slow=slow.next;
            
            fast=fast.next.next;

            
        }
        prev.next=slow.next;
      //  System.out.println(slow.data);



    }
    

  }

  public void dele() {
    node pointer = head;
    if (head == null) {
      System.out.print("nothing to delet");
    } else {
      while (pointer.next.next != null) {
        pointer = pointer.next;
      }
      pointer.next = null;
    }
  }

  public void addlast(int num) {
    node newnode = new node();
    newnode.data = num;
    if (head == null) {
      head = newnode;
    } else {
      node pointer = head;
      while (pointer.next != null) {
        pointer = pointer.next;
      }

      pointer.next = newnode;
    }
  }

  public void dfs() {}

  public void dispaly() {
    if (head == null) {
      System.out.println("thes stack is empty");
    } else {
      node ptr = head;

      while (ptr.next != null) {
        System.out.print(ptr.data + " ");

        ptr = ptr.next;
      }
      System.out.print(ptr.data);
    }
  }
}
