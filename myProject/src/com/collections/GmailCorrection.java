package com.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailCorrection {

	public static void main(String[] args) {
		List<String> l= Arrays.asList("abc@gmail.com","edf@gmail.com","abc@gmail.com",
				"ghil12gmail.com","ukl56@gmailcom","xyz@gmailcom");
		
		List<String> wrong=new ArrayList<>();
		List<String> duplicate=new ArrayList<>();
		List<String> unique=new ArrayList<>();
		Set<String> seen=new HashSet<>();
		String regx="^[A-Za-z0-9+_.-]+@gmail\\.com$";
		Pattern p=Pattern.compile(regx);
		for(String list:l) {
			Matcher m=p.matcher(list);
			//System.out.println(list);
			if(!m.matches()) {
				wrong.add(list);
			}else if(!seen.add(list)) {
				duplicate.add(list);
			}else {
				unique.add(list);
			}
		}
		System.out.println("Wrong Emails      : "+wrong);
		System.out.println("Unique Emails     : "+unique);
		System.out.println("Duplicate Emails  : "+duplicate);

	}

}
