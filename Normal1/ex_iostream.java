import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex_iostream {
    public static void main(String[] args)throws IOException {
        FileInputStream fin = new FileInputStream("ix.txt");
        InputStreamReader ir = new InputStreamReader(fin);
        FileOutputStream fout = new FileOutputStream("six.txt");
        OutputStreamWriter out = new OutputStreamWriter(fout);

        int i = 0;
        while((i=ir.read())!=-1){
            out.write(i);
        }
        ir.close();
        out.close();
    }
}
