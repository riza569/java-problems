public class reversestring {
    public static void main(String[] args) {
        // StringBuilder name=new StringBuilder("hello");
        // for(int i=0;i<name.length()/2;i++){
        //     int front=i;
        //     int back=name.length()-i-1;
        //     char frontChar=name.charAt(front);
        //     char backChar=name.charAt(back);
        //     name.setCharAt(front, backChar);
        //     name.setCharAt(back, frontChar);

        // }
        // System.out.println(name);


        // String name="hello";
        // for(int i=name.length()-1;i>=0;i--){
        //     System.out.print(name.charAt(i));
        // }


        StringBuilder name=new StringBuilder("hello");
        for(int i=0;i<name.length()/2;i++){
            int front=i;
            int back=name.length()-i-1;
            char frontChar=name.charAt(front);
            char backChar=name.charAt(back);
            name.setCharAt(front, backChar);
            name.setCharAt(back, frontChar);
        }
        System.out.println(name);

    } 
}
