package com.github.samthepsychoticleprechaun.KeyStoneCore.API.General;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.bukkit.Bukkit;

public class TimeParser {
	
	public TimeParser() {
		return;
	}
	
	private static String CurDate;
	private int CurSeconds;
	private int CurMinutes;
	private int CurHours;
	private int CurDay;
	private int CurMonth;
	private int CurYear;
	private int AnySeconds;
	private int AnyMinutes;
	private int AnyHours;
	private int AnyDay;
	private int AnyMonth;
	private int AnyYear;

	Calendar anyCalendar = GregorianCalendar.getInstance();
	Calendar currentCal = GregorianCalendar.getInstance();
	static Date currentDate = new Date();
	
	/**
	 * Returns the current system time
	 * 
	 * @return
	 */
	public String getSystDate() {
		
		currentDate = new Date();
		CurDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(currentDate);
		return CurDate;
		
	}
	
	/**
	 * Returns the current system time (seconds only)
	 * 
	 * @return
	 */
	public int getSystTimeSeconds() {
		
		currentCal = GregorianCalendar.getInstance();
		CurSeconds = currentCal.get(Calendar.SECOND);
		return CurSeconds;
		
	}
	
	/**
	 * Returns the current system time (minutes only)
	 * 
	 * @return
	 */
	public int getSystTimeMinutes() {
		
		currentCal = GregorianCalendar.getInstance();
		CurMinutes = currentCal.get(Calendar.MINUTE);
		return CurMinutes;
		
	}

	/**
	 * Returns the current system time (hours only)
	 * 
	 * @return
	 */
	public int getSystTimeHours() {
		
		currentCal = GregorianCalendar.getInstance();
		CurHours = currentCal.get(Calendar.HOUR_OF_DAY);
		return CurHours;
	
	}
	
	/**
	 * Returns the current system time (days only)
	 * 
	 * @return
	 */
	public int getSystTimeDay() {
	
		currentCal = GregorianCalendar.getInstance();
		CurDay = currentCal.get(Calendar.DAY_OF_MONTH);
		return CurDay;
	
	}
	
	/**
	 * Returns the current system time (months only)
	 * 
	 * @return
	 */
	public int getSystTimeMonth() {
	
		currentCal = GregorianCalendar.getInstance();
		CurMonth = currentCal.get(Calendar.MONTH);
		return CurMonth;
	
	}
	
	/**
	 * Returns the current system time (years only)
	 * 
	 * @return
	 */
	public int getSystTimeYear() {
	
		currentCal = GregorianCalendar.getInstance();
		CurYear = currentCal.get(Calendar.YEAR);
		return CurYear;
	
	}
	
