import java.util.Stack;

public class Binarysearchtree {
    private Treenode root;
    public class Treenode{
        private int data;
        private Treenode left;
        private Treenode right;
        public Treenode(int data){
            this.data=data;
        }
    } 
    public Treenode insert(Treenode root,int value){
        if(root==null){
            root=new Treenode(value);
            return root;
        }
        if(value<root.data){
            root.left=insert(root.left, value);
        }
        else{
            root.right=insert(root.right, value);
        }
        return root;
    }
    public void insert(int value){
        root=insert(root, value);
    }

    public Treenode search(int value){
        return search(root,value);
    }

      public void inorderiterative(){
        if(root==null)return;
        Stack<Treenode>st=new Stack<>();
        Treenode temp=root;
        while(!st.isEmpty()||temp!=null){

            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }

            
            else{
                temp=st.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }

    }
    
    public Treenode search(Treenode root,int value){
        if(root==null||root.data==value){
            return root;
        }
        if(value<root.data){
            return search(root.left, value);
        }
        else{
            return search(root.right, value);
        }
    }
    public boolean isvalid(Treenode root,int min,int max){
        if(root==null)return true;
        if(root.data>=max||root.data<=min){
            return false;
        } 
        boolean left=isvalid(root.left, min, root.data);
        if(left){
            boolean right=isvalid(root, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        Binarysearchtree bst=new Binarysearchtree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.inorderiterative();
        System.out.println();
        System.out.println(bst.search( 5).data+" is present");
        System.out.print(bst.isvalid(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
     
    }
}       