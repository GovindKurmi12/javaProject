package com.gk;

public abstract class AccountManagement {
	private int id;
	private String name;

	public AccountManagement(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
}
