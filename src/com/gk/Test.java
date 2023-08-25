package com.gk;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Account account = new Account(300);
		Account account1 = new Account(300);

		Map<Account, String> map = new HashMap<>();
		map.put(account, "one");
		map.put(account1, "one");

		System.out.println(map.size());

		String s1 = "12";
		String s2 = "12";

		Map<String, String> map1 = new HashMap<>();
		map1.put(s1, "one");
		map1.put(s2, "one");

		System.out.println(map1.size());

	}

}
