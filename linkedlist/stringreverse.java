import java.util.Stack;

public class stringreverse {
    public static String stringreverse(String str){
    Stack<Character>stack=new Stack<>();
    char[] chars=str.toCharArray();
    for(char c:chars){
        stack.push(c);
    }
    for(int i=0;i<chars.length;i++){
        chars[i]=stack.pop();
    }
    return new String(chars);

}
public static void main(String[] args) {

    String name="yahya";
    System.out.println(stringreverse(name));
    
}
}
