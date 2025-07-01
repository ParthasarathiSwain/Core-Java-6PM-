import java.util.Scanner;
class VoteTest{
	static void checkAge(int age) throws SubhaInvalidAgeException{
		if(age<18){
			throw new SubhaInvalidAgeException("You are Not Eligible");
		}else{
			System.out.println("You are  Eligible");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age : ");
		int age=sc.nextInt();

		try{
		   checkAge(age);
		}catch(SubhaInvalidAgeException siae){
			siae.printStackTrace();
		}
	}
}
