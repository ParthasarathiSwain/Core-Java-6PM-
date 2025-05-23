import java.util.Scanner;
class Number{
	//check prime or not
	public static void checkPrime(int num){
		boolean isPrime = true;
        	if (num <= 1) {
            		isPrime = false;
        	} else {
            		for (int i = 2; i <= Math.sqrt(num); i++) {
               		 	if (num % i == 0) {
                    			isPrime = false;
                    			break;
               			}
            		}
       		}
        	if (isPrime)
            		System.out.println(num + " is a prime number.");
        	else
           		 System.out.println(num + " is not a prime number.");

	}


	//get cube
	public static void getCube(int num){
		if(num>1){
			System.out.println("Cube Of the number is : "+(num*num*num));
		}else{
			System.out.println("Please Enter valid Number");
		}
	}
	//get square
	public static void getSquare(int num){
		if(num>1){
			System.out.println("Square Of the number is : "+(num*num));
		}else{
			System.out.println("Please Enter valid Number");
		}

	}
	//check number +ve or -ve
	public static void checkPosNev(int num){
		if(num>0){
			System.out.println("Number is +ve");
		}else{
			System.out.println("Number is -ve");
		}

	}

	//check palindrome
	public static void checkPalin(int num){
		int original = num;
      		int reverse = 0;

        	while (num > 0) {
            		int digit = num % 10;
            		reverse = (reverse * 10) + digit;
            		num /= 10;
        	}

        	if (original == reverse)
            		System.out.println(original + " is a palindrome.");
        	else
            		System.out.println(original + " is not a palindrome.");
	}

	//get table
	public static void getTable(int num){
		System.out.println("Multiplication Table of " + num + ":");
        	for (int i = 1; i <= 10; i++) {
            		System.out.println(num + " x " + i + " = " + (num * i));
        	}
	}

	//count digit
	public static void countDigit(int num){
		int count = 0;

       		if (num == 0) {
           		 count = 1;
        	} else {
           		 num = Math.abs(num); // handle negative numbers
           		 while (num > 0) {
                		num /= 10;
                		count++;
            		}
        	}

        	System.out.println("Total digits: " + count);
	}


	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);	
		while(true){
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("1 for check Prime or not");
			System.out.println("2 for get cube of the Number");
			System.out.println("3 for get Square of the Number");
			System.out.println("4 for check +ve or -ve");
			System.out.println("5 for check palindrome or not");
			System.out.println("6 for get table of the Number");
			System.out.println("7 for count digit of the Number");
			System.out.println("8 for Exit");
			System.out.println("---------------------------------");
			System.out.println();

			System.out.println("Enter Choice :");
			int choice=sc.nextInt();
			
			switch(choice){
				case 1: 
					System.out.println("Enter Number :");
					int num1=sc.nextInt();
					Number.checkPrime(num1);
					break;

				case 2: System.out.println("Enter Number :");
					int num2=sc.nextInt();
					Number.getCube(num2);
					break;

				case 3: System.out.println("Enter Number :");
					int num3=sc.nextInt();
					Number.getSquare(num3);
					break;


				case 4: System.out.println("Enter Number :");
					int num4=sc.nextInt();
					Number.checkPosNev(num4);
					break;

				case 5: System.out.println("Enter Number :");
					int num5=sc.nextInt();
					Number.checkPalin(num5);
					break;


				case 6: System.out.println("Enter Number :");
					int num6=sc.nextInt();
					Number.getTable(num6);
					break;

				case 7: System.out.println("Enter Number :");
					int num7=sc.nextInt();
					Number.countDigit(num7);
					break;

				case 8: //Exit
					break;
				default:
					System.out.println("Please Enter valid Choice !");
					
			}
		}
	
		
	}
}