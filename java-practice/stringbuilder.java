public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder("riza");
        System.out.println(name);

        System.out.println(name.charAt(0));

        name.setCharAt(0, 'm');
        System.out.println(name);

        name.insert(0, 'm');
        System.out.println(name);
        name.insert(3, 'r');
        System.out.println(name);
        name.delete(0, 1);
        System.out.println(name);
        name.append('p');
        name.append('u');
        name.append('r');
        System.out.println(name);
        name.insert(4, 'a');
        System.out.println(name);
    }
}
