
public class missrep {
    public static void main(String[] args) {
        int arr[]={3,1,2,5,3};
        int n=arr.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
            xor^=i+1;
        }
        int bitno=0;
        while(true){
            if((xor&(1<<bitno))!=0){
                break;
            }
            bitno++;
        }
        int zero=0;
        int one=0;
        for(int i=0;i<n;i++){
            if((arr[i]&1<<bitno)!=0){
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
        }
    }

