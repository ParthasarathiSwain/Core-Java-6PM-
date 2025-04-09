class Test02{
	public static void main(String args[]){
		int x=90;
		int y=10;
		int z=x+y;
		System.out.println(z);//100

		String s1="Hello";
		String s2="Partha";
		String s3=s1+s2;
		System.out.println("S3 "+s3);//HelloPartha
		
		String s4=" h y "+"    R  a  j  a   ";
		System.out.println(s4);// h y     R  a  j  a

		System.out.println("Output : "+z);

		System.out.println("Output : "+10+20);//Output : 1020
		System.out.println(10+20+"Output : "+10+20);//30Output : 1020
	}
}