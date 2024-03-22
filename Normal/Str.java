public class Str {
    public static void main(String[] args) {
        String s1 = "Varun";
        String s2 = "rcout";
        System.out.println(s1.charAt(0));
        System.out.println(s1.concat(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.endsWith("t"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.replaceAll("Va","Ha"));
        System.out.println(s1.length());
        System.out.println(s1.indexOf("a"));
        System.out.println(s2.replaceFirst("r","s"));
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.lastIndexOf(s2));
        System.out.println(s1.toCharArray());
        System.out.println(s1.trim());
        Char[]arr = s1.toCharArray();
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        
    }
}
