import java.io.*;
class CheckWord{
	public static void main(String args[]) throws IOException{
		FileReader fr=new FileReader("Tiger.txt");
		
		BufferedReader br=new BufferedReader(fr);

		String line=br.readLine();
		boolean b=false;
		while(line!=null){
			if(line.contains("WOW")){
			  b=true;
			}
			line=br.readLine();
		}
		if(b==true){
			System.out.println("Yes Present");
		}else{
			System.out.println("Not Present");
		}

	}
}