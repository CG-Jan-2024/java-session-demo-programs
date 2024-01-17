import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DateTimeDemo {

	
	// Date
	// From 1.8 , LocalDate, LocalDateTime, LocalTime
	public static void main(String[] args) {
		LocalDate todaysDate = LocalDate.now();
		System.out.println(todaysDate);
		LocalDateTime todaysDateTime = LocalDateTime.now();
		System.out.println(todaysDateTime);
		LocalTime todaysTime = LocalTime.now();
		System.out.println(todaysTime);
		
		LocalDate alteredDate = todaysDate.withYear(2022);
		System.out.println(alteredDate);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatedAlteredDate = dtf.format(alteredDate);
		System.out.println(formatedAlteredDate);
		
		
		Period period = todaysDate.until(alteredDate);
		System.out.println(Math.abs(period.getYears()));
	}

}
