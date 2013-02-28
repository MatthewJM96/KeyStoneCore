package com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;

public class CreateTable {
	
	public static boolean createTable(String name, String columns) {
		
		String query = "CREATE TABLE IF NOT EXISTS " + name + "(" + columns + ")";
		Connection con = KeyStoneCore.con;
		Logger log = KeyStoneCore.log;
		
		try {
			PreparedStatement statement = con.prepareStatement(query);
			statement.executeQuery();
		} catch (SQLException e) {
			log.info("Error creating table " + name + "!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}

}
