
public class stackarray {

   
        private int size=10;
        private int []arr;
        private int  maxtop;
        private int top;
    

    public void CreatStack() {

        top=-1;
        maxtop=size-1;
        arr=new int[size];
    }
    public void push(int number) {
        if (isfull()) {
            System.out.println("stack is full");

            
        }else{
            top++;
            arr[top]=number;


        }
        
    }
    public void disp(){
        if (isempt()) {
            System.out.println("stack empty");
            
        }else{
           for (int i = top; i >=0; i--) {
            System.out.println(arr[i]);
            
           }
        }
    }
    public void top() {
        if (isempt()) {
            System.out.println("stack empty");
            
        }else{
           
        
      System.out.println(arr[top]);
        }
        
    }
    public void pop() {

        if (isempt()) {
            System.out.println("stack empty");
            
        }else{
            int store=arr[top];
            top--;
        
 System.out.println(store);
        }
       
        
    }
    private boolean isempt() {
        return top==-1;
    }
    private boolean isfull() {

        return top==maxtop;
    }

}