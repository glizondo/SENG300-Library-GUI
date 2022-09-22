
//Imported ArrayList package
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ListCreator {
	@SuppressWarnings("rawtypes")
	private List<Book> list;

	@SuppressWarnings("rawtypes")
	public ListCreator() {
//		Changed from LinkedList to ArrayList
//		list = new LinkedList<Book>();
//		list = new ArrayList<Book>();
	}

	public void createSpecificList(int answer) { // Option for user to pick
		if (answer == 1) {
			list = new LinkedList<Book>();
//			System.out.println(list.getClass());

		}
		if (answer == 2) { // Option for user to pick
			list = new ArrayList<Book>();
//			System.out.println(list.getClass());

		}
		// return list; //It sets it here
	}

	@SuppressWarnings("rawtypes")
	public List<Book> getList() {
		return list;
	}

	public void readFile() {

		try {
			FileInputStream fileReader = new FileInputStream("books10k.csv");
			Scanner input = new Scanner(fileReader);
			input.nextLine();
			while (input.hasNext()) {
				String line = input.nextLine();
//				System.out.println(line);
				String[] fields = line.split(",");
				if (fields.length == 23) {
					int bookId = Integer.parseInt(fields[0]);
					int bookGoodreadsId = Integer.parseInt(fields[1]);
					int bestBookId = Integer.parseInt(fields[2]);
					int workId = Integer.parseInt(fields[3]);
					int booksCount = Integer.parseInt(fields[4]);
					String iSBN = fields[5];
					String iSBN13 = fields[6];
					String authors = fields[7];
					double originalPublicationYear;
					if (fields[8].isEmpty()) {
						originalPublicationYear = 0.0;
					} else {
						originalPublicationYear = Double.parseDouble(fields[8]);
					}
					String originalTitle = fields[9];
					String title = fields[10];
					String languageCode = fields[11];
					double averageRating = Double.parseDouble(fields[12]);
					int ratingsCount = Integer.parseInt(fields[13]);
					int workRatingsCount = Integer.parseInt(fields[14]);
					int workTextReviewsCount = Integer.parseInt(fields[15]);
					int ratings1 = Integer.parseInt(fields[16]);
					int ratings2 = Integer.parseInt(fields[17]);
					int ratings3 = Integer.parseInt(fields[18]);
					int ratings4 = Integer.parseInt(fields[19]);
					int ratings5 = Integer.parseInt(fields[20]);
					String imageURL = fields[21];
					String smallImageURL = fields[22];

					Book book = new Book(bookId, bookGoodreadsId, bestBookId, workId, booksCount, iSBN, iSBN13, authors,
							originalPublicationYear, originalTitle, title, languageCode, averageRating, ratingsCount,
							workRatingsCount, workTextReviewsCount, ratings1, ratings2, ratings3, ratings4, ratings5,
							imageURL, smallImageURL);
					list.add(book);
				}
			}
		}

		catch (IOException e) {
			System.out.println("Error reading file");
		}

	}

	public void swapElements(List<Book> list, int i, int j) {
		Book temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public int indexHighestAverageRating(List<Book> list, int start) {
		int highIndex = start;
		for (int i = start; i < list.size(); i++) {
			if (list.get(i).getAverageRating() > list.get(highIndex).getAverageRating()) {
				highIndex = i;
			}
		}
		return highIndex;
	}

	public List selectionSortAverageRating(List<Book> list) {
		for (int i = 0; i < list.size(); i++) {
			int j = indexHighestAverageRating(list, i);
			swapElements(list, i, j);
		}
		return list;
	}

	public List<Book> selectionSortAscendingAuthor(List<Book> list) {
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < list.size(); i++) {

			// Find the minimum element in unsorted array
			int min_index = i;
			String minStr = list.get(i).getAuthors();
			for (int j = i + 1; j < list.size(); j++) {

				/*
				 * compareTo() will return a -ve value, if string1 (arr[j]) is smaller than
				 * string2 (minStr)
				 */
				// If arr[j] is smaller than minStr

				if (list.get(j).getAuthors().compareTo(minStr) < 0) {
					// Make arr[j] as minStr and update min_idx
					minStr = list.get(j).getAuthors();
					min_index = j;
					System.out.println("MIN INDEX" + min_index);
					System.out.println(j);

				}
			}

			// Swapping the minimum element
			// found with the first element.
			if (min_index != i) {
				Book temp = list.get(min_index);
				list.set(min_index, list.get(i));
				list.set(i, temp);
			}
		}
		return list;
	}

	public List<Book> selectionSortDescendingAuthor(List<Book> list) {
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < list.size(); i++) {

			// Find the maximum element in unsorted array
			int max_index = i;
			String maxStr = list.get(i).getAuthors();
			for (int j = i + 1; j < list.size(); j++) {

				/*
				 * compareTo() will return a -ve value, if string1 (arr[j]) is larger than
				 * string2 (maxStr)
				 */
				// If arr[j] is larger than maxStr

				if (list.get(j).getAuthors().compareTo(maxStr) > 0) {
					// Make arr[j] as maxStr and update max_idx
					maxStr = list.get(j).getAuthors();
					max_index = j;
					System.out.println("MAX INDEX" + max_index);
					System.out.println(j);

				}
			}

			// Swapping the maximum element
			// found with the first element.
			if (max_index != i) {
				Book temp = list.get(max_index);
				list.set(max_index, list.get(i));
				list.set(i, temp);
			}
		}
		return list;
	}

	public List<Book> selectionSortAscendingYear(List<Book> list) {
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < list.size(); i++) {

			// Find the minimum element in unsorted array
			int min_index = i;
			double minStr = list.get(i).getOriginalPublicationYear();
			for (int j = i + 1; j < list.size(); j++) {

				/*
				 * compareTo() will return a -ve value, if string1 (arr[j]) is smaller than
				 * string2 (minStr)
				 */
				// If arr[j] is smaller than minStr

				if (list.get(j).getOriginalPublicationYear() < minStr) {
					// Make arr[j] as minStr and update min_idx
					minStr = list.get(j).getOriginalPublicationYear();
					min_index = j;
					System.out.println("MIN INDEX" + min_index);
					System.out.println(j);

				}
			}

			// Swapping the minimum element
			// found with the first element.
			if (min_index != i) {
				Book temp = list.get(min_index);
				list.set(min_index, list.get(i));
				list.set(i, temp);
			}
		}
		return list;
	}

	public List<Book> selectionSortDescendingYear(List<Book> list) {
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < list.size(); i++) {

			// Find the maximum element in unsorted array
			int max_index = i;
			double maxStr = list.get(i).getOriginalPublicationYear();
			for (int j = i + 1; j < list.size(); j++) {

				/*
				 * compareTo() will return a -ve value, if string1 (arr[j]) is larger than
				 * string2 (maxStr)
				 */
				// If arr[j] is larger than maxStr

				if (list.get(j).getOriginalPublicationYear() > maxStr) {
					// Make arr[j] as maxStr and update max_idx
					maxStr = list.get(j).getOriginalPublicationYear();
					max_index = j;
					System.out.println("MAX INDEX" + max_index);
					System.out.println(j);

				}
			}

			// Swapping the maximum element
			// found with the first element.
			if (max_index != i) {
				Book temp = list.get(max_index);
				list.set(max_index, list.get(i));
				list.set(i, temp);
			}
		}
		return list;
	}

	public List<Book> selectionSortAscendingID(List<Book> list) {
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < list.size(); i++) {

			// Find the minimum element in unsorted array
			int min_index = i;
			double minStr = list.get(i).getBookId();
			for (int j = i + 1; j < list.size(); j++) {

				/*
				 * compareTo() will return a -ve value, if string1 (arr[j]) is smaller than
				 * string2 (minStr)
				 */
				// If arr[j] is smaller than minStr

				if (list.get(j).getBookId() < minStr) {
					// Make arr[j] as minStr and update min_idx
					minStr = list.get(j).getBookId();
					min_index = j;
					System.out.println("MIN INDEX" + min_index);
					System.out.println(j);

				}
			}

			// Swapping the minimum element
			// found with the first element.
			if (min_index != i) {
				Book temp = list.get(min_index);
				list.set(min_index, list.get(i));
				list.set(i, temp);
			}
		}
		return list;
	}

	public List<Book> selectionSortAscendingISBN(List<Book> list) {
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < list.size(); i++) {

			// Find the minimum element in unsorted array
			int min_index = i;
			String minStr = list.get(i).getISBN();
			for (int j = i + 1; j < list.size(); j++) {

				/*
				 * compareTo() will return a -ve value, if string1 (arr[j]) is smaller than
				 * string2 (minStr)
				 */
				// If arr[j] is smaller than minStr

				if (list.get(j).getISBN().compareTo(minStr) < 0) {
					// Make arr[j] as minStr and update min_idx
					minStr = list.get(j).getISBN();
					min_index = j;
					System.out.println("MIN INDEX" + min_index);
					System.out.println(j);

				}
			}

			// Swapping the minimum element
			// found with the first element.
			if (min_index != i) {
				Book temp = list.get(min_index);
				list.set(min_index, list.get(i));
				list.set(i, temp);
			}
		}
		return list;
	}

	public Book searchBookID(int id) { // Linear search by id
		for (Book book : list) {
			if (book.getBookId() == id) {
				return book;
			}
		}
		return null;
	}

	public Book searchBookISBN(String isbn) { // Linear search by isbn
		for (Book book : list) {
			if (book.getISBN().equals(isbn)) {
				return book;
			}
		}
		return null;
	}

	public Book searchBookIDBinary(int id, List<Book> list) {
		int low = 0;
		int high = list.size() - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (list.get(mid).getBookId() == id) {
				return list.get(mid);
			} else if (id < list.get(mid).getBookId()) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return null;
	}

	public Book searchBookISBNBinary(String isbn, List<Book> list) {
		int low = 0;
		int high = list.size() - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (list.get(mid).getISBN().compareTo(isbn) == 0) {
				return list.get(mid);
			} else if (isbn.compareTo(list.get(mid).getISBN()) < 0) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return null;
	}

	public String testLinearSearch() { // Tests linear search for an id - change book file in readFile() to books10k
										// for better appreciation of processing time - Returns long variable of total
										// time
		ListCreator library = new ListCreator();
		library.createSpecificList(1);
		library.readFile();
		List<Book> books = library.getList();
		long startTime = System.currentTimeMillis();
		library.searchBookID(8000);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return "Total time for linear search = " + (totalTime * 0.001) + " seconds";
	}

	public String testBinarySearch() { // Tests binary search for an id - change book file in readFile() to books10k
		// for better appreciation of processing time - Returns long variable of total
		// time
		ListCreator library = new ListCreator();
		library.createSpecificList(2);
		library.readFile();
		List<Book> books = library.getList();
		long startTime = System.currentTimeMillis();
		library.selectionSortAscendingID(library.getList()); // Organizes the list by ascending ID
		library.searchBookIDBinary(8000, books);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return "Total time for binary search = " + (totalTime * 0.001) + " seconds";
	}
	
	public String testBinarySearchNoSorting() { // Tests binary search for an id with no sorting - change book file in readFile() to books10k
		// for better appreciation of processing time - Returns long variable of total
		// time
		ListCreator library = new ListCreator();
		library.createSpecificList(2);
		library.readFile();
		List<Book> books = library.getList();
		long startTime = System.currentTimeMillis();
		library.searchBookIDBinary(8000, books);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		return "Total time for binary search without sorting (the books are already sorted previously) = " + (totalTime * 0.001) + " seconds";
	}

	public static void main(String[] args) {
		ListCreator library = new ListCreator();
		System.out.println(library.testLinearSearch());
		System.out.println(library.testBinarySearch());
		System.out.println(library.testBinarySearchNoSorting());

	}
}