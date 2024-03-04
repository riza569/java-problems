public class palindromerecursion {
    public static boolean isPalindrome(String name,int l,int r){
        if(l>=r){
            return true;
        }

        char left=name.charAt(l);
        char right=name.charAt(r);
        if(left!=right){
        return false;      
      }
      else{
        return isPalindrome(name, l+1, r-1);
      }
    }
    public static void main(String[] args) {
        String name="malayalam";
        System.out.println(isPalindrome(name, 0, name.length()-1));

    }
}
