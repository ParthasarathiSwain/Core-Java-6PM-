package DateTimeApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test01 {
	
	public static void main(String[] args) {
		LocalDate	currentDate=LocalDate.now();
		System.out.println(currentDate); //YYYY-MM-DD
		
		LocalTime mid=LocalTime.MIDNIGHT;
		System.out.println(mid);
		
		LocalTime max=LocalTime.MAX;
		System.out.println(max);
		
		LocalTime min=LocalTime.MIN;
		System.out.println(min);
		
		LocalTime currTime=LocalTime.now();
		System.out.println(currTime);
		
		LocalDateTime today=LocalDateTime.now();
		System.out.println(today);
		
		
		ZonedDateTime timeZone=ZonedDateTime.now();
		System.out.println(timeZone);
		
		
		LocalDate checkIn=LocalDate.of(2025, 8, 1);
		LocalDate checkOut=LocalDate.of(2025, 8, 4);
		
		Period stayPeriod=Period.between(checkIn, checkOut);
		
		System.out.println(stayPeriod.getDays());
		
		LocalTime start=LocalTime.of(11, 0);
		LocalTime end=LocalTime.of(18, 0);
		
		Duration dur=Duration.between(start, end);
		System.out.println(dur.toHours());
		System.out.println(dur.toMinutes());
		System.out.println(dur.toSeconds());
		System.out.println("----------------");
		//DateTimeFormatter
		
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter newFormat=
				DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		System.out.println(newFormat);
		
		String newf=now.format(newFormat);
		
		System.out.println(newf);
		
		
		String s="04-08-2025";
		DateTimeFormatter formmater=
				DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate ldt=LocalDate.parse(s, formmater);
		
		System.out.println(ldt);
	}
}







