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

    //better approach
    // int temp[]=new int[n+1];
    // for(int i=0;i<n;i++){
    //     temp[arr[i]]++;

    // }   
    // int repeating=-1;
    // int missing=-1;
    // for(int i=1;i<=n;i++){
    //     if(temp[i]==2)repeating=i;
    //     else if(temp[i]==0)missing=i;
    //     if(repeating!=-1&&missing!=-1)break;
    // }
    // System.out.println("repeating "+repeating);
    // System.out.println("missing "+missing);


    //
    // int s1=0;
    // int s2=0;
    // int sn1=n*(n+1)/2;
    // int sn2=(n*(n+1)*(2*n+1))/6;
    // for(int i=0;i<n;i++){
    //      s1+=arr[i];
    //      s2+=arr[i]*arr[i];
    // }
    
    // int val1=s1-sn1;
    // int val2=s2-sn2;
    // val2=val2/val1;
    // int x=(val1+val2)/2;
    // int y=x-val1;
    // int ans[]={x,y};
    // System.out.println("repeating "+ans[0]+" "+"missing "+ans[1]);

    int xor=0;
    for(int i=0;i<n;i++){
        xor=xor^arr[i];
        xor=xor^i+1;
    }
    int bitno=0;
    while(true){
        if((xor&1<<(bitno))!=0){
            break;
        }
        bitno++;
    }
    int one=0;
    int zero=0;
    for(int i=0;i<n;i++){
        if((arr[i]&(1<<bitno))!=0){
            one^=arr[i];
        }
        else{
            zero^=arr[i];
        }
    }
    for(int i=1;i<=n;i++){
        if((i&(1<<bitno))!=0){
            one^=i;
        }
        else{
            zero^=i;
        }
    }
    int cnt=0;
    for(int i=0;i<n;i++){
        if(arr[i]==zero)cnt++;
    }
    if(cnt==2){
        int ans[]={zero,one};
    }
        int ans[]={one,zero};
    

    System.out.println(" reperating "+ans[0]+" "+"missing "+ans[1]);
}
}
