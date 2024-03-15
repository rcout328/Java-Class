public class jaggedar {
    public static void main(String[] args) {
        int [] []jarray = new int [3] [];
        jarray [0] = new int[]{10,20,30};
        jarray [1] = new int[]{20,30};
        jarray [2] = new int[]{50,30,20,10};

        for (int i=0;i<jarray.length;i++){
            for(int j=0;j<jarray.length;j++){
                System.out.println(jarray [i] [j]);
            }
        }
    }
}
