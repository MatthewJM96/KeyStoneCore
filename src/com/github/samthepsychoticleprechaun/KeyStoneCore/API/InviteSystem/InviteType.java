package com.github.samthepsychoticleprechaun.KeyStoneCore.API.InviteSystem;

import java.util.Arrays;
import java.util.List;

public class InviteType {

	public enum InvType {
		
		CHANNEL, GROUP, BUDDY;
		
		public static boolean isMember(InvType invType) {
			
			List<InvType> invTypesList = Arrays.asList(InvType.values());
			
			if (invTypesList.contains(invType)) {
				
				return true;
				
			}
			
			return false;
			
		}
		
	}
	
}
