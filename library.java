import java.util.ArrayList;

public class library {
	int id;
	int num_scanned;
	ArrayList<Integer> arr;
	public library(int id, int num_scanned) {
		this.id = id;
		this.num_scanned = num_scanned;
		arr = new ArrayList<Integer>();
	}
	public void add(int i) {
		arr.add(i);
	}
}
