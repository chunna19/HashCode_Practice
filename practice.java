import java.io.*;
import java.util.Arrays;

public class practice {
	public static void main(String args[]) throws IOException {
		hashcode(args[0]);
	}
	public static void hashcode(String a) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(a));
		String line = br.readLine();
		String[] number1 = line.split(" ", 0);
		int bnummber = Integer.parseInt(number1[0]);
		int lnumber = Integer.parseInt(number1[1]);
		int days = Integer.parseInt(number1[2]);
		line = br.readLine();
		number1 = line.split(" ", 0);
		int[] scores = new int[number1.length];
		for(int i=0; i<number1.length; i++){
			scores[i] = Integer.parseInt(number1[i]);
		}
		int total_time = 0;
		line = br.readLine();
		number1 = line.split(" ",0);
		int t = Integer.parseInt(number1[1]);
		total_time += t;
		int lib = 0;							//put a loop for number of libraries
		int[] books = new int[bnummber];
		while(total_time < days) {
			lib++;
			int N = Integer.parseInt(number1[0]);
			int n = Integer.parseInt(number1[2]);
			line = br.readLine();
			int indices[] = new int[N];
			int i = 0;
			String number[] = line.split(" ",0);
			while(N>0) {
				if(books[Integer.parseInt(number[N-1])] == 0) {
					books[Integer.parseInt(number[N-1])] = 1;
					indices[i] = Integer.parseInt(number[N-1]);
					i++;
				}
				N--;
			}
			
	//		for(int i=0; i<D.length; i++) {
	//			if(i>=t) 
	//				D[i] += n;
	//		}
			line = br.readLine();
			number1 = line.split(" ",0);
			t = Integer.parseInt(number1[1]);
			total_time += t;
		}
		br.close();
	}

}
