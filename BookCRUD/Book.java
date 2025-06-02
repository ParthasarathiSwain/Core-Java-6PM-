public class Book{
	private int id;
	private String title;
	private String author;
	private double price;

	//setter
	public void setId(int id){
		this.id=id;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public void setPrice(double price){
		this.price=price;
	}

	//Getter
	public int getId(){
		return this.id;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public double getPrice(){
		return this.price;
	}

	//toString() 	
	public String toString(){
		return  "[ Id : "+this.id+",Title : "+this.title+",Author : "+this.author+",Price : "+this.price+" ]";
	}
}