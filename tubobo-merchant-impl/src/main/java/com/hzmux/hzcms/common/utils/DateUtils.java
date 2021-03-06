/**
 * Copyright &copy; 2012-2013 <a href="http://www.hzmux.com">hzmux</a> All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.hzmux.hzcms.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang.time.DateFormatUtils;

/**
 * 日期工具类, 继承org.apache.commons.lang.time.DateUtils类
 * @author Song
 * @version 2014-10-01
 */
public class DateUtils extends org.apache.commons.lang.time.DateUtils {
	
	private static String[] parsePatterns = { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", 
		"yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm" };

	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd）
	 */
	public static String getDate() {
		return getDate("yyyy-MM-dd");
	}
	
	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String getDate(String pattern) {
		return DateFormatUtils.format(new Date(), pattern);
	}
	
	/**
	 * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String formatDate(Date date, Object... pattern) {
		String formatDate = null;
		if (pattern != null && pattern.length > 0) {
			formatDate = DateFormatUtils.format(date, pattern[0].toString());
		} else {
			formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
		}
		return formatDate;
	}
	
	/**
	 * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String formatDateTime(Date date) {
		return formatDate(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到当前时间字符串 格式（HH:mm:ss）
	 */
	public static String getTime() {
		return formatDate(new Date(), "HH:mm:ss");
	}

	/**
	 * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String getDateTime() {
		return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到当前年份字符串 格式（yyyy）
	 */
	public static String getYear() {
		return formatDate(new Date(), "yyyy");
	}

	/**
	 * 得到当前月份字符串 格式（MM）
	 */
	public static String getMonth() {
		return formatDate(new Date(), "MM");
	}

	/**
	 * 得到当天字符串 格式（dd）
	 */
	public static String getDay() {
		return formatDate(new Date(), "dd");
	}

	/**
	 * 得到当前星期字符串 格式（E）星期几
	 */
	public static String getWeek() {
		return formatDate(new Date(), "E");
	}
	
