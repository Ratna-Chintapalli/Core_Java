package com.gut;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		List<Person> l = List.of(new Person("Anu", 50000, 10, LocalDate.of(2012, 02, 21), "Active"),
				new Person("Arha", 50000, 20, LocalDate.of(2015, 3, 17), "InActive"),
				new Person("Ram", 40000, 20, LocalDate.of(2019, 8, 3), "Active"),
				new Person("Abhi", 60000, 30, LocalDate.now(), "Active"),
				new Person("Abhi", 80000, 10, LocalDate.of(2008, 2, 25), "InActive"),
				new Person("banu", 70000, 20, LocalDate.of(2025, 3, 2), "InActive"),
				new Person("Srijaa", 50000, 20, LocalDate.of(2016, 3, 17), "InActive"),
				new Person("Ramya", 40000, 20, LocalDate.of(2017, 8, 3), "Active"),
				new Person("Rishi", 60000, 30, LocalDate.of(2022, 9, 20), "Active"),
				new Person("Rupa", 80000, 10, LocalDate.of(2018, 2, 25), "InActive"),
				new Person("Akshitha", 70000, 20, LocalDate.of(2024, 3, 2), "InActive"));
		l.stream().filter(s -> s.getSal() >= 50000 && s.getName().startsWith("A"))
				.map(p -> p.getName() + " - " + p.getDept()).
				distinct().sorted().forEach(System.out::println);
		
		
		l.stream().filter(s -> s.getStatus().equals("Active"))
					.distinct().sorted()
					.limit(5).forEach(System.out::println);
					
	}

}
