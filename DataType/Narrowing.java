class Narrowing{
	public static void main(String args[]){
		int x=8;
		short s=127;               //2 byte
		byte  b=(byte)s;          //1 byte

	//	System.out.println(b);
		
	//	boolean bool=true;
	//	int d=(int)bool;		

		

		int h=89;
		char ch=(char)h;
		System.out.println(ch);//Y

		
	//	float f=89.99;//double to float
		float f=89.99f;

	}
}