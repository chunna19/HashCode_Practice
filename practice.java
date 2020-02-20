import java.io.*;
import java.lang.*;
import java.util.ArrayList;

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
		ArrayList<library> libs = new ArrayList<library>();
		line = br.readLine();
		number1 = line.split(" ",0);
		int t = Integer.parseInt(number1[1]);
		total_time += t;
		int lib = 0;							//put a loop for number of libraries
		int[] books = new int[bnummber];
		while(total_time < days && line != null) {
			int N = Integer.parseInt(number1[0]);
			int n = Integer.parseInt(number1[2]);
			line = br.readLine();
			int indices[] = new int[N];
			int i = 0;
			String number[] = line.split(" ",0);
			int[] lbooks = new int[N];
			int M = N;
			while(N>0) {
				if(books[Integer.parseInt(number[N-1])] == 0) {
					books[Integer.parseInt(number[N-1])] = 1;
					indices[i] = Integer.parseInt(number[N-1]);
					i++;
				}
				lbooks[N-1] = Integer.parseInt(number[N-1]);
				N--;
			}
			library l;
			if((days - total_time) < Math.ceil(M/n)) {
				int p = (int) (Math.ceil(M/n) - (days - total_time));
				l = new library(lib,n*p);
				for(int k =0; k<n*p; k++) {
					if(k<indices.length)
						l.add(indices[k]);
					else
						l.add(lbooks[k]);
				}
			}
			else {
				l = new library(lib,indices.length);
				for (int j = 0; j<lbooks.length; j++) {
					l.add(lbooks[j]);
				}
			}
			lib++;
			line = br.readLine();
			if(line != null) {
				number1 = line.split(" ",0);
				t = Integer.parseInt(number1[1]);
				total_time += t;
			}
			libs.add(l);
		}
		for(int k = 0; k<libs.size(); k++) {
			System.out.println(libs.get(k).id);
			System.out.println(libs.get(k).num_scanned);
			for(int s = 0 ; s<libs.get(k).arr.size(); s++) {
				System.out.println(libs.get(k).arr.get(s));
			}
		}
		br.close();
	}

}
