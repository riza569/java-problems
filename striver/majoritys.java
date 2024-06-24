
public class majoritys {
    public static void main(String[] args) {
        int arr[]={2,3,2,3,2,3};
        int n=arr.length;
        int cnt1=0;
        int cnt2=0;
        int ele2=0;
        int ele1=0;
        for(int i=0;i<n;i++){
            if(cnt1==0&&arr[i]!=ele2){
                cnt1=1;
                ele1=arr[i];
            }
            else if(cnt2==0&&arr[i]!=ele1){
                cnt2=1;
                ele2=arr[i];
            }
            else if(arr[i]!=ele1)cnt1--;
            else if(arr[i]==ele1)cnt1++;
            else if(arr[i]==ele2)cnt2++;
            else cnt2--;
        }
         cnt1=0;
         cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele1)cnt1++;
            else if(arr[i]==ele2)cnt2++;
        }
        if(cnt1>=(n/3)){
            System.out.println(ele1);
        }
        if(cnt2>=(n/3)){
            System.out.println(ele2);
        }
      
    }
}