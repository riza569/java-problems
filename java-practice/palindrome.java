public class palindrome {
    public static boolean palindrome(String str,int l,int r){
        if(l>=r){
            return true;
        }
        char first=str.charAt(l);
        char last=str.charAt(r);
        if(first!=last){
            return false;
        }
        
        return palindrome(str, l+1,r-1);
        
    }
    public static void main(String[] args) {
        String name="malayalam";
        System.out.println(palindrome(name,0,name.length()-1 ));
    }
}
