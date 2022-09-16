
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

	@Override
	public String toString() {
		return "Book Id: " + bookId + "\n"
				+ "ISBN: " + ISBN + "\n"
				+ "Title: " + originalTitle + "\n"
				+ "Authors: " + authors + "\n" 
				+ "Publication Year: " + originalPublicationYear + "\n";
	}
		
	
}