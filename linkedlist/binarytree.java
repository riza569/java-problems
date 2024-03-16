import java.util.Stack;

public class binarytree {
    private Treenode root;
    public class Treenode{

        private int data;
        private Treenode left;
        private Treenode right;

        public Treenode(int data){
            this.data=data;
         
        }
    }
    public void inorderiterative(){
        if(root==null){
            return;
        }
        Stack<Treenode> st=new Stack<>();
        Treenode temp=root;
        while(temp!=null||!st.isEmpty()){
            if(temp!=null){
            st.push(temp);
            temp=temp.left;
            }else{
                temp=st.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }    
        }

    }
    public void creaateBinarytree(){
        Treenode first=new Treenode(1);
        Treenode second=new Treenode(2);
        Treenode third=new Treenode(3);
        Treenode fourth=new Treenode(4);
        Treenode fifth=new Treenode(5);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;         
    }

    public void preorder(Treenode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void preorderiterative(){
        if(root==null){
            return;
        }
        Stack<Treenode>st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Treenode temp=st.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                st.push(temp.right);
            }
            if(temp.left!=null){
                st.push(temp.left);
            }
        }
    }

    public  void inorder(Treenode root){

        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    
    public void postorder(Treenode root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public void postorderiterative(){
        Stack<Treenode>st=new Stack<>();
        Treenode curr=root;
        while(!st.isEmpty()||curr!=null){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            else{
                Treenode temp=st.peek().right;
                if(temp==null){
                    temp=st.pop();
                    System.out.print(temp.data+"-->");
                    while(!st.isEmpty()&&temp==st.peek().right){
                        temp=st.pop();
                        System.out.print(temp.data+"-->");
                    }

                }
                else{
                    curr=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        binarytree bt=new binarytree();
        bt.creaateBinarytree();
        bt.preorder(bt.root);
        System.out.println();
        bt.preorderiterative();
        System.out.println();
        bt.inorder(bt.root);
        System.out.println();
        bt.inorderiterative();
        System.out.println();
        bt.postorder(bt.root); 
        System.out.println();
        bt.postorderiterative();


    }
 
}
