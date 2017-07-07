/**
 * 
 */
package edu.cnm.deepdive.anonymous;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author davem
 *
 */
public class Comparison implements Comparable<Comparison> {
	
	public final int age;
	public final int height;
	
	public Comparison (int age, int height) {
		this.age = age;
		this.height = height;
	}

	@Override
	public int compareTo(Comparison other) {

		
		return Integer.compare(age, other.age);
	}
	
	@Override
	public String toString() {
		return String.format("{age: %d, height: %d}",  age, height);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Comparison c1 = new Comparison(10, 60);
		Comparison c2 = new Comparison(12, 60);
		Comparison c3 = new Comparison(15, 55);
		Comparison[] things = {c1, c2, c3};
		Arrays.sort(things);
		System.out.println(Arrays.toString(things));
//		Arrays.sort(things, new Comparator<Comparison>() {
//
//			@Override
//			public int compare(Comparison c1, Comparison c2) {
//		
//				return Integer.compare(c1.height,  c2.height);
//			}
//			
//		});
		Arrays.sort(things,( d1, d2) -> Integer.compare(d1.height, d2.height));
		System.out.println(Arrays.toString(things));
	}

	
	
	

}
