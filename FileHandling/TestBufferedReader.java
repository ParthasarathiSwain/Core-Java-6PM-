import java.io.*;
class TestBufferedReader{
	public static void main(String args[]) throws IOException{
		FileReader fr=new FileReader("Tiger.txt");
		
		BufferedReader br=new BufferedReader(fr);

		String line=br.readLine();

		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}

	}
}