import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Dashboard {

	private JFrame frame;
	private JMenuBar menuBar; // Create JFrame
	private JMenu fileMenu; // Created file menu
	private JMenu bookMenu; // Created book menu
	private JMenu searchMenu; // Created search menu
	private JMenu printMenu; // Created print menu
	private JMenu sortMenu; // Created print menu
	private JMenuItem exit;
	private JMenuItem add;
	private JMenuItem purchase;
	private JMenuItem update;
	private JMenuItem remove;
	private JMenuItem searchID;
	private JMenuItem searchISBN;
	private JMenuItem printAll;
	private JMenuItem sortAscendingAuthor;
	private JMenuItem sortDescendingAuthor;
	private JMenuItem sortAscendingDatePublished;
	private JMenuItem sortDescendingDatePublished;
	private JPanel panel;
	private JLabel welcome;
	private JScrollPane scrollPane;
	private JTextArea text;
	private ListCreator library = new ListCreator();

	/**
	 * Create the application.
	 */
	public Dashboard() {
		initialize();
		loadBooks();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		createMenuBar();

		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 155));
		welcome = new JLabel("Welcome to the Book Library App");
		welcome.setForeground(Color.cyan);
		welcome.setFont(new Font("SansSerif", Font.BOLD, 20));
		panel.add(welcome);
		text = new JTextArea(15, 30);
		text.setFont(new Font("SansSerif", Font.PLAIN, 16));
		scrollPane = new JScrollPane(text);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		text.setLineWrap(true); // Sets the line-wrapping policy of the text area
		text.setWrapStyleWord(true); // Sets the style of wrapping used if the text area is wrapping lines
		panel.add(scrollPane);
		frame.add(panel);
		
		frame.setTitle("Book Library App");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createMenuBar() {
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 0, 255));
		menuBar.setForeground(Color.white);
		
		fileMenu = new JMenu("File");
		bookMenu = new JMenu("Book");
		searchMenu = new JMenu("Search");
		sortMenu = new JMenu("Sort");
		printMenu = new JMenu("Print");
		
		fileMenu.setForeground(Color.white);
		bookMenu.setForeground(Color.white);
		searchMenu.setForeground(Color.white);
		sortMenu.setForeground(Color.white);
		printMenu.setForeground(Color.white);
		
		fileMenu.setFont(new Font("SansSerif", Font.BOLD, 16));
		bookMenu.setFont(new Font("SansSerif", Font.BOLD, 16));
		searchMenu.setFont(new Font("SansSerif", Font.BOLD, 16));
		sortMenu.setFont(new Font("SansSerif", Font.BOLD, 16));
		printMenu.setFont(new Font("SansSerif", Font.BOLD, 16));

		menuBar.add(fileMenu);
		menuBar.add(bookMenu);
		menuBar.add(searchMenu);
		menuBar.add(sortMenu);
		menuBar.add(printMenu);
		
		exit = new JMenuItem("Exit");
		add = new JMenuItem("Add");
		purchase = new JMenuItem("Purchase");
		update = new JMenuItem("Update");
		remove = new JMenuItem("Remove");
		searchID = new JMenuItem("Search By ID");
		searchISBN = new JMenuItem("Search By ISBN");
		printAll = new JMenuItem("All");
		sortAscendingAuthor = new JMenuItem("Ascending by Author");
		sortDescendingAuthor = new JMenuItem("Descending by Author");
		sortAscendingDatePublished = new JMenuItem("Ascending by Published Year");
		sortDescendingDatePublished = new JMenuItem("Descending by Published Year");

		exit.setBackground(Color.cyan);
		exit.setForeground(Color.blue);
		exit.setFont(new Font("SansSerif", Font.BOLD, 16));
		add.setBackground(Color.CYAN);
		add.setForeground(Color.blue);
		add.setFont(new Font("SansSerif", Font.BOLD, 16));
		purchase.setBackground(Color.CYAN);
		purchase.setForeground(Color.blue);
		purchase.setFont(new Font("SansSerif", Font.BOLD, 16));
		update.setBackground(Color.CYAN);
		update.setForeground(Color.blue);
		update.setFont(new Font("SansSerif", Font.BOLD, 16));
		remove.setBackground(Color.CYAN);
		remove.setForeground(Color.blue);
		remove.setFont(new Font("SansSerif", Font.BOLD, 16));
		searchID.setBackground(Color.CYAN);
		searchID.setForeground(Color.blue);
		searchID.setFont(new Font("SansSerif", Font.BOLD, 16));
		searchISBN.setBackground(Color.CYAN);
		searchISBN.setForeground(Color.blue);
		searchISBN.setFont(new Font("SansSerif", Font.BOLD, 16));
		printAll.setBackground(Color.CYAN);
		printAll.setForeground(Color.blue);
		printAll.setFont(new Font("SansSerif", Font.BOLD, 16));
		sortAscendingAuthor.setBackground(Color.CYAN);
		sortAscendingAuthor.setForeground(Color.blue);
		sortAscendingAuthor.setFont(new Font("SansSerif", Font.BOLD, 16));
		sortDescendingAuthor.setBackground(Color.CYAN);
		sortDescendingAuthor.setForeground(Color.blue);
		sortDescendingAuthor.setFont(new Font("SansSerif", Font.BOLD, 16));
		sortAscendingDatePublished.setBackground(Color.CYAN);
		sortAscendingDatePublished.setForeground(Color.blue);
		sortAscendingDatePublished.setFont(new Font("SansSerif", Font.BOLD, 16));
		sortDescendingDatePublished.setBackground(Color.CYAN);
		sortDescendingDatePublished.setForeground(Color.blue);
		sortDescendingDatePublished.setFont(new Font("SansSerif", Font.BOLD, 16));

		fileMenu.add(exit);
		bookMenu.add(add);
		bookMenu.add(purchase);
		bookMenu.add(update);
		bookMenu.add(remove);
		searchMenu.add(searchID);
		searchMenu.add(searchISBN);
		printMenu.add(printAll);
		sortMenu.add(sortAscendingAuthor);
		sortMenu.add(sortDescendingAuthor);
		sortMenu.add(sortAscendingDatePublished);
		sortMenu.add(sortDescendingDatePublished);
		frame.setJMenuBar(menuBar);

		exit.addActionListener(new ExitListener());
		// add.addActionListener(new AddBookListener());
		// purchase.addActionListener(new PurchaseBookListener());
		// update.addActionListener(new UpdateBookListener());
		// remove.addActionListener(new RemoveBookListener());
		searchID.addActionListener(new SearchIDListener());
		searchISBN.addActionListener(new SearchISBNListener());
		printAll.addActionListener(new PrintAllListener());
		sortAscendingAuthor.addActionListener(new SortAscendingAuthorListener());
		sortDescendingAuthor.addActionListener(new SortDescendingAuthorListener());
		sortAscendingDatePublished.addActionListener(new SortAscendingYearListener());
		sortDescendingDatePublished.addActionListener(new SortDescendingYearListener());
	}

	private void loadBooks() {
		library.readFile();
		List<Book> books = library.getList();
		library.selectionSortAverageRating(books);
		String output = "";
		for (int i = 0; i < 10; i++) {
			output += books.get(i) + "\n";
		}
		text.setText(output);
	}

	private class ExitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}

	}
	
	private class PrintAllListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<Book> books = library.getList();
			library.selectionSortAverageRating(books);
			String output = "";
			for (int i = 0; i < 10; i++) {
				output += books.get(i) + "\n";
			}
			text.setText(output);
		}

	}
	

	private class SearchIDListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String ID = JOptionPane.showInputDialog("Enter Book ID");
				int id = Integer.parseInt(ID.trim());
				
				 Book book = library.searchBookID(id); 
				 if(book != null) {
					 text.setText(book.toString());
				 } 
				 else { 
					 JOptionPane.showMessageDialog(null, "There is no book with that ID"); 
				 }
				 
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Please enter a valid ID");
			}
		}

	}
	

	private class SearchISBNListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String ISBN = JOptionPane.showInputDialog("Enter Book ISBN");
				//int id = Integer.parseInt(ID.trim());
				
				 Book book = library.searchBookISBN(ISBN); 
				 if(book != null) {
					 text.setText(book.toString());
				 } 
				 else { 
					 JOptionPane.showMessageDialog(null, "There is no book with that ISBN"); 
				 }
				 
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Please enter a valid ISBN");
			}
		}

	}
	
	private class SortAscendingAuthorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<Book> books = library.getList();
			library.selectionSortAscendingAuthor(books);
			String output = "";
			for (int i = 0; i < 10; i++) {
				output += books.get(i) + "\n";
			}
			text.setText(output);
		}

	}
	
	private class SortDescendingAuthorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<Book> books = library.getList();
			library.selectionSortDescendingAuthor(books);
			String output = "";
			for (int i = 0; i < 10; i++) {
				output += books.get(i) + "\n";
			}
			text.setText(output);
		}

	}
	
	private class SortAscendingYearListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<Book> books = library.getList();
			library.selectionSortAscendingYear(books);
			String output = "";
			for (int i = 0; i < 10; i++) {
				output += books.get(i) + "\n";
			}
			text.setText(output);
		}

	}
	
	private class SortDescendingYearListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			List<Book> books = library.getList();
			library.selectionSortDescendingYear(books);
			String output = "";
			for (int i = 0; i < 10; i++) {
				output += books.get(i) + "\n";
			}
			text.setText(output);
		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
