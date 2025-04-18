import java.util.ArrayList;
class Test11{
	public static void main(String args[]){
		ArrayList  al=new ArrayList<>();

		al.add("HY");
		al.add(100);
		al.add(false);
		al.add(10.08f);
		al.add(101.88);
		al.add(2222l);

		System.out.println(al.toString());
	}
}