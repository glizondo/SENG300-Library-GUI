
//Imported ArrayList package
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListCreator {
	@SuppressWarnings("rawtypes")
	private List <Book> list;

	@SuppressWarnings("rawtypes")
	public ListCreator() {
//		Changed from LinkedList to ArrayList
		list = new ArrayList<Book>();
	}

	@SuppressWarnings("rawtypes")
	public List<Book> getList() {
		return list;
	}
	
	public void readFile()  {
		try  {
			Scanner input = new Scanner(new File("books3.csv"));
			input.nextLine();
			while(input.hasNext())  {
				String line = input.nextLine();
				System.out.println(line);
				String[] fields = line.split(",");
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
		
				Book book = new Book(bookId, bookGoodreadsId, bestBookId, workId, booksCount, iSBN, iSBN13,
						authors, originalPublicationYear, originalTitle, title, languageCode,
						averageRating, ratingsCount, workRatingsCount, workTextReviewsCount, ratings1,
						ratings2, ratings3, ratings4, ratings5, imageURL, smallImageURL);
				list.add(book);
				
			}
		}
		catch(IOException e) {
			System.out.println("Error reading file");
		}
	}

	public static void main(String[] args) {
		ListCreator lce = new ListCreator();
		//@SuppressWarnings("rawtypes")
		lce.readFile();
		List<Book> list = lce.getList();
		System.out.println(list);
	}
}