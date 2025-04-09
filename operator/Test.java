class Test{
	public static void main(String args[]){
		byte b1=60;
		byte b2=20;
	//	byte b3=b1+b2;  possible lossy conversion from int to byte

	//	byte b4=(byte)b1+b2; //int type  result 80
	//		  byte  +byte
	//		      int
		byte b4=(byte)(b1+b2);
		int b5 = b1+b2;

		char c1='A'; //Ascii A=65
		char c2='B'; //Ascii B=64
	//	char c3= c1 + c2 ;
	//		char+char
	//		   int
		char c3= (char)(c1 + c2) ;
		System.out.println("Char c3 : "+c3);//?

		

	}
}