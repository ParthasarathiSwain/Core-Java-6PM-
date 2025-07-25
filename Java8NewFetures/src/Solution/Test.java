package Solution;

public class Test {
	public static  void main(String[] args) {
		Addtion<Integer> a1=(x,y)->
			System.out.println("Res :"+(x+y));
		;
		a1.add(10,20);
		
		Addtion<Float> a2=(x,y)->
			System.out.println("Res :"+(x+y));
		;
		a2.add(10.78f,20.88f);
		
		Addtion<Double> a3=(x,y)->
			System.out.println("Res :"+(x+y));
		;
		a3.add(10.9,24.8);
		
		Addtion<Long> a4=(x,y)->
			System.out.println("Res :"+(x+y));
		;
		a4.add(133l,244l);
		
		Addtion<String> a5=(x,y)->
			System.out.println("Res :"+(x+y));
		;
		a5.add("Welcome","OTZ");
	}
}
