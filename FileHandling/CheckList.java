import java.io.*;
class  CheckList{
	public static void main(String args[]) throws IOException{
		File obj=new File("D:/CoreJava6pm/controlstatement");
		String[] names=obj.list();
		int file=0;
		int folder=0;
		int java=0;
		int CLASS=0; 
		for(int i=0;i<names.length;i++){
			if(names[i].contains(".")){
				if(names[i].endsWith(".java")){
					java++;
				}
				else{
					CLASS++;
				}
				//System.out.println("File : "+names[i]);
				file++;
			}else{
				//System.out.println("Folder : "+names[i]);
				folder++;
			}
		}
		System.out.println("--------");
		
		System.out.println("Total file : "+file);
		System.out.println("Total folder : "+folder);
		System.out.println("Total Java file : "+java);
		System.out.println("Total class file : "+CLASS);

		
	}
}