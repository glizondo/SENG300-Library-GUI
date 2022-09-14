import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

	int book_id;
	int goodreads_book_id;
	int best_book_id;
	int work_id;
	int books_count;
	String isbn;
	String isbn13;
	String authors;
	double original_publication_year;
	String original_title;
	String title;
	String language_code;
	double average_rating;
	int ratings_count;
	int work_ratings_count;
	int work_text_reviews_count;
	int ratings_1;
	int ratings_2;
	int ratings_3;
	int ratings_4;
	int ratings_5;
	String image_url;
	String small_image_url;

	FileInputStream fileReader;
	Scanner reader;
	ListCreator list;

	public Book(int book_id, int goodreads_book_id, int best_book_id, int work_id, int books_count, String isbn,
			String isbn13, String authors, double original_publication_year, String original_title, String title,
			String language_code, double average_rating, int ratings_count, int work_ratings_count,
			int work_text_reviews_count, int ratings_1, int ratings_2, int ratings_3, int ratings_4, int ratings_5,
			String image_url, String small_image_url, FileInputStream fileReader, Scanner reader, ListCreator list) {
		super();
		this.book_id = book_id;
		this.goodreads_book_id = goodreads_book_id;
		this.best_book_id = best_book_id;
		this.work_id = work_id;
		this.books_count = books_count;
		this.isbn = isbn;
		this.isbn13 = isbn13;
		this.authors = authors;
		this.original_publication_year = original_publication_year;
		this.original_title = original_title;
		this.title = title;
		this.language_code = language_code;
		this.average_rating = average_rating;
		this.ratings_count = ratings_count;
		this.work_ratings_count = work_ratings_count;
		this.work_text_reviews_count = work_text_reviews_count;
		this.ratings_1 = ratings_1;
		this.ratings_2 = ratings_2;
		this.ratings_3 = ratings_3;
		this.ratings_4 = ratings_4;
		this.ratings_5 = ratings_5;
		this.image_url = image_url;
		this.small_image_url = small_image_url;
		this.fileReader = fileReader;
		this.reader = reader;
		this.list = list;
	}

//	public Book() {
//
//	}

//	public ArrayList readFileBuildBookList() {
//		ArrayList<String> array = new ArrayList<String>();
//
//		try {
//			fileReader = new FileInputStream("Books_List.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		reader = new Scanner(fileReader);
//		String blank = reader.nextLine();
//		bookId = reader.nextInt();
//		bookGoodreadsId = reader.nextInt();
////			bestBookId = reader.nextInt();
////			workId = reader.nextInt();
////			booksCount = reader.nextInt();
////			ISBN = reader.next();
////			ISBN13 = reader.next();
//		System.out.println(bookId);
//		System.out.println(bookGoodreadsId);
////			System.out.println(bestBookId);
////			System.out.println(workId);
////			System.out.println(booksCount);
////			System.out.println(ISBN);
////			System.out.println(ISBN13);
//
//		while (reader.hasNext()) {
//
//		}
////			for (int i = 0; i < 100; i++) {
////
////			}
//
//		reader.close();
//		return array;
//	}

}
