

//Create a class for an online bookstore inventory system featuring 
//attributes for title, author, price, ISBN, and current stock level. 
//The program should be able to:
//a. Present all book’s information in a clear, user-friendly format:
//  i. Reduce its price by a specified percentage when a promotional discount is applied.
//  ii. Increase its stock count when new copies arrive.
//  iii. Determine whether the book is available for purchase based on stock.
//b. Instantiate at least two distinct book examples (for instance, a popular novel 
//and a specialized textbook) and demonstrate each of these capabilities for both instances.



class Book{
	public String Title;
	public String Author;
	public String ISBN;
	public double Price;
	public int Current_Stock_Level;
	
	
	Book(String Title,String Author,String ISBN,double Price,int Current_Stock_Level){
		this.Title=Title;
		this.Author=Author;
		this.ISBN=ISBN;
		this.Price=Price;
		this.Current_Stock_Level=Current_Stock_Level;
		
	}
	
	public void Discounted_Price(double Percentage) {
		Price=Price-(Percentage*Price/100);
		System.out.println("Discounted Price: "+Price);
		
	}
	public void Add_Stock(int Quantity) {
		Current_Stock_Level+=Quantity;
	}
	
	public void IsAvailable() {
		if( Current_Stock_Level>0) {
			System.out.println("Book is Available");
		}
		
	}
	
	public void Display_Details() {
		System.out.println("====Book Details====");
		System.out.println("Tile: "+ Title);
		System.out.println("Author:"+ Author);
		System.out.println("ISBN: "+ ISBN);
		System.out.println("Price: "+ Price);
		System.out.println("Current Stock Level: "+ Current_Stock_Level);
		
	}
	
	
	
}
public class Assignment1 {

	public static void main(String[] args) {
		Book Novel = new Book("The Hall And Knight","Peter Parker","ASCII2345",3000.0,3);
		
		Novel.Display_Details();
		Novel.IsAvailable();
		Novel.Discounted_Price(15);
		
		Book TextBook=new Book("The Java Programming","Tom Herbert","WERA1234",1200.0,5);
		TextBook.Display_Details();
		TextBook.IsAvailable();
		TextBook.Discounted_Price(13);
		

		
	}

}



