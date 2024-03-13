import java.util.EmptyStackException;

public class stack {
    private Listnode top;
    private int length;
    private class Listnode{
        private int data;
        private Listnode next;

        public Listnode(int data){
            this.data=data;
        }
    }

    public stack(){
        top=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        Listnode newnode=new Listnode(data);
        newnode.next=top;
        top=newnode;
        length++;
    }
    public int pop(){
        if(isEmpty())throw new EmptyStackException();
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }
    public int peek(){
        if(isEmpty())throw new EmptyStackException();
        return top.data;

    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(10);
        st.push(30);
        st.push(20);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());

    }

}
