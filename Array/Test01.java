import java.util.Scanner;
class  Test01{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size=sc.nextInt();
        //Declaration 
        int x[]=new int[size];
	

        //Initialization
        for(int i=0;i<size;i++){
            System.out.println("Enter value of "+i+ " index");
            x[i]=sc.nextInt();
        }

        //Printing
        for(int i=0;i<size;i++){
		System.out.println("x["+i+"]  =  "+x[i]);
        }
	
	//declaration with initalization
        int y[]={33,44,55,66};
        System.out.println(y.length);
	//Printing
        for(int i=0;i<y.length;i++){
		System.out.println("y["+i+"]  =  "+y[i]);
        }


   }
}
