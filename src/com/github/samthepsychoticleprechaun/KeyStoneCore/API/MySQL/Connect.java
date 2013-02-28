package com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.ConfigValues;

public class Connect {
	
	public static boolean openConnection(Connection con) {
		
		Logger log = KeyStoneCore.log;
		String user = ConfigValues.user;
		String password = ConfigValues.password;
		String hostname = ConfigValues.hostname;
		String port = ConfigValues.port;
		String database = ConfigValues.database;
		
		String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
		
		try {
			con = DriverManager.getConnection(url, user, password);			
		} catch (Exception e) {
			log.info("Error connecting to database!");
			e.printStackTrace();
			return false;
		}
		
		log.info("Succesfully connected to database!");
		return true;
				
	}
	
	public static boolean closeConnection(Connection con) {

		Logger log = KeyStoneCore.log;
		
		try {
			con.close();
		} catch (Exception e) {
			log.info("Error closing connection to database!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
}
