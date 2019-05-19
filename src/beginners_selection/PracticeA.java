package beginners_selection;

import java.util.Scanner;

public class PracticeA {
	/*
	 * 問題：
	 * https://atcoder.jp/contests/abs/tasks/practice_1 
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b,c;
		String s;
		try(Scanner sc = new Scanner(System.in)){
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();
		    s = sc.next();
		}
	    System.out.println((a+b+c)+" "+s);
	}

}
