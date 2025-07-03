import java.io.*;

class FileWriting{
	public static void main(String args[]) throws IOException{
		File f=new File("Tiger.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter("Tiger.txt");
		fw.write("Hy\n.");
		
		char[] ch={'h','u','k'};
		fw.write(ch);
		
		fw.write(97);

		fw.flush();
		fw.close();

		FileWriter fw2=new FileWriter("Tiger.txt");
		fw2.write("Bye");
		fw2.flush();
		fw2.close();
	}
}