package org.example;

import java.time.LocalDate;

public class Payday {
	private LocalDate date;
	private final int PAYDAY_TIME = 25;
	
	public Payday() {
		this(LocalDate.now());
	}
	
	public Payday(LocalDate currentLocalDate){
		this.date = currentLocalDate;
	}
	public int getNextPayday(){
		int today = date.getDayOfMonth();
		if(today > PAYDAY_TIME) {
			return date.getMonth().maxLength() - today + PAYDAY_TIME;
		} else {
			return PAYDAY_TIME - today;
		}
	}
}
