class B extends Thread{
	//basically run method contains thread logic
    	public void run(){
		System.out.println("Bye");
	}

	public static void main(String args[]){
		B t1=new B();
		t1.start();//starts the thread

		B t2=new B();
		t2.start();
	}
}