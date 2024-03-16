public class stacks {
    private int top;
    private int[] arr;
    public stacks(int capacity){
        top=-1;
        arr=new int[capacity];
    }
    public stacks(){
        this(10);
    }
    public void push(int data){
        if(arr.length==top+1){
            throw  new RuntimeException("STACK OVERFLOW");
        }
        top++;
        arr[top]=data;
    }
    public int pop(){
        if(top<0){
            throw new RuntimeException("stack is empty");
        }
        int result=arr[top];
        top--;
        return result;
    }

    public static void main(String[] args) {
        stacks st=new stacks();
        st.push(10);
        st.push(11);
        System.out.println(st.pop());
        
    
    }
}

