package beginners_selection;

import java.util.Scanner;
public class PlacingMarbles {
	/*
	 * 問題：
	 * https://atcoder.jp/contests/abs/tasks/abc081_a
	 */
	public static void main(String args[]){
		String[] s;
		try(Scanner sc = new Scanner(System.in)){
			s = sc.next().split("");
		}
		int sum = 0;
	    for(String num:s){
	        sum+=Integer.parseInt(num);
	    }
	    System.out.println(sum);
	}
}
