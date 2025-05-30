class Addition{
	//method overloading
	public void add(int x,int y){
		int res=x+y;
		System.out.println("Res : "+res);
	}
	public void add(float x,float y){
		float res=x+y;
		System.out.println("Res : "+res);
	}
	public void add(double x,double y){
		double res=x+y;
		System.out.println("Res : "+res);
	}
	public void add(char x,char y){
		int res=x+y;
		System.out.println("Res : "+res);
	}
	public void add(String x,String y){
		String res=x+y;
		System.out.println("Res : "+res);
	}

	public static void main(String args[]){
		Addition obj=new Addition();
		obj.add("Hy","Bye");
		obj.add(10,20);
		obj.add(15.99,20.77);
	}
	

}