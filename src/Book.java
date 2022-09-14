import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

	int bookId;
	int bookGoodreadsId;
	int bestBookId;
	int workId;
	int booksCount;
	String ISBN;
	String ISBN13;
	String authors;
	double originalPublicationYear;
	String originalTitle;
	String title;
	String languageCode;
	double averageRating;
	int ratingsCount;
	int workRatingsCount;
	int workTextReviewsCount;
	int ratings1;
	int ratings2;
	int ratings3;
	int ratings4;
	int ratings5;
	String imageURL;
	String smallImageURL;

	FileInputStream fileReader;
	Scanner reader;
	ListCreator list;

	public Book(int bookId, int bookGoodreadsId, int bestBookId, int workId, int booksCount, String iSBN, String iSBN13,
			String authors, double originalPublicationYear, String originalTitle, String title, String languageCode,
			double averageRating, int ratingsCount, int workRatingsCount, int workTextReviewsCount, int ratings1,
			int ratings2, int ratings3, int ratings4, int ratings5, String imageURL, String smallImageURL) {
		super();
		this.bookId = bookId;
		this.bookGoodreadsId = bookGoodreadsId;
		this.bestBookId = bestBookId;
		this.workId = workId;
		this.booksCount = booksCount;
		ISBN = iSBN;
		ISBN13 = iSBN13;
		this.authors = authors;
		this.originalPublicationYear = originalPublicationYear;
		this.originalTitle = originalTitle;
		this.title = title;
		this.languageCode = languageCode;
		this.averageRating = averageRating;
		this.ratingsCount = ratingsCount;
		this.workRatingsCount = workRatingsCount;
		this.workTextReviewsCount = workTextReviewsCount;
		this.ratings1 = ratings1;
		this.ratings2 = ratings2;
		this.ratings3 = ratings3;
		this.ratings4 = ratings4;
		this.ratings5 = ratings5;
		this.imageURL = imageURL;
		this.smallImageURL = smallImageURL;
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
