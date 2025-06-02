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
			System.out.println("1- Add Book\n2- View Book\n2- Update Book\n4- Delete Book");
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
					System.out.println("Update Book");
					break;
				}
				case 4:{
					System.out.println("Delete Book");
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
}










