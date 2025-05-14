class Students{
        String schoolName="BBSR SCHOOL";
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
		s1.schoolName="BBSR Sc"; //1mb

		System.out.println("Student 1");
		System.out.println("School Name    : "+s1.schoolName);
		System.out.println("Name    : "+s1.name);
		System.out.println("RollNum : "+s1.rollNum);
		System.out.println("Age     : "+s1.age);
		System.out.println("Address : "+s1.address);


		Students s2=new Students();
		s2.name="Rahul Swain";
		s2.rollNum="100AB03";
		s2.age=24;
		s2.address="BDK";
		s2.schoolName="BBSR Sc"; //1mb

                System.out.println("Student 2");
		System.out.println("School Name    : "+s2.schoolName);
		System.out.println("Name    : "+s2.name);
		System.out.println("RollNum : "+s2.rollNum);
		System.out.println("Age     : "+s2.age);
		System.out.println("Address : "+s2.address);


     }
}