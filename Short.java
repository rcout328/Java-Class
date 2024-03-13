import java.util.Scanner;
public class Short {
    public static int[] sort (int []ar){
        int i,j,temp;

        for (i=0;i<ar.length;i++){
            for (j=0;j<ar.length;j++){
                if(ar[j]>ar[j+1]){
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        return ar;
    }
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

    int[]ar = new int[10];
    System.out.println("Enter value");
    
    for (int i=0;i<10;i++){
        ar[i] = sc.nextInt();
    }
    int [] sortt =  sort(ar);
  

    for(int i=0;i<sortt.length;i++){
        System.out.println(("Sorted array element are "+sortt[i]));
    }
  }
  

}
