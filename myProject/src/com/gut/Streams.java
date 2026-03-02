package com.gut;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(2,12,34,56,67,8,9,5);
		//System.out.println(l);
		//filter()
		//l.stream().filter(i->i%2!=0).forEach(System.out::println);
		List l1=l.stream().filter(i->i%2!=0).collect(Collectors.toList());
		l1.forEach(System.out::println);
		
		System.out.println();
		//map()
		List<String> s=List.of("Java","Java FullStack","Spring ","Microservices ","Stream ");
		s.stream().map(String::toUpperCase).forEach(System.out::print);
		System.out.println();
		s.stream().map(String::toLowerCase).forEach(System.out::print);
		System.out.println();
		//s.stream().map(str->str.contains("S")).forEach(System.out::println);//false,tur,false,true
		s.stream().map("Java"::contains).forEach(System.out::print);
		System.out.println();
		//flatmap(),distinct().sorted()
		List<List<Integer>> lst= List.of(List.of(22,33,22,4,5,1,1,3,4),List.of(5,6,7,8));
		// When working with List<List<T>>, we must use flatMap()
		// to convert Stream<List<T>> into Stream<T>
		// before applying map() or filter() on individual elements.

		//but we can use it in filter(),map() both together.
		System.out.println("*******************");
		lst.stream().flatMap(lst1->lst1.stream()).map(l5->l5*3).filter(l4->l4%2!=0).distinct().forEach(System.out::println);
		System.out.println("*******************");
		System.out.println();
		lst.stream().flatMap(lst1->lst1.stream()).filter(ls->ls>20).distinct().sorted().forEach(System.out::println);
		//for custom sorting use Comparator-->Comparator.reverseOrder()
		//limit()
		System.out.println("******************");
		lst.stream().flatMap(lst1->lst1.stream())
		.distinct().peek(n->System.out.println(n)).sorted(Comparator.reverseOrder())
		.limit(6).peek(n->System.out.println(n)).forEach(System.out::println);
		
		System.out.println();
		List<String> sen = List.of(
			    "Java Stream API",
			    "flatMap is powerful");
		sen.stream()
			    .flatMap(s3 -> Arrays.stream(s3.split(" ")))
			    .forEach(System.out::println);

	}

}
