package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator;

import org.springframework.stereotype.Service;

@Service
public class FirstIsSmallerThanSecondDoubleComparator {
	public static boolean FirstIsSmallerThanSecond(double dbFirstDoubleToCompare, double dbSecondDoubleToCompare) {
		if (dbFirstDoubleToCompare < dbSecondDoubleToCompare) {
			return true;
		} else {
			return false;
		}
	}
}
