class Test{
	public static void main(String args[]){
		//byte range -128 to +127
		//byte b=128; CE
		byte b=127;
		System.out.println("Byte : "+b);

		//Short range -32768 to +32767
		//short s=32769;
		short s=32700;
		System.out.println("Short : "+s);

		int i=68976895;
		System.out.println("Int : "+i);

		long l=68976895009889l;
		System.out.println("Long : "+l);

		float f=90.0000000f;
		System.out.println("Float : "+f);

		double d=190.00769868768d;
		System.out.println("Double : "+d);
		
		char ch='H';
		System.out.println("Char : "+ch);

		boolean bool=true;
		System.out.println("Boolean : "+bool);


		//Referanced Type
		int x[]={1,2,3,4,44,55,67};

	//	char c='Today class';//error: unclosed character literal
		String str="Today class";
		System.out.println("String : "+str);

	}
}