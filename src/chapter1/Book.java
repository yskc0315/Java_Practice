package chapter1;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book> {

	private String title;
	private Date publishDate;
	private String comment;

	public Book() {
		super();
	}

	public Book(String title, Date publishDate) {
		this.title = title;
		this.publishDate = publishDate;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(!(o instanceof Book)) {
			return false;
		}
		Book b = (Book) o;
		if(!publishDate.equals(b.publishDate)) {
			return false;
		}
		if(!publishDate.equals(b.publishDate)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}

	public int compareTo(Book obj) {
		return this.publishDate.compareTo(obj.publishDate);
	}

	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = (Date)this.publishDate.clone();
		result.comment = this.comment;
		return result;
	}



}
