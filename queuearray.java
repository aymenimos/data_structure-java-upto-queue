public class queuearray {

  private int size = 5;
  private int[] arr = new int[size];
  private int front;
  private int end;

  public void en(int number) {
    if (isfull()) {
      System.out.println(" is full");
    } else {
      // if(front==-1){
      //     front=0;

      // }

      arr[end] = number;
      end++;
    }
  }

  public void de() {
    if (isempty()) {
      System.out.println("is empty");
    } else {
      int st = arr[front];
      front = front + 1;
      System.out.println(st + " is removed ");
    }
  }

  public void disp() {
    if (isempty()) {
      System.out.println("the stack is empty");
    } else {
      for (int i = front; i < end; i++) {
        System.out.println(arr[i]);
      }
    }
  }

  private boolean isempty() {
    if (end == 0 && front == 0 || front >= end) {
      return true;
    } else {
      return false;
    }
  }

  private boolean isfull() {
    return end == size;
  }
}
