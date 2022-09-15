
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
		return "Book [bookId=" + bookId + ", bookGoodreadsId=" + bookGoodreadsId + ", bestBookId=" + bestBookId
				+ ", workId=" + workId + ", booksCount=" + booksCount + ", ISBN=" + ISBN + ", ISBN13=" + ISBN13
				+ ", authors=" + authors + ", originalPublicationYear=" + originalPublicationYear + ", originalTitle="
				+ originalTitle + ", title=" + title + ", languageCode=" + languageCode + ", averageRating="
				+ averageRating + ", ratingsCount=" + ratingsCount + ", workRatingsCount=" + workRatingsCount
				+ ", workTextReviewsCount=" + workTextReviewsCount + ", ratings1=" + ratings1 + ", ratings2=" + ratings2
				+ ", ratings3=" + ratings3 + ", ratings4=" + ratings4 + ", ratings5=" + ratings5 + ", imageURL="
				+ imageURL + ", smallImageURL=" + smallImageURL + "]";
	}
		
	
}