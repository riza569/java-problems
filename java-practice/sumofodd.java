public class sumofodd {
    public static int sumofoddno(int n){
        int i;
        int sum=0;
        for(i=1;i<=n;i++){
            if(i%2==1){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int a=10;
        System.out.println(sumofoddno(a));
    }
}
