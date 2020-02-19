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
		long m = Integer.parseInt(number1[0]);
		long n = Integer.parseInt(number1[1]);
		line = br.readLine();
		String[] number = line.split(" ", 0);
		long[] num = new long[number.length];
		long sum = 0; 
		for(int i=0; i<number.length; i++) {
			num[i] = Integer.parseInt(number[i]);
			sum += num[i];
		}
		System.out.println(sum);
		long diff = sum -m;
		System.out.println(diff);
		int index = Arrays.binarySearch(num,diff);
		if(index >= 0) {
			System.out.println("Index found ");
			System.out.println(n-1);
			for(int j =0 ; j<n; j++) {
				if(j!=index)
					System.out.println(j);
			}
		}
		else {
			index = (index+1)*-1;
			System.out.println(index);
			if(index == 0) {
				System.out.println("removing index = 0");
				System.out.println(n-1);
				for(int j =0 ; j<n; j++) {
					if(j!=index)
						System.out.println(j);
				}
			}
			else if (index == n) {
				long backsum = diff;
				for(long k = n-1; k>=0; k--) {
					if(backsum - num[(int) k] >= 0)
						backsum -= num[(int)k];
				}
				sq
			}
		}
		br.close();
	}

}
