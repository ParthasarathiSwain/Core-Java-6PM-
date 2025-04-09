class Recharge{
    public static void main(String args[]){
       int balance=30;
         
       if(balance==49 || balance==50 ){
         System.out.println("You are eligible For 49/- Plan !");
       }else if(balance>50 && balance<=100){
	 System.out.println("You are eligible For 99/- Plan !");
       }else if(balance>100 && balance<=150){
         System.out.println("You are eligible For 149/- Plan !");
       }else{
         System.out.println("No Plan in this Amount!!");
       }
    }
}