	/**
	 * Returns the given date (seconds only)
	 * 	
	 * @param string
	 * @return
	 */
	public int getThisTimeSeconds(String string) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(string);
		} catch (ParseException e) {
			Bukkit.getLogger().info("Error while getting the second!");
			e.printStackTrace();
		}
		anyCalendar.setTime(date);
		if (!(date == null)) {
			AnySeconds = anyCalendar.get(Calendar.SECOND);
		} else {
			AnySeconds = -1;
		}
		
		return AnySeconds;
		
	}

	/**
	 * Returns the given date (minutes only)
	 * 
	 * @param string
	 * @return 
	 */
	public int getThisTimeMinutes(String string) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(string);
		} catch (ParseException e) {
			Bukkit.getLogger().info("Error while getting the minute!");
			e.printStackTrace();
		}
		anyCalendar.setTime(date);
		if (!(date == null)) {
			AnyMinutes = anyCalendar.get(Calendar.MINUTE);
		} else {
			AnyMinutes = -1;
		}
		
		return AnyMinutes;
		
	}

	/**
	 * Returns the given date (hours only)
	 * 
	 * @param string
	 * @return
	 */
	public int getThisTimeHours(String string) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(string);
		} catch (ParseException e) {
			Bukkit.getLogger().info("Error while getting the hour!");
			e.printStackTrace();
		}
		anyCalendar.setTime(date);
		if (!(date == null)) {
			AnyHours = anyCalendar.get(Calendar.HOUR_OF_DAY);
		} else {
			AnyHours = -1;
		}
		
		return AnyHours;
		
	}

	/**
	 * Returns the given date (days only)
	 * 
	 * @param string
	 * @return 
	 */
	public int getThisTimeDay(String string) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(string);
		} catch (ParseException e) {
			Bukkit.getLogger().info("Error while getting the day!");
			e.printStackTrace();
		}
		anyCalendar.setTime(date);
		if (!(date == null)) {
			AnyDay = anyCalendar.get(Calendar.DAY_OF_MONTH);
		} else {
			AnyDay = -1;
		}
		
		return AnyDay;
		
	}

	/**
	 * Returns the given date (months only)
	 * 
	 * @param string
	 * @return 
	 */
	public int getThisTimeMonth(String string) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(string);
		} catch (ParseException e) {
			Bukkit.getLogger().info("Error while getting the month!");
			e.printStackTrace();
		}
		anyCalendar.setTime(date);
		if (!(date == null)) {
			AnyMonth = anyCalendar.get(Calendar.MONTH);
		} else {
			AnyMonth = -1;
		}
		
		return AnyMonth;
		
	}

	/**
	 * Returns the given date (years only)
	 * 
	 * @param string
	 * @return 
	 */
	public int getThisTimeYear(String string) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(string);
		} catch (ParseException e) {
			Bukkit.getLogger().info("Error while getting the year!");
			e.printStackTrace();
		}
		anyCalendar.setTime(date);
		if (!(date == null)) {
			AnyYear = anyCalendar.get(Calendar.YEAR);
		} else {
			AnyYear = -1;
		}
		
		return AnyYear;
		
	}
	
	/**
	 * Returns a time equal to the current system time increased by a value equal
	 * to the time period Int for the time scale String
	 * 
	 * @param Int
	 * @param timeScale
	 * @return
	 * Updated Time as a String
	 */
	public String updateTime(int timePeriod, String timeScale) {
		
		String newDate;
				
		Calendar calendarDate = GregorianCalendar.getInstance();
		calendarDate.setLenient(true);
		
		if (timeScale.equalsIgnoreCase("seconds")) {
			
			calendarDate.add(Calendar.SECOND, timePeriod);
			
		} else if (timeScale.equalsIgnoreCase("minutes")) {
			
			calendarDate.add(Calendar.MINUTE, timePeriod);
			
		} else if (timeScale.equalsIgnoreCase("hours")) {
			
			calendarDate.add(Calendar.HOUR_OF_DAY, timePeriod);
			
		} else if (timeScale.equalsIgnoreCase("days")) {
			
			calendarDate.add(Calendar.DAY_OF_MONTH, timePeriod);
			
		} else if (timeScale.equalsIgnoreCase("months")) {
			
			calendarDate.add(Calendar.MONTH, timePeriod);
			
		} else if (timeScale.equalsIgnoreCase("years")) {
			
			calendarDate.add(Calendar.YEAR, timePeriod);
			
		} 
		
		Date calDate = new Date();
		calDate = calendarDate.getTime();
		newDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(calDate);
		return newDate;
		
	}
	
	/**
	 * Compares the given system time to the current system time.
	 * 
	 * Returns: Boolean true is returned if the given system time is greater than the
	 * current system time and false if the given system time is equal to or less than
	 * the current system time.
	 * 
	 * @param string
	 * @return
	 */
	public boolean compareTimeToCurrent(String time) {
		
		Calendar calendarDate = GregorianCalendar.getInstance();
		Calendar givenDate = GregorianCalendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			Bukkit.getLogger().info("Error while getting the year!");
			e.printStackTrace();
		}
		givenDate.setTime(date);
		
		if (givenDate.compareTo(calendarDate) > 0) {
			
			return true;
			
		} else {
		
		return false;
		
		}
	}
	
	/**
	 * Compares the given system time to the current system time.
	 * 
	 * Returns: The integer difference in milliseconds from the given date to the
	 * current date. The integer will be greater than one if the current system time is
	 * greater and less than one if the given system time is greater. 0 is returned if
	 * the two system times are the same.
	 * 
	 * @param string
	 * @return
	 */
	public int timeDifferenceToCurrent(String string) {
		
		Calendar curDate = GregorianCalendar.getInstance();
		Calendar givenDate = GregorianCalendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(string);
		} catch (ParseException e) {
			Bukkit.getLogger().info("Error while getting the year!");
			e.printStackTrace();
		}
		givenDate.setTime(date);
		
		int curDateMillis = (int) curDate.getTimeInMillis();
		int givenDateMillis = (int) givenDate.getTimeInMillis();
		
		int timeDiff = curDateMillis - givenDateMillis;
		
		return timeDiff;
		
	}
	
}
