import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex_copyio {
    public static void main(String[] args)throws IOException {
        FileOutputStream fout = new FileOutputStream("three.txt");
        FileInputStream fin = new FileInputStream("text.txt");
        int i = 0;
        while((i=fin.read())!=-1){
            fout.write(i);
        }
        fout.close();
        fin.close();

    }
}
