class Test{
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
		
		System.out.println("------------------------");

		Students s2=new Students();
		System.out.println("Student 2");
		System.out.println("Name    : "+s2.name);
		System.out.println("RollNum : "+s2.rollNum);
		System.out.println("Age     : "+s2.age);
		System.out.println("Address : "+s2.address);
		System.out.println("------------------------");


		s2.name="Partha Swain";
		s2.rollNum="100AB03";
		s2.age=25;
		s2.address="BDK";


		System.out.println("Name    : "+s2.name);
		System.out.println("RollNum : "+s2.rollNum);
		System.out.println("Age     : "+s2.age);
		System.out.println("Address : "+s2.address);

		System.out.println("------------------------");
		s1.play();
		s1.dance();
		System.out.println("------------------------");
		s2.play();
		s2.dance();
		System.out.println("------------------------");

		Students s3=new Students();
		System.out.println(s3); // classname@hexaDecimal code
					// Students@33c7353a
	}
}