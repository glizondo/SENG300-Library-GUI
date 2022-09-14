import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookList {

	static List<Book> books;

	public BookList(List<Book> list) {
		super();
		for (int i = 0; i < 100; i++) {
			books.add(i, new Book(0, 0, 0, 0, 0, null, null, null, 0, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null,
					null));
		}
	}

}
