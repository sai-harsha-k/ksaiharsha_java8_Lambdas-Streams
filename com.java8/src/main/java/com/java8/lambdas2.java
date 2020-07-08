package com.java8;
import java.util.*;
import java.util.stream.Collectors;
public class lambdas2 {
	public static void main(String[] args){
		List<String> sn=Arrays.asList("abc","abcd","ars","aha","harsha");
		System.out.println(search(sn));
		}
		public static List<String> search(List<String> sh) {
		return sh.stream()
		  .filter(s -> s.startsWith("a"))
		  .filter(s -> s.length() == 3)
		  .collect(Collectors.toList());

		}
}
