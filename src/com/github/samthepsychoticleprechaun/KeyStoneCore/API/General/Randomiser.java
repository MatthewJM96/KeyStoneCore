package com.github.samthepsychoticleprechaun.KeyStoneCore.API.General;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randomiser {
	
	public Randomiser() {
		return;
	}
	
	/**
	 * Randomly chooses a value between 1 and 100. The first held value in the given list equal to or 
	 * less than the value of the randomly generated integer.
	 * Probabilities in the provided list act as weighting, where an index with a value held of 20 is
	 * less likely to be chosen to an index that holds a value of 40. Any number equal to or beyond
	 * 100 will not increase probability as it is certain to be chosen if no other higher priority 
	 * value is found to satisfy the generator.
	 * <p />
	 * Priority of a value is determined by its position in the used list, the lower the value of the
	 * index, the higher the priority. Once a held value is found to satisfy the generator
	 * the index of that value will be returned and no other values will be considered.
	 * <p />
	 * The sort function will order a list from lowest held value to highest held value, as such, the
	 * least likely values to satisfy the generator will be passed through first.
	 * 
	 * @param probabilities - The list of integers that have given probabilities equal to the held values for each index.
	 * @param sort - Should the list be ordered from least likely to most likely chosen values?
	 * @return An integer equal to the index of the probability that satisfies the generator.
	 */
	public int randomGenerator(List<Integer> probabilities, boolean sort) {
		
		int result = 0;
		
		Random r = new Random();
		int rand = r.nextInt(100);
		
		if (sort) {
			Integer[] array = (Integer[]) probabilities.toArray();
			Arrays.sort(array);
			probabilities = Arrays.asList(array);
		}
		
		Iterator<Integer> i = probabilities.iterator();
		
		boolean resultfound = false;
		
		while (resultfound == false && i.hasNext()) {
				
			int val = i.next();
				
			if (rand <= val) {
					
				result = probabilities.indexOf(val);
				resultfound = true;
				
			}
			
		}
		
		return result;
		
	}

}
