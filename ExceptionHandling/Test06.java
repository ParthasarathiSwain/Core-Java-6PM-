import java.io.*;

public class Test06 {

    static void readFile() throws IOException  {
        FileReader file = new FileReader("test.txt");
        BufferedReader fileInput = new BufferedReader(file);
        
        System.out.println(fileInput.readLine());
        fileInput.close();
    }



    public static void main(String[] args) {
       try{
		 readFile();
	}catch(IOException ie){
		System.out.println("Exception Catched!");
	}
    }
}