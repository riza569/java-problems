public class powerecursion {
    public static int power(int x,int n){
        if(n==0||x==1)
            return 1; 
        // return x*power(x, n-1);
        if(n%2==0)
            return power(x, n/2)*power(x, n/2);
        else
            return power(x, n/2)*power(x, n/2) *x;
    }
    public static void main(String[] args) {
        int x=2;
        int y=3;
        System.out.println(power(x, y));
    }
}
