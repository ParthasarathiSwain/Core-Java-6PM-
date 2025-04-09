class Widening{
	public static void main(String args[]){
		byte b=100;
		System.out.println("Byte : "+b);
		short s=b; //widening
		System.out.println("Short : "+s);
		
		char ch='B';//A ASIIC value 66
		int z=ch;
		System.out.println(z);//66
		System.out.println(ch);//A

	}
}