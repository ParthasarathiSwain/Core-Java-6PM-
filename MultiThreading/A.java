class A implements Runnable{
	//basically run method contains thread logic
    	public void run(){
		System.out.println("Hyy");
	}

	public static void main(String args[]){
		A obj=new A();
		Thread t1=new Thread(obj);
		//t1.run();//CE
		t1.start();
	}
}