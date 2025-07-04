import java.io.*;
class TestBufferedWrite{
	public static void main(String args[]) throws IOException{
		FileWriter fw=new FileWriter("Tiger.txt");

		BufferedWriter  bw=new BufferedWriter(fw);
		bw.write("Welcome");
		bw.newLine();
		bw.write("Hey Prth");
		bw.newLine();
		bw.write("Hey Subha");
		bw.flush();

		fw.close();
		bw.close();
	}
}