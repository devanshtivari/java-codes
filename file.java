import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
class file{
    public static void main(String[] args) {
        File file = new File("sample.txt");
        String text = "This is the file created by java";
        try{
        FileWriter output = new FileWriter("./sample.txt");
        output.write(text);
        System.out.println("Written into the file successfully.");
        output.close();
        FileReader fr = new FileReader("./sample.txt");
        int i;
        while((i=fr.read()) != -1){
            System.out.println((char)i);
        }
        }catch(Exception e){
            System.out.println("Unexpected error occured "+e.getMessage());
        }

    }
}