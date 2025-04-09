class MovieTicket{
	public static void main(String args[]){
             int age=45;
             if(age<=5){
                System.out.println("Ticket is Free!");
             }else if(age>5 && age<=12){
		System.out.println("Ticket Price is 100/- !");
             }else if(age>12 && age<=18){
		System.out.println("Ticket Price is 200/- !");
             }else{
		System.out.println("Ticket Price is 300/- !");
             }

        }
}