//hirarical
class WW{
   int x=88;
}
class AA extends WW{
	int s=99;
}
class FF extends WW{
	public static void main(String args[]){
		FF obj=new FF();
		System.out.println(obj.x);
	//	System.out.println(obj.s);//cannot find symbol
		AA o=new AA();
		System.out.println(o.s);
	}
}