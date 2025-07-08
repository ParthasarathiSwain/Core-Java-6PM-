class MyThread extends Thread{
	static final Object lock = new Object();

	public  void printNumber(){
	   synchronized(lock){
		for(int i=1;i<=5;i++){
		  System.out.println(Thread.currentThread().getName()+" : "+i);
		}
          }
	}
	public void run(){
		printNumber();
	}


	public static void main(String args[]){
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}

}