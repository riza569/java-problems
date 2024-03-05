public class negativeleft {
    public static void main(String[] args) {
    //     int arr[]={-1,-2,3,-5,-7,-3,6,-1};
    //     int j=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]<0){
    //             if(i!=j){
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //             j++;
    //             }
    //     }
    //     }
    //     for(int x:arr)
    //     System.out.print(x+" ");
    // }
//}

int arr[]={-1,2,3,5,-7,3,6,-1};
int l=0;
int r=arr.length-1;
while (l<=r) {
    
   if(arr[l]<0 && arr[r]<0){
        l++;
    }
    else if(arr[l]>0 && arr[r]<0){
        int temp=arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
        l++;
        r--;
    }
    else if(arr[l]>0 && arr[r]>0 ){
        r--;
    }
    else{
        l++;
        r--;
    }
}
for(int x:arr)
System.out.print(x+" ");

    }}
