public class repeatingmissing {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5};
        int n=arr.length;

        //optimal
    //     int repeating=-1;
    //     int missing=-1;
    //     for(int i=1;i<=n;i++){
    //         int cnt=0;
    //         for(int j=0;j<n;j++){
    //             if(arr[j]==i)cnt++;
    //         }
    //                 if(cnt==2)repeating=i;
    //                 else if (cnt==0)missing=i;
    //                 if(repeating!=-1&&missing!=-1){
    //                     break;
    //                 }
    //     }
    // System.out.println("repeating "+repeating);
    // System.out.println("missing "+missing);

    //
    int temp[]=new int[n+1];
    for(int i=0;i<n;i++){
        temp[arr[i]]++;

    }   
    int repeating=-1;
    int missing=-1;
    for(int i=1;i<=n;i++){
        if(temp[i]==2)repeating=i;
        else if(temp[i]==0)missing=i;
        if(repeating!=-1&&missing!=-1)break;
    }
    System.out.println("repeating "+repeating);
    System.out.println("missing "+missing);
    }
}
