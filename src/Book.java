import java.util.List;

public class Book implements Comparable<Book> {

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

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookGoodreadsId() {
		return bookGoodreadsId;
	}

	public void setBookGoodreadsId(int bookGoodreadsId) {
		this.bookGoodreadsId = bookGoodreadsId;
	}

	public int getBestBookId() {
		return bestBookId;
	}

	public void setBestBookId(int bestBookId) {
		this.bestBookId = bestBookId;
	}

	public int getWorkId() {
		return workId;
	}

	public void setWorkId(int workId) {
		this.workId = workId;
	}

	public int getBooksCount() {
		return booksCount;
	}

	public void setBooksCount(int booksCount) {
		this.booksCount = booksCount;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getISBN13() {
		return ISBN13;
	}

	public void setISBN13(String iSBN13) {
		ISBN13 = iSBN13;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public double getOriginalPublicationYear() {
		return originalPublicationYear;
	}

	public void setOriginalPublicationYear(double originalPublicationYear) {
		this.originalPublicationYear = originalPublicationYear;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	public int getRatingsCount() {
		return ratingsCount;
	}

	public void setRatingsCount(int ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public int getWorkRatingsCount() {
		return workRatingsCount;
	}

	public void setWorkRatingsCount(int workRatingsCount) {
		this.workRatingsCount = workRatingsCount;
	}

	public int getWorkTextReviewsCount() {
		return workTextReviewsCount;
	}

	public void setWorkTextReviewsCount(int workTextReviewsCount) {
		this.workTextReviewsCount = workTextReviewsCount;
	}

	public int getRatings1() {
		return ratings1;
	}

	public void setRatings1(int ratings1) {
		this.ratings1 = ratings1;
	}

	public int getRatings2() {
		return ratings2;
	}

	public void setRatings2(int ratings2) {
		this.ratings2 = ratings2;
	}

	public int getRatings3() {
		return ratings3;
	}

	public void setRatings3(int ratings3) {
		this.ratings3 = ratings3;
	}

	public int getRatings4() {
		return ratings4;
	}

	public void setRatings4(int ratings4) {
		this.ratings4 = ratings4;
	}

	public int getRatings5() {
		return ratings5;
	}

	public void setRatings5(int ratings5) {
		this.ratings5 = ratings5;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getSmallImageURL() {
		return smallImageURL;
	}

	public void setSmallImageURL(String smallImageURL) {
		this.smallImageURL = smallImageURL;
	}
	
	
	@Override
	public String toString() {
		return "Book Id: " + bookId + "\n" +
				"ISBN: " + ISBN + "\n" +
				"Title: " + originalTitle + "\n" +
				"Authors: " + authors + "\n" +
				"Publication Year: " + originalPublicationYear + "\n" +
				"Average Rating: " + averageRating + "\n";
	}

	@Override
	public int compareTo(Book o) {
		
		return 0;
	}

}