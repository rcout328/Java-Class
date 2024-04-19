import java.io.*;

public class ex_dataio {
    public static void main(String[] args)throws IOException {
        FileOutputStream  fout = new FileOutputStream("threee.txt");
        DataOutputStream dout = new DataOutputStream(fout);
        String s = "varun";
        byte [] b = s.getBytes();
        dout.write(b);
        dout.close();
        FileInputStream fin = new FileInputStream("text.txt");
        DataInputStream din = new DataInputStream(fin);
        int i = 0;
        while((i=din.read())!=-1){
            System.out.println((char)i);
        }
        din.close();
    }
}
