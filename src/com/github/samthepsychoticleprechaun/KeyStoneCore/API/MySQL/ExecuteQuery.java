package com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;

public class ExecuteQuery {
	
	public static void executeQuery(String query) {
		
		Connection con = KeyStoneCore.con;
		Logger log = KeyStoneCore.log;
		
		try {
			PreparedStatement statement = con.prepareStatement(query);
			statement.executeQuery();
		} catch (SQLException e) {
			log.info("Error executing query!");
			e.printStackTrace();
		}
		
	}
	
	public static String getString (String query, int Int) {
		
		Connection con = KeyStoneCore.con;
		Logger log = KeyStoneCore.log;
		
		String string = null;
		
		try {
			PreparedStatement statement = con.prepareStatement(query);
			statement.executeQuery();
			string = statement.getResultSet().getString(Int);
		} catch (SQLException e) {
			log.info("Error executing query!");
			e.printStackTrace();
		}
		
		return string;
		
	}

}
