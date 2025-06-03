import java.util.Scanner;

class  BookCRUD{
	private Scanner sc;
	private Book[] books;
	private int count;
	BookCRUD(){
		books=new Book[1000];
		sc=new Scanner(System.in);
		count=0;
	}
	public void start(){		
		int choice;
		do{
			System.out.println("1- Add Book\n2- View Book\n3- Update Book\n4- Delete Book");
			System.out.println("Enter Choice : ");
			choice=sc.nextInt();

			switch(choice){
				case 1:{
					addBook();
					break;
				}
				case 2:{
					viewBook();
					break;
				}
				case 3:{
					updateBook();
					break;
				}
				case 4:{
					deleteBook();
					break;
				}
				default : System.out.println("Invalid Choice!");

			}
		}while(true);
	}

	//main method
	public static void main(String args[]){
		BookCRUD app=new BookCRUD();
		app.start();
	}

	// Add Book Method
	private void addBook(){
		System.out.println("Enter Id : ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Title  : ");
		String title=sc.nextLine();
		System.out.println("Enter Author : ");
		String author=sc.nextLine();
		System.out.println("Enter Price : ");
		double price=sc.nextDouble();
		
		Book book=new Book();
		book.setId(id);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(price);
		
		books[count++]=book;
		System.out.println("Book Added Successfully !");
		
	}

	//view Book
	private void viewBook(){
		if(count==0){
			System.out.println("No Books Found!");
		}else{
			for(int i=0;i<count;i++){
				System.out.println(books[i]);
			}
		}
	}
	//update Book
	private void updateBook(){
		System.out.println("Enter Id to Update Book : ");
		int id=sc.nextInt(); 
		sc.nextLine();
		boolean b=false;
		for(int i=0 ;i<count;i++){
			if(books[i].getId()==id){
				System.out.println("Enter New Title  : ");
				String newTitle=sc.nextLine();
				System.out.println("Enter New Author : ");
				String newAuthor=sc.nextLine();
				System.out.println("Enter New Price : ");
				double newPrice=sc.nextDouble();
				books[i].setTitle(newTitle);
				books[i].setAuthor(newAuthor);
				books[i].setPrice(newPrice);
				b=true;
				System.out.println("Update Successfully!");
				break;
			}
		}
		if(b==false){
			System.out.println("Book id Not Found!");
		}
		
	}

	//Delete Book
	private void deleteBook(){
		System.out.println("Enter Id to Delete Book : ");
		int id=sc.nextInt(); 
		sc.nextLine();
		boolean b=false;

		for(int i=0 ;i<count;i++){
			if(books[i].getId()==id){
				for(int j=i;j<count-1;j++){
					books[j]=books[j+1];
				}
				books[--count]=null;
				System.out.println("Book Deleted Successfully !");
				b=true;
				break;				
			}
		}
		if(b==false){
			System.out.println("Book id Not Found!");
		}
	}
}










