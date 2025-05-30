//parent class
class School{
	//Overriden
	public void midDayMeal(String meal){
		System.out.println("Parent Meal : "+meal);
	}
}
//child class
class Student extends School{
	@Override
	public void midDayMeal(String meal){
		System.out.println("Child Meal : "+meal);
	}

	public static void main(String args[]){
		Student obj=new Student();
		obj.midDayMeal("Maggie");
	}
}