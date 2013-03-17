package com.github.samthepsychoticleprechaun.KeyStoneCore.BuddySystem;

import java.util.Arrays;
import java.util.List;

public class BuddyStatus {

	public enum BuddyType {
		
		FRIEND, IGNORE, ENEMY, NEUTRAL;
		
		public static boolean isMember(BuddyType buddyType) {
			
			List<BuddyType> invTypesList = Arrays.asList(BuddyType.values());
			
			if (invTypesList.contains(buddyType)) {
				
				return true;
				
			}
			
			return false;
			
		}
		
	}
	
}
