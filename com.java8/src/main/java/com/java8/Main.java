package com.java8;
import java.util.*;
public class Main {
	public static void main(String[] args){
		final List<Integer> primes=Arrays.asList(1,82,3,40,5,16,71,18,9,10,11,12,19,1,15);
		primes.stream()
		         .mapToInt(i->i)
		         .average()
		         .ifPresent(avg->System.out.println(avg));
		    }
}
