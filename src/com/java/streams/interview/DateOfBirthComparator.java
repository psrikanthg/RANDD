package com.java.streams.interview;

import java.util.Comparator;

public class DateOfBirthComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.getDateOfBirth() == null && arg1.getDateOfBirth() == null) {
			return 0;
		}else if(arg0.getDateOfBirth() == null) {
			return -1;
		}else if(arg1.getDateOfBirth() == null) {
			return 1;
		}
		return arg0.getDateOfBirth().compareTo(arg1.getDateOfBirth());
	}

	
	
}
