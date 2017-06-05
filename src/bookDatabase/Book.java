package bookDatabase;

public class Book {
	
	private String SKU;
	private String title;
	private String author;
	private String Description;
	private double price;
	
	public Book(){
		
	}
	public Book(String sKU, String title, String author, String description, double price) {
		super();
		SKU = sKU;
		this.title = title;
		this.author = author;
		Description = description;
		this.price = price;
	}
	
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void strManipulation(String SKU){
		
		
	}
}
