import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class searchinamatrix{
    private Treenode root;
    public class Treenode{
        private int data;
        Treenode left;
        Treenode right;
        public Treenode(int data){
            this.data=data;            
        }
    }
    public void createbinarytree(){
        Treenode first=new Treenode(1);
        Treenode second=new Treenode(2);
        Treenode third=new Treenode(3);
        Treenode fourth=new Treenode(4);
        Treenode fifth=new Treenode(5);
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;

        root=first;
    }
//root-left-right
    public void preordertraversal(Treenode root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preordertraversal(root.left);
        preordertraversal(root.right);
    }
    public void  preorder(){
        Stack<Treenode>st=new Stack<>();
        Treenode temp=root;
        st.push(temp);
        while (!st.isEmpty()) {
           temp= st.pop();
           System.out.print(temp.data+" ");
           if(temp.right!=null){
            st.push(temp.right);
           }
           if(temp.left!=null){
            st.push(temp.left);
           }
        }

    }

    //left-root-right
    public void inorder(Treenode root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void inorderiter(){
        Stack <Treenode>st=new Stack<>();
        Treenode temp=root;
        while(!st.isEmpty()||temp!=null){
            if(temp!=null){
            st.push(temp);
            temp=temp.left;
            }else{

                temp=st.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
                
            }
        }}

        public void postorder(){
            if(root==null)return;
            Stack <Treenode>st=new Stack<>();
            Treenode cur=root;
            while(!st.isEmpty()||cur!=null){
                if(cur!=null){
                    st.push(cur);
                    cur=cur.left;
                }
                else{
                    Treenode temp=st.peek().right;
                    if(temp==null){
                        temp=st.pop();
                        System.out.print(temp.data+" ");
                        while(!st.isEmpty()&&temp==st.peek().right){
                            temp=st.pop();
                            System.out.print(temp.data+" ");
                        }
                    }
                    else{
                        cur=temp;
                    }
                }
            }
            
        }

       public void levelorder(){
        Queue <Treenode>q=new LinkedList<>();
        Treenode temp=root;
        q.offer(temp);
        while(!q.isEmpty()){
            temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
       }

       public int maximum(Treenode root){
        if(root==null)return Integer.MIN_VALUE;
        int res=root.data;
        int left=maximum(root.left);
        int right=maximum(root.right);
        if(left>res){
            res=left;
        }
        if(right>res){
            res=right;
        }

        return res;
       }
    
    

public static void main(String[] args) {
    
    searchinamatrix bt=new searchinamatrix();
    bt.createbinarytree();
    bt.preordertraversal(bt.root);
    System.out.println();
    bt.preorder();
    System.out.println();
    bt.inorder(bt.root);
    System.out.println();
    bt.postorder();
    System.out.println();
    bt.levelorder();
    System.out.println();
    System.out.println(bt.maximum(bt.root));

}
}