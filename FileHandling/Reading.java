import java.io.*;
class Reading{
	public static void main(String args[]) throws IOException{
		FileReader fr=new FileReader("Tiger.txt");
		int ch=fr.read();
		while(ch!=-1){
			char data=(char)ch;
			System.out.println(data);
			ch=fr.read();
		}
	}
}