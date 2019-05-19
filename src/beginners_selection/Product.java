package beginners_selection;

import java.util.Scanner;

public class Product {

	/*
	 * 問題：
	 * https://atcoder.jp/contests/abs/tasks/abc086_a
	 */
	public static void main(String args[]){
		int product;
		try(Scanner sc = new Scanner(System.in)){
			product = sc.nextInt();
		    product *= sc.nextInt();
		}
	    if(product%2==0){
	    	System.out.print("Even");
	    }else{
	    	System.out.print("Odd");
	    }
	}
}
