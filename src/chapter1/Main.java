package chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Book b = new Book("Java入門", new Date(123));
		Book bo = new Book("Python入門", new Date(1233));
		Book boo = new Book("C言語入門",new Date(1253));


		List<Book> books = new ArrayList<Book>();
		books.add(boo);
		books.add(b);
		books.add(bo);
		Collections.sort(books);
	    for(Book booker : books) {
	    	System.out.println(booker.getTitle());
	    }
	    Collections.sort(books, new TitleComparator());
	    for(Book booker : books) {
	    	System.out.println(booker.getTitle());
	    }

	    Book b1 = b.clone();

		if(b1.equals(b)) {
			System.out.println(b1.getTitle() + "と" + b.getTitle() + "は同じ本です");
		} else {
			System.out.println(b1.getTitle() + "と" + b.getTitle() + "は違う本です");
		}
	}

}
