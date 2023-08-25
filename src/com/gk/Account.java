package com.gk;

import java.util.Objects;

public class Account {

	private double salary;

	public Account(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	

}
