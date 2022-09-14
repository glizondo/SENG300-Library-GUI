
//Imported ArrayList package
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCreator {
	@SuppressWarnings("rawtypes")
	private List list;

	@SuppressWarnings("rawtypes")
	public ListCreator() {
//		Changed from LinkedList to ArrayList
		list = new ArrayList();
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	public static void main(String[] args) {
		ListCreator lce = new ListCreator();
		@SuppressWarnings("rawtypes")
		List list = lce.getList();
		System.out.println(list);
	}
}