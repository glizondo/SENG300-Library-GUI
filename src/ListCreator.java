
//Imported ArrayList package
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListCreator {
	@SuppressWarnings("rawtypes")
	private List<Book> list;

	@SuppressWarnings("rawtypes")
	public ListCreator() {
//		Changed from LinkedList to ArrayList
//		list = new LinkedList<Book>();
		list = new ArrayList<Book>();
	}

	@SuppressWarnings("rawtypes")
	public List<Book> getList() {
		return list;
	}

	public void readFile() {

		try {
			FileInputStream fileReader = new FileInputStream("books.csv");
			Scanner input = new Scanner(fileReader);
			input.nextLine();
			while (input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
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
					double originalPublicationYear = Double.parseDouble(fields[8]);
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

	public int indexHighestAscendingPublishDate(List<Book> list, int start) {
		int highIndex = start;
		for (int i = start; i < list.size(); i++) {
			if (list.get(i).getOriginalPublicationYear() > list.get(highIndex).getOriginalPublicationYear()) {
				highIndex = i;
			}
		}
		return highIndex;
	}

	public List selectionSortAscendingPublishDate(List<Book> list) {
		for (int i = 0; i < list.size(); i++) {
			int j = indexHighestAscendingPublishDate(list, i);
			swapElements(list, i, j);
		}
		return list;
	}

	public int indexHighestDescendingPublishDate(List<Book> list, int start) {
		int highIndex = start;
		for (int i = start; i < list.size(); i++) {
			if (list.get(i).getOriginalPublicationYear() < list.get(highIndex).getOriginalPublicationYear()) {
				highIndex = i;
			}
		}
		return highIndex;
	}

	public List selectionSortDescendingPublishDate(List<Book> list) {
		for (int i = 0; i < list.size(); i++) {
			int j = indexHighestAscendingPublishDate(list, i);
			swapElements(list, i, j);
		}
		return list;
	}

	public List selectionSortAscendingAuthor(List<Book> list) {
		for (int i = 0; i < list.size(); i++) {

			int min_index = i;
			String minStr = list.get(i).getAuthors();
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(j).getAuthors().compareTo(minStr) < 0) {
					minStr = list.get(j).getAuthors();
					min_index = j;
					System.out.println("MIN INDEX" + min_index);
					System.out.println(j);

				}
			}

			if (min_index != i) {
				Book temp = list.get(min_index);
				list.set(min_index, list.get(i));
				list.set(i, temp);
			}
		}
		return list;
	}

	public List selectionSortDescendingAuthor(List<Book> list) {
		for (int i = 0; i < list.size(); i++) {

			int min_index = i;
			String minStr = list.get(i).getAuthors();
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(j).getAuthors().compareTo(minStr) > 0) {
					minStr = list.get(j).getAuthors();
					min_index = j;
					System.out.println("MIN INDEX" + min_index);
					System.out.println(j);

				}
			}

			if (min_index != i) {
				Book temp = list.get(min_index);
				list.set(min_index, list.get(i));
				list.set(i, temp);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ListCreator lce = new ListCreator();
		// @SuppressWarnings("rawtypes")
		lce.readFile();
		List<Book> list = lce.getList();
//		for (Book b : list) {
//			System.out.println(b);
//		}
//		System.out.println(list.get(12));
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getAverageRating());
//
//		}
//		lce.getTop10Books();
//		System.out.println(lce.selectionSortDescendingPublishDate(list));

	}
}