	/**
	 * 日期型字符串转化为日期 格式
	 * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", 
	 *   "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm" }
	 */
	public static Date parseDate(Object str) {
		if (str == null){
			return null;
		}
		try {
			return parseDate(str.toString(), parsePatterns);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 获取过去的天数
	 * @param date
	 * @return
	 */
	public static long pastDays(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(24*60*60*1000);
	}
	
    
	public static Date getDateStart(Date date) {
		if(date==null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date= sdf.parse(formatDate(date, "yyyy-MM-dd")+" 00:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Date getDateEnd(Date date) {
		if(date==null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date= sdf.parse(formatDate(date, "yyyy-MM-dd") +" 23:59:59");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Date getTodayStart() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		try {
			date = sdf.parse(formatDate(date, "yyyy-MM-dd")+" 00:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Date getTodayEnd() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		try {
			date = sdf.parse(formatDate(date, "yyyy-MM-dd") +" 23:59:59");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date getYesterdayStart() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = addDays(new Date(), -1);
		try {
			date = sdf.parse(formatDate(date, "yyyy-MM-dd")+" 00:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Date getYesterdayEnd() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = addDays(new Date(), -1);
		try {
			date = sdf.parse(formatDate(date, "yyyy-MM-dd") +" 23:59:59");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static int countSecondsFromNowToTodayEnd() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		try {
			date = sdf.parse(formatDate(date, "yyyy-MM-dd") +" 23:59:59");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return (int)(date.getTime() - System.currentTimeMillis())/1000;
	}

	/**
	 * 计算两个日期之间的天数 小于1天按1天计算
	 */
	public static int countDaysBetweenTwoDay(Date begin,Date end) {
		if (begin == null || end == null || end.before(begin)) {
			return 0;
		}
		begin = getDateStart(begin);
		end = getDateStart(end);
		long days = (end.getTime()-begin.getTime())/(1000*3600*24) + 1;
        return (int) days;
	}
	/**
	 * 判断当前时分秒是否在endTime的时分秒之后
	 * @param beginTime，格式如 21:00:00
	 * @return
	 */
	public static boolean isAfterBeginTimeInOneDay(String beginTime){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		Date beginDate;
		try {
			beginDate = sdf.parse(formatDate(now, "yyyy-MM-dd ") + beginTime);
			//TODO
			return now.getTime() > beginDate.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return true;
		}
	}

	/**
	 * 获取月份起始日期
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getMinMonthDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		//calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND,0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date sdate = calendar.getTime();
		//calendar.set
		return calendar.getTime();
	}


	/**
	 * 判断当前时分秒是否在endTime的时分秒之前
	 * @param endTime，格式如 08:00:00
	 * @return
     */
	public static boolean isBeforeEndTimeInOneDay(String endTime){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		Date endDate;
		try {
			endDate = sdf.parse(formatDate(now, "yyyy-MM-dd ") + endTime);
			return now.getTime() < endDate.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return true;
		}
	}

	public static Date getDaysBefore(Date originalDay,int days){
		long pastMilSeconds = originalDay.getTime() - days*24*60*60*1000;
		Date d = new Date(pastMilSeconds);
		return d;
	}

	/**
	 * 得到当前时间之后的年月日以及任何十分秒
	 * @param currentDate
	 * @param days
	 * @param time "00:00:00"
	 * @return
	 */
	public static String getDaysAfter(Date currentDate, int days, String time){
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(Calendar.DATE, +days);
		Date date = calendar.getTime();
		return formatDate(date, "yyyy-MM-dd") + " " + time;
	}

	public static String getHourAfter(Date currentDate, int hour){
		return formatDateTime(getHourAfterOfDate(currentDate,hour));
	}
	public static Date getHourAfterOfDate(Date currentDate, int hour){
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(Calendar.HOUR_OF_DAY, hour);
		Date date = calendar.getTime();
		return date;
	}
	/**
	 * 获取俩个date之间的分钟数 向上取整,小于0返回0
	 */
	public  static double getMinuteBetweenTwoDate(Date afterDate,Date beforeDate){
		if (afterDate.before(beforeDate)){
			return 0.0;
		}
		double minute=(afterDate.getTime()-beforeDate.getTime())/(1000*60.0);
		System.out.println(minute);
		double ceil = Math.ceil(minute);
		return ceil;
	}
	public static void main(String[] args) throws ParseException {

		Date minMonthDate = getMinMonthDate(DateUtils.addMonths(new Date(),-3));
		System.out.println(minMonthDate);
//		System.out.println(formatDate(parseDate("2010/3/6")));
//		System.out.println(getDate("yyyy年MM月dd日 E"));
//		long time = new Date().getTime()-parseDate("2012-11-19").getTime();
//		System.out.println(time/(24*60*60*1000));
//		System.out.println(countSecondsFromNowToTodayEnd());
//		System.out.println(isBeforeEndTimeInOneDay("20:00:00"));
//		System.out.println(isAfterBeginTimeInOneDay("08:00:00"));
//
//		System.out.println(getDaysBefore(new Date(),3));

//		Calendar calendar = new GregorianCalendar();
//		calendar.setTime(new Date());
//		calendar.add(Calendar.DATE, +1);
//		Date date = calendar.getTime();
//		Date date1 = date;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String  adate="2017-08-24 16:31:02";
		String  bdate="2017-08-24 16:31:03";
		Date parse = simpleDateFormat.parse(adate);
		Date parse1 = simpleDateFormat.parse(bdate);
		double minuteBetweenTwoDate = getMinuteBetweenTwoDate(parse1, parse);
		System.out.println(minuteBetweenTwoDate);




//		date = simpleDateFormat.parse(formatDate(date, "yyyy-MM-dd") +" 23:59:59");
//		date1 = simpleDateFormat.parse(formatDate(date1, "yyyy-MM-dd") +" 00:00:00");
////		System.out.println(simpleDateFormat.format(date));
////		System.out.println(simpleDateFormat.format(date1));
////		String datet1 = simpleDateFormat.format(date);
////		String datet2 = simpleDateFormat.format(date1);
////		Date d1 = simpleDateFormat.parse(datet1);
////		Date d2 = simpleDateFormat.parse(datet2);
////		System.out.println(d2 + ", " + d1);
////		System.out.println(d2.before(d1));
//
//		System.out.println(formatDate(date, "yyyy-MM-dd") +" 23:59:59");
//		System.out.println(date);
//
//		System.out.println(getDaysAfter(new Date(), 1 , "23:59:59"));

		System.out.println(getHourAfterOfDate(new Date(),-1));

	}
}
