import java.io.*;
class TestPrintWriter{
	public static void main(String args[]) throws IOException{
		
		FileWriter fw=new FileWriter("Tiger.txt");
		PrintWriter pw=new PrintWriter(fw);

		pw.println("Bye Bye");  // println()=write() + newLine()
		pw.println(100);
		pw.println(56.88);
		pw.println(true);

		pw.print("Hip Hip");
		pw.print(122);
		pw.print(33.88);
		pw.print(false);

		pw.flush();
		fw.close();
		pw.close();
	}
}