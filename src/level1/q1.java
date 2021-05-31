package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class q1 {

	public static void main(String[] args) {
		
		
		int[] answers = {2, 1, 2, 3, 2, 4, 2, 5};
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		int[] s = new int[3];
		s[0] = S1.search(answers);
		s[1] = S2.search(answers);
		s[2] = S3.search(answers);
		
		System.out.println();
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println();
		
		int m = 0;
		for(int i = 0; i < 3; i++) {
			if(s[i] > m) {
				m = s[i];
				n.clear();
				n.add(i + 1);
				System.out.println(s[i] + " " + m);
			} else if(s[i] == m) {
				n.add(i + 1);
				System.out.println(s[i] + " " + m);
			} else { System.out.println(s[i] + " " + m);}
		}
		
		Collections.sort(n, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				if( i1 < i2 ) {
					return -1;
				} else if( i1 > i2) {
					return 1;
				} return 0;
				
			}
		});
		int[] answer = n.stream().mapToInt(i -> i).toArray();
		
		for(int i : answer) {
			System.out.print("많이 맞춘자 : ");
			System.out.println(i);
		}
		
		
		
	}

}

class S1 {
	static int search(int[] answerss) {
		int n = 0;
		for(int i = 0; i<answerss.length; i++) {
			System.out.print(i % 5 + 1);
			System.out.print(" " + answerss[i]);
			if(answerss[i] == (i % 5 + 1)) {
				System.out.println("정답");
				n++;
			} else { System.out.println(); }
		}
		return n;
	}
}
class S2 {
	static int search(int [] answerss) {
		int n = 0;
		int i = 0;
		int[] choose = {2, 1, 2, 3, 2 , 4, 2, 5};
		
		while(i < answerss.length) {
			System.out.print(choose[i]);
			System.out.print(" " + answerss[i]);
			if(choose[i] == answerss[i]) {
				System.out.println("정답");
				n++;
			} else { System.out.println(); }
			i++;
		}
		
		return n;
	}
}
class S3 {
	static int search(int [] answerss) {
		int n = 0;
		int i = 0;
		int[] choose = {3,3,1,1,2,2,4,4,5,5};
		
		while(i < answerss.length) {
			System.out.print(choose[i]);
			System.out.print(" " + answerss[i]);
			if(choose[i] == answerss[i]) {
				System.out.println("정답");
				n++;
			} else { System.out.println(); }
			i++;
		}
		
		return n;
	}
}
