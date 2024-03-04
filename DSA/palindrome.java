public class palindrome {
    public static boolean ispalindrome(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String name="malayalaM".toLowerCase();
        System.out.println(ispalindrome(name));
       
    }
}


//or

/*
public static boolean ispalindrome(String str){
boolean ans=false;
String rev="";
for(int i=str.lenght()-1;i>=0;i--){
    rev+=str.charAt(i);
}
if(str.equals(rev)){
    ans=true;
}
return ans;
}













 */