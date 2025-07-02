import java.io.*;
class  Test01{

	public static void main(String args[]) throws IOException{
/*
		File  f = new File("abc.pdf");
		boolean res1=f.createNewFile();
		System.out.println(res1);
*/
		File  f = new File("abc.pdf");	
	//	boolean res2=f.mkdir();
	//	System.out.println(res2);
		
		System.out.println(f.exists());

	}
}

	


