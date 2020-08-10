package ua.lviv.desctop.max;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateApp {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Date at now: " + date);

		System.out.println("Converted to LocalDate ---> " + convertToLocalDate(date));
		System.out.println("Converted to LocalTime ---> " + convertToLocalTime(date));
		System.out.println("Converted to LocalDateTime ---> " + convertToLocalDateTime(date));

	}

	public static LocalDate convertToLocalDate(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public static LocalTime convertToLocalTime(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
	}

	public static LocalDateTime convertToLocalDateTime(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

}
