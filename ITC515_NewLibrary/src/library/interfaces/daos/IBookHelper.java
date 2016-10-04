package library.interfaces.daos;

import library.interfaces.entities.IBook;

public interface IBookHelper {
	@Override
	public IBook makeBook(String author, String title, String callNumber, int id) {
		return new Book(author, title, callNumber, id);
	public IBook makeBook(String author, String title, String callNumber, int id);

}
