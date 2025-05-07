class Students{
	String name;
        String rollNum;
        int age;
        String address;

     void play(){
	System.out.println("i'm playing!");
     }

     void dance(){
	System.out.println("i'm Dancing!");
     }
     public static void main(String args[]){
		Students s1=new Students();
		
		s1.name="Subhalipsa Swain";
		s1.rollNum="100AB02";
		s1.age=21;
		s1.address="BBSR";
		
		System.out.println("Student 1");
		System.out.println("Name    : "+s1.name);
		System.out.println("RollNum : "+s1.rollNum);
		System.out.println("Age     : "+s1.age);
		System.out.println("Address : "+s1.address);

     }
}