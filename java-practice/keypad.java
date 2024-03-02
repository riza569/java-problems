public class keypad {
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypadcomb(String str,String comb,int index){
        if(index==str.length()){
            System.out.println(comb);
            return;
        }

        char currentchar=str.charAt(index);
        String mapping=keypad[currentchar-'0'];
        for(int i=0;i<mapping.length();i++){
            keypadcomb(str, comb+mapping.charAt(i), index+1);
        }
    }
    public static void main(String[] args) {
        String str="23";
        keypadcomb(str, "", 0);
    }
}
