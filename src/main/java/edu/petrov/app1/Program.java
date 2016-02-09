package edu.petrov.app1;

/**
 * @author Anton Petrov
 */

import org.joda.time.*;

public class Program {
  
  public static void main(String[] args) {
    System.out.println(getLocalCurrentDate());
	}

	private static String getLocalCurrentDate() {
		LocalDate date = new LocalDate();
		return date.toString();
	}

}
