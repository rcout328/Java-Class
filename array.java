public class array {
    public static void main(String[] args) {
        int [][] matrix = new int [2][2] ;
        matrix [0] [1] = 1;
        matrix [0] [0] = 2;
        matrix [1] [0] = 3;
        matrix [1] [1] = 4;

        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(matrix [i] [j]);
            }
            System.out.println("");
        }

    }
}
