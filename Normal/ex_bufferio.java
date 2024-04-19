
import java.io.*;

public class ex_bufferio {
    public static void main(String[] args)throws IOException {
        FileOutputStream fout = new FileOutputStream("text.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        FileInputStream fin = new FileInputStream("text.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        String s = "varun";
        byte [] b = s.getBytes();
        bout.write(b);
        bout.close();
        fout.close();
   
        
        int i = 0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
    }
}
