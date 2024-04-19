
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ex_objectio {
    public static void main(String[] args) {
        int data = 5;
        String s = "varun";

        try{
        FileOutputStream  fout = new FileOutputStream("threeee.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        FileInputStream fin = new FileInputStream("File.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        
        out.writeInt(data);
        System.out.println("int" + oin.readInt());
        System.out.println("string" + oin.readObject());
        out.writeObject(5);
        out.close();
        fout.close();
        }
        catch(Exception e){
            System.out.println("fail");
        }
    }
}
