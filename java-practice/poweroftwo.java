public class poweroftwo {
    public static boolean ispoweroftwo(int n){
        return n!=0 && ((n&(n-1))==0);
    }
    public static void main(String[] args) {
        System.out.println(ispoweroftwo(8)?"yes":"no");
    }
}
