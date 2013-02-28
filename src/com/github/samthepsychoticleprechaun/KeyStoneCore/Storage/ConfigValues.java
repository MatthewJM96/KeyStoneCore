package com.github.samthepsychoticleprechaun.KeyStoneCore.Storage;

import java.util.List;

public class ConfigValues {
	
	//MySQL Settings
	public static boolean usemysql;
	public static String user;
	public static String password;
	public static String hostname;
	public static String port;
	public static String database;
	
	//Global Settings
	public static int tempbanduration;
	public static int tempmuteduration;
	
	//Spam Settings
	public static int spamchatcount;
	public static int spamchatperiod;
	public static List<String> spampunsihmentorder;
	public static List<Integer> spamcounttopunish;
	public static List<String> spamuniquewarning;
	public static int spamtempbanduration;
	public static int spamtempmuteduration;
	
	//Foul Chat Settings
	public static int foulchatcount;
	public static int foulchatperiod;
	public static List<String> foulpunsihmentorder;
	public static List<Integer> foulcounttopunish;
	public static List<String> fouluniquewarning;
	public static int foultempbanduration;
	public static int foultempmuteduration;
	
}
