public class maximumheap {
    private int heap[];
    private int n;
        public maximumheap(int capacity){
            heap=new int[capacity+1];
            n=0;
        }
        public int size(){
            return n;

        }

        public boolean isEmpty(){
            return n==0;
        }
        public void insert(int x){
            if(n==heap.length-1){
                resize(2*heap.length);
            }
                n++;
                heap[n]=x;
                swim(n);        
        }
        private void resize(int capacity) {
            int temp[]=new int[capacity];
            for(int i=0;i<heap.length;i++){
                temp[i]=heap[i];
            }
            heap=temp;
        }

        public int delete(){
            int max=heap[1];
            swap(1,n);
            n--;
            sink(1);
            heap[n+1]=0;
            
            return max;
        }
        private void sink(int k) {
            while(2*k<=n){
                int j=2*k;
                if(j<n&&heap[j]<heap[j+1]){
                    j++;
                }
                if(heap[k]>=heap[j])
                break;
                
                swap(k,j);
                k=j;
            }
        }


        private void swap(int i, int j) {
            int temp=heap[i];
            heap[i]=heap[j];
            heap[j]=temp;
        }
        public void swim(int k){
            while(k>1&&heap[k/2]<heap[k]){
                int temp=heap[k/2];
                heap[k/2]=heap[k];
                heap[k]=temp;
                k=k/2;
            }
        }
        public void print(){
            for(int i=1;i<=n;i++){
                System.out.print(heap[i]+" ");
            }
        }
     
        public static void main(String[] args) {
            maximumheap mh=new maximumheap(3);
            System.out.println(mh.isEmpty());
            mh.insert(4);
            mh.insert(5);
            mh.insert(2);
            mh.insert(6);
            mh.insert(1);
            mh.insert(3);
            System.out.println(mh.size());
            mh.print();
            mh.delete();
            System.out.println();
            mh.print();
        }
    }



