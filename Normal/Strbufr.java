public class Strbufr {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("rcout");
        System.out.println(s1.delete(2,));
        System.out.println(s1.insert(0 ,"s"));
        System.out.println(s1.append("scout"));
        System.out.println(s1.deleteCharAt(0));
        System.out.println(s1.reverse());
        System.out.println(s1.capacity());
        System.out.println(s1.replace(1,5,"python"));
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1,5));
        System.out.println(s1.toString());
        s1.setLength(6);



    }
}
