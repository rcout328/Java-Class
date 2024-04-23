import java.io.IOException;
import java.io.RandomAccessFile;
public class ex_random{
    public static void main(String[] args)throws IOException {
            RandomAccessFile inout = new RandomAccessFile("inout.txt","rw");
            inout.setLength(16);
            for(int i = 0;i<200;i++){
                inout.writeInt(i);
            }
            System.out.println("length of file "+inout.length());
            inout.seek(16);
            System.out.println("This first number "+ inout.readInt());
    }
}