public class subsequencess {
    
    public static void subsequences(String str,String newstring,int index){
        if(index==str.length()){
            System.out.println(newstring);
            return;
        }

        char currentchar=str.charAt(index);
        subsequences(str,newstring+currentchar,index+1);
        subsequences(str,newstring,index+1);
    }
  public static void main(String[] args) {
    String name="abc";
    subsequences(name, "", 0);
  }
}