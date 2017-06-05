package bookDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		String sku;
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		Book book = new Book();
		
		book.setSKU("java1001");
		book.setTitle("Head First Java");
		book.setAuthor("Kathy Sierra and Bert Bates");
		book.setDescription("Easy to read Java workbook");
		book.setPrice(47.50);
		
		list.add(book);
		Book book1 = new Book();
		
		book1.setSKU("Java1002");
		book1.setTitle("Thinking in Java");
		book1.setAuthor("Bruce Eckel");
		book1.setDescription("Details about Java under the hood");
		book1.setPrice(20.00);
		
		list.add(book1);
		Book book2 = new Book();
		
		book2.setSKU("Orcl1003");
		book2.setTitle("OCP: Oracle Certified Professional Java SE");
		book2.setAuthor("Jeanne Boyarsky");
		book2.setDescription("Everything you need to know in one place");
		book2.setPrice(45.00);
		
		list.add(book2);
		Book book3 = new Book();
		
		book3.setSKU("Python1004");
		book3.setTitle("Automate the Boring Stuff with Python");
		book3.setAuthor("Al Sweigart");
		book3.setDescription("Fun with Python");
		book3.setPrice(10.50);
		
		list.add(book3);
		Book book4 = new Book();
		
		book4.setSKU("Zombie1005");
		book4.setTitle("The Maker's Guide to the Zombie Apocalypse");
		book4.setAuthor("Simon Monk");
		book4.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
		book4.setPrice(16.50);
		
		list.add(book4);
		Book book5 = new Book();
		
		book5.setSKU("Rasp1006");
		book5.setTitle("Raspberry Pi Projects for the Evil Genius");
		book5.setAuthor("Donald Norris");
		book5.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
		book5.setPrice(14.75);
		
		list.add(book5);
		
		System.out.println("Enter the SKU number you are searching for: ");
		sku = scan.nextLine();
		 book.strManipulation(sku);
		
		for(int i = 0; i< list.size(); i++){
			if(list.get(i).getSKU().equalsIgnoreCase(sku))
			System.out.println(list.get(i).getSKU() + " "+list.get(i).getTitle() + " "+list.get(i).getAuthor() + " "+list.get(i).getDescription() + " "+list.get(i).getPrice());
		}
		
		scan.close();
	}
}
