import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.xml.sax.SAXException;

public class practicee{
    private Treenode root;
    public static class Treenode{
        private int data;
        private Treenode left;
        private Treenode right;
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
        Treenode six=new Treenode(6);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.right=six;
    }
    //root--left--right
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
        Treenode temp=root;
        st.push(temp);

        while(!st.isEmpty()){
            temp=st.pop();
            System.out.print(temp.data+" ");
           if(temp.right!=null){

            st.push(temp.right);
           }
           if(temp.left!=null){
            st.push(temp.left);
           }
        }

    }
    public void inorder(Treenode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
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
    public void postorder(Treenode root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" "); 
       }


       public void levelorder(){
        if(root==null)return;

        Queue<Treenode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Treenode temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            
            if(temp.right!=null){
                queue.offer(temp.right);
            }
            
        }
        
    }

       public void postorderiteative(){
        if(root==null)return;
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
                System.out.print(temp.data+" ");
                while(!st.isEmpty()&&temp==st.peek().right){
                    temp=st.pop();
                    System.out.print(temp.data+" ");
                }
            }
            else{
                curr=temp;
            }
        }
    }
}
   public int findmax(Treenode root){
        if(root==null)return Integer.MIN_VALUE;
        int res=root.data;
        int left=findmax(root.left);
        int right=findmax(root.right);

        if(left>res){
            res=left;
        }

        if(right>res){
            res=right;
        }

        return res;


   }

       
    public static void main(String[] args) {
        practicee bt=new practicee();
        bt.createbinarytree();
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
        bt.postorderiteative();
        System.out.println();
        bt.levelorder();
        System.out.println();
        System.out.println(bt.findmax(bt.root));
    }
}