    import java.util.ArrayList;

    public class alternativepositiveneg {
        public static void main(String[] args) {
            int arr[]={1,3,-4,-5,-6,9};
            int n=arr.length;
            int pos_index=0;
int neg_index=1;
int ans[]=new int[n];
for(int i=0;i<n;i++){
	if(arr[i]>0){
		ans[pos_index]=arr[i];
		pos_index+=2;
	}
	else{
		ans[neg_index]=arr[i];
		neg_index+=2;
	}
}
for(int x:ans)
System.out.print(x+" ");
        }}
    //         ArrayList<Integer>pos=new ArrayList<>();
    //         ArrayList<Integer>neg=new ArrayList<>();
    //         for(int i=0;i<n;i++){
    //             if(arr[i]>0){
    //                 pos.add(arr[i]);
    //             }
    //             else{
    //                 neg.add(arr[i]);
    //             }
    //         }
    //         if(pos.size()>neg.size()){
    //             for(int i=0;i<neg.size();i++){
    //                 arr[2*i]=pos.get(i);
    //                 arr[2*i+1]=neg.get(i);
    //             }
    //             int index=neg.size()*2;
    //             for(int i=neg.size();i<pos.size();i++){
    //                 arr[index]=pos.get(i);
    //                 index++;
    //             }
    //         }
    //         else{
    //             for(int i=0;i<pos.size();i++){
    //                 arr[2*i]=pos.get(i);
    //                 arr[2*i+1]=neg.get(i);
    //             }
    //             int index=pos.size()*2;
    //             for(int i=pos.size();i<neg.size();i++){
    //                 arr[index]=neg.get(i);
    //                 index++;
    //             }
    //         }
    //         for(int x:arr)System.out.print(x+" ");
    //     }
    // }









    //bruteforce //o(n)+o(n/2)
            // ArrayList<Integer>pos=new ArrayList<>();
            // ArrayList<Integer>neg=new ArrayList<>();
            // for(int i=0;i<arr.length;i++){
            //     if(arr[i]>0){
            //         pos.add(arr[i]);
            //     }
            //     else{
            //         neg.add(arr[i]);
            //     }
            // }
            
            // for(int i=0;i<arr.length/2;i++){
            //     arr[2*i]=pos.get(i);
            //     arr[2*i+1]=neg.get(i);
            // }
        
            // for(int x:arr){
            //     System.out.print(x+" ");
            // }
