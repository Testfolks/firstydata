package com.naukri.Utilities;

import java.time.LocalDate;

public class Date {

	public LocalDate LocalDateposted(String posteddate) {
		LocalDate date = LocalDate.now();
		String[] arrOfStr = posteddate.split(" ", -2);
		try {
			int iTest = Integer.parseInt(arrOfStr[0]);
			date = LocalDate.now().minusDays(iTest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

